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
import com.kms.katalon.core.util.KeywordUtil

public class paymentPage {
	static final TestObject PLACE_ORDER_TITLE = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//p[@class='_15kd2we7k   _15r4f4dgo   _17zx15t8w _17zx15te8 _17zx15t28']")
	static final TestObject TOTAL_PAYMENT = new TestObject().addProperty('css', ConditionType.EQUALS, ".wovzo5a._15r4f4d1pj > #base > div:nth-of-type(2) > #base > #base > #base")

	static void verifyPaymentAmount() {
		String actualAmount = WebUI.getText(TOTAL_PAYMENT)
		KeywordUtil.logInfo("Expected Amount: " + GlobalVariable.summaryAmount + ", Actual Amount: " + actualAmount)
		assert GlobalVariable.summaryAmount == actualAmount
	}

	static void verifyOrderSuccess() {
		WebUI.waitForPageLoad(5)
		WebUI.verifyElementVisible(PLACE_ORDER_TITLE)
		WebUI.takeFullPageScreenshotAsCheckpoint('ORDER HAS BEEN PLACED')
	}
}
