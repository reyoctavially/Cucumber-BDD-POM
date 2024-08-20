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

public class loginPage {

	static final TestObject EMAIL_INPUT = new TestObject().addProperty('name', ConditionType.EQUALS, 'identifier')
	static final TestObject PASSWORD_INPUT = new TestObject().addProperty('name', ConditionType.EQUALS, 'password')
	static final TestObject LOGIN_BUTTON_NAVIGATE = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//button[@class='_920fuu5 _920fuue _920fuub _920fuu6 _3syuln7']")
	static final TestObject LOGIN_BUTTON = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//button[@class='_920fuu5 _920fuuf _920fuub _920fuu6 x63gt40']")

	static void clickLoginButtonToNavigate() {
		WebUI.delay(2)
		WebUI.waitForElementClickable(LOGIN_BUTTON_NAVIGATE, 30)
		WebUI.click(LOGIN_BUTTON_NAVIGATE)
	}

	static void enterEmail(String email) {
		WebUI.waitForElementVisible(EMAIL_INPUT, 30)
		WebUI.setText(EMAIL_INPUT, email)
	}

	static void enterPassword(String password) {
		WebUI.waitForElementVisible(PASSWORD_INPUT, 30)
		WebUI.setText(PASSWORD_INPUT, password)
	}

	static void clickLoginButton() {
		WebUI.waitForElementClickable(LOGIN_BUTTON, 30)
		WebUI.click(LOGIN_BUTTON)
	}
}
