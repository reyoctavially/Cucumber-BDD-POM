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
import org.openqa.selenium.WebDriver
import org.openqa.selenium.interactions.Actions
import com.kms.katalon.core.webui.driver.DriverFactory

public class homePage {
	static final TestObject HOMEPAGE_LOGO = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//div[@class='j1jih74b j1jih7ak      _15kd2weg']//img[@alt='voila logo']")
	static final TestObject SECTION_TITLE = new TestObject().addProperty('id', ConditionType.EQUALS, 'base')
	static final TestObject SHOPPING_BAG_ICON = new TestObject().addProperty('css', ConditionType.EQUALS, "[data-test-id='CT-Go-To-Cart']")

	static void open() {
		RunConfiguration.setWebDriverPreferencesProperty("args", ["--window-size=1280,1024", "--incognito"])
		WebUI.enableSmartWait()
		WebUI.openBrowser('')
		WebUI.navigateToUrl(GlobalVariable.homePageUrl)
	}

	static void verifyHomePage() {
		WebUI.waitForPageLoad(5)
		WebUI.verifyElementPresent(HOMEPAGE_LOGO, 30)
		WebUI.takeFullPageScreenshotAsCheckpoint('WELCOME TO HOME PAGE')
	}

	static void selectCategory(String category) {
		TestObject CATEGORY_BUTTON = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//a[.='" + category + "']")
		WebUI.waitForElementClickable(CATEGORY_BUTTON, 30)
		WebUI.click(CATEGORY_BUTTON)
		WebUI.delay(2)
	}

	static void selectProductCategory(String productCategory) {
		TestObject PRODUCT_CATEGORY_BUTTON = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//a[.='" + productCategory + "']")
		WebUI.waitForElementClickable(PRODUCT_CATEGORY_BUTTON, 30)
		WebUI.click(PRODUCT_CATEGORY_BUTTON)

		WebDriver driver = DriverFactory.getWebDriver()
		Actions actions = new Actions(driver)
		actions.moveByOffset(10, 10).perform()

		WebUI.delay(2)
		WebUI.waitForElementVisible(SECTION_TITLE, 30)
	}

	static void clickShoppingBagButton() {
		WebUI.click(SHOPPING_BAG_ICON)
		WebUI.delay(2)
	}
}
