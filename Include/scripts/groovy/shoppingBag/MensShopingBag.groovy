package shoppingBag
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import pageObjectModel.homePage
import pageObjectModel.productPage
import pageObjectModel.productDetailPage
import pageObjectModel.shoppingBagPage

class MensShopingBag {
	@Given("Customer chooses the {string} category")
	def chooseCategory(String category) {
		homePage.selectCategory(category)
	}

	@When("Customer selects {string} from product categories")
	def selectProductCategory(String productCategory) {
		homePage.selectProductCategory(productCategory)
	}

	@And("Customer applies filters product categories {string}, {string}, and {string}")
	def applyCategoryFilters(String product1, String product2, String product3) {
		productPage.setProductFilter(product1)
		productPage.setProductFilter(product2)
		productPage.setProductFilter(product3)
	}

	@And("Customer clicks the all filters button")
	def clickAllFiltersButton() {
		productPage.clickAllFilterButton()
	}

	@And("Customer applies a price filter for products below {string}")
	def applyPriceFilter(String price) {
		productPage.setPriceFilter(price)
	}

	@And("Customers see a list of products based on filters")
	def seeProduct() {
		productPage.seeProduct()
	}

	@And("Customer selects an available product")
	def selectAvailableProduct() {
		productPage.selectProduct()
	}

	@And("Customer is on the product detail page")
	def verifyProductDetailPage() {
		productDetailPage.verifyProductDetail()
	}

	//	@And("Customer chooses an available product size")
	//	def chooseProductSize() {
	//		productDetailPage.selectProductSize()
	//	}

	@And("Customer clicks the add to bag button")
	def clickAddToBagButton() {
		productDetailPage.clickAddToBagButton()
	}

	@Then("Customer should see the product successfully added to the shopping bag")
	def verifyProductAddedToShoppingBag() {
		homePage.clickShoppingBagButton()
		shoppingBagPage.verifyProduct()
	}
}