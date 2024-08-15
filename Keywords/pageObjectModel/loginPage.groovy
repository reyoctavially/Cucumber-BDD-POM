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

public class loginPage {
	
	static final TestObject EMAIL_INPUT = new TestObject().addProperty('id', ConditionType.EQUALS, 'txt_email')
    static final TestObject PASSWORD_INPUT = new TestObject().addProperty('id', ConditionType.EQUALS, 'txt_password')
    static final TestObject LOGIN_BUTTON = new TestObject().addProperty('id', ConditionType.EQUALS, 'btn_login')
    static final TestObject DASHBOARD_ELEMENT = new TestObject().addProperty('id', ConditionType.EQUALS, 'txt_dashboard')

    static void open() {
        WebUI.enableSmartWait()
        WebUI.openBrowser('')
        WebUI.navigateToUrl('https://voila.id/account/login')
        WebUI.maximizeWindow()
    }

    static void enterEmail(String email) {
        WebUI.waitForElementVisible(EMAIL_INPUT, 10)
        WebUI.setText(EMAIL_INPUT, email)
    }

    static void enterPassword(String password) {
        WebUI.waitForElementVisible(PASSWORD_INPUT, 10)
        WebUI.setText(PASSWORD_INPUT, password)
    }

    static void clickLoginButton() {
        WebUI.click(LOGIN_BUTTON)
    }
    
    static void seeDashboardElement() {
        WebUI.verifyElementPresent(DASHBOARD_ELEMENT, 10)
    }
}
