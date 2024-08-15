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

public class homePage {
	static final TestObject HOMEPAGE_LOGO = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="base"]/img')

	static void open() {
		RunConfiguration.setWebDriverPreferencesProperty("args", ["--window-size=1280,1024", "--incognito"])
		WebUI.enableSmartWait()
		WebUI.openBrowser('')
		WebUI.navigateToUrl(GlobalVariable.homePageUrl)
	}

	static void seeHomePageLogo() {
		WebUI.delay(5)
		WebUI.verifyElementPresent(HOMEPAGE_LOGO, 30)
		WebUI.takeFullPageScreenshotAsCheckpoint('WELCOME TO HOME PAGE')
	}

	static void selectCategory(String category) {
	}

	static void selectProductCategory(String productCategory) {
	}

	static void clickShoppingBagButton() {
	}
}
