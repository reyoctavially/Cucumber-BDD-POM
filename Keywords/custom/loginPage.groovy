package custom

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

public class loginPage {
	static final String LOGIN_PAGE_URL = 'https://example.com/login'
	static final String USERNAME_INPUT = 'Object Repository/LoginPage/Username_Input'
	static final String PASSWORD_INPUT = 'Object Repository/LoginPage/Password_Input'
	static final String LOGIN_BUTTON = 'Object Repository/LoginPage/Login_Button'
	static final String DASHBOARD_ELEMENT = 'Object Repository/Dashboard/Welcome_Message'

	static void open() {
		WebUI.openBrowser(LOGIN_PAGE_URL)
	}

	static void enterUsername(String username) {
		WebUI.setText(findTestObject(USERNAME_INPUT), username)
	}

	static void enterPassword(String password) {
		WebUI.setText(findTestObject(PASSWORD_INPUT), password)
	}

	static void clickLoginButton() {
		WebUI.click(findTestObject(LOGIN_BUTTON))
	}
	
	static void seeDashboardElement() {
		WebUI.verifyElementPresent(findTestObject(DASHBOARD_ELEMENT), 10)
	}
}
