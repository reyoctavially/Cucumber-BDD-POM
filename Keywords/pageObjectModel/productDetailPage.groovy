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

public class productDetailPage {

	static final TestObject PRODUCT_TITLE = new TestObject().addProperty('class', ConditionType.EQUALS, "_17zx15t9s _17zx15t6q _17zx15tgg _17zx15the")
	static final TestObject BAG_BUTTON = new TestObject().addProperty('xpath', ConditionType.EQUALS, "(//*[@id='base']/button)[3]")

	static void verifyProductDetail() {
		WebUI.verifyElementVisible(PRODUCT_TITLE)
		WebUI.takeFullPageScreenshotAsCheckpoint('PRODUCT DETAIL')
	}

	//	static void selectProductSize() {
	//
	//	}

	static void clickAddToBagButton() {
		WebUI.scrollToElement(PRODUCT_TITLE, 0)
		WebUI.click(BAG_BUTTON)
		WebUI.delay(2)
	}
}
