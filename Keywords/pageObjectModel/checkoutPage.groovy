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

public class checkoutPage {

	static final TestObject SHIPPING_METHOD = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//div[@id='shipping-list']/div[@id='base']")
	static final TestObject SHIPPING_CONFIRM_BUTTON = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//button[.='Confirm']")
	static final TestObject LIST_PAYMENT_METHOD = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//div[@id='payment-list']/div[@id='base']")
	static final TestObject PAYMENT_CONFIRM_BUTTON = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//button[contains(.,'Confirm Payment Method')]")
	static final TestObject ORDER_SUMMARY_TITLE = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//p[@class='_17zx15t9c _17zx15t8x _17zx15t4g _17zx15tgg _17zx15te8']")
	static final TestObject ORDER_AMOUNT = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//p[@class='_15kd2we68      _17zx15tgg _17zx15t9s _17zx15te8']")
	static final TestObject PLACE_ODER_BUTTON = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//button[@class='_920fuu5 _920fuuf _920fuub _920fuu6']")

	static void selectShippingMethod(String shippingMethod) {
		TestObject SHIPPING_SERVICES = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//div[.='" + shippingMethod + "']")
		WebUI.click(SHIPPING_METHOD)
		WebUI.click(SHIPPING_SERVICES)
		WebUI.click(SHIPPING_CONFIRM_BUTTON)
		WebUI.delay(3)
	}

	static void selectPaymentMethod(String paymentMethod, String paymentMethodSelection) {
		TestObject PAYMENT_METHOD = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//p[.='" + paymentMethod + "']")
		TestObject SELECT_PAYMENT_METHOD = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//p[.='" + paymentMethodSelection + "']")
		WebUI.scrollToElement(LIST_PAYMENT_METHOD, 0)
		WebUI.click(LIST_PAYMENT_METHOD)
		WebUI.click(PAYMENT_METHOD)
		WebUI.click(SELECT_PAYMENT_METHOD)
		WebUI.click(PAYMENT_CONFIRM_BUTTON)
		WebUI.delay(2)
	}

	static void verifyOrderSummary() {
		WebUI.waitForPageLoad(5)
		WebUI.verifyElementPresent(ORDER_SUMMARY_TITLE, 30)

		String amount = WebUI.getText(ORDER_AMOUNT)
		GlobalVariable.summaryAmount = amount

		WebUI.takeFullPageScreenshotAsCheckpoint('ORDER SUMMARY')
	}

	static void clickPlaceOrderButton() {
		WebUI.click(PLACE_ODER_BUTTON)
		WebUI.delay(2)
	}
}
