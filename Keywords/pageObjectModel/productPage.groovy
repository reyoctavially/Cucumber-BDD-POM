package pageObjectModel

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.configuration.RunConfiguration
import org.openqa.selenium.Keys

public class productPage {

	static final TestObject CATEGORY_SECTION = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//div[.='Category']")
	static final TestObject ALL_FILTER_SECTION = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//p[.='All Filters']")
	static final TestObject PRICE_RANGE_SECTION = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//div[.='Price Range']")
	static final TestObject PRICE_INPUT = new TestObject().addProperty('xpath', ConditionType.EQUALS, "(//input[@id='price-input'])[2]")


	static void setProductFilter(String product) {
		TestObject PRODUCT_CATEGORY = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//div[@id='vds-accordion-root']//p[.='" + product + "']")
		WebUI.scrollToElement(CATEGORY_SECTION, 30)
		WebUI.click(PRODUCT_CATEGORY)
		WebUI.delay(3)
	}

	static void setPriceFilter(String price) {
		WebUI.scrollToElement(PRICE_RANGE_SECTION, 30)
		WebUI.click(PRICE_INPUT)
		WebUI.clearText(PRICE_INPUT)
		WebUI.setText(PRICE_INPUT, price)
		WebUI.sendKeys(PRICE_INPUT, price)
		WebUI.delay(3)
	}

	static void clickAllFilterButton() {
		WebUI.scrollToElement(ALL_FILTER_SECTION, 0)
		WebUI.waitForElementClickable(ALL_FILTER_SECTION, 30)
		WebUI.click(ALL_FILTER_SECTION)
		WebUI.delay(3)
	}

	static void selectProduct() {
		WebUI.waitForPageLoad(10)
		WebUI.takeFullPageScreenshotAsCheckpoint('DISPLAY PRODUCT')
	}
}
