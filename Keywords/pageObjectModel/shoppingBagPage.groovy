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

public class shoppingBagPage {
	
	static final TestObject SECTION_TITLE = new TestObject().addProperty('class', ConditionType.EQUALS, '_15r4f4daf   _17zx15te8 _17zx15ths _17zx15t80 _17zx15t4g')
	static final TestObject CHECKOUT_BUTTON = new TestObject().addProperty('xpath', ConditionType.EQUALS, "(//*[@id='base']/button)[1]")
	 
	static void verifyProduct() {
		WebUI.verifyElementPresent(SECTION_TITLE, 30)
		WebUI.takeFullPageScreenshotAsCheckpoint('Shopping Bag')
	}

	static void clickCheckoutButton() {
		WebUI.scrollToElement(CHECKOUT_BUTTON, 0)
		WebUI.click(CHECKOUT_BUTTON)
		WebUI.delay(3)
	}
}
