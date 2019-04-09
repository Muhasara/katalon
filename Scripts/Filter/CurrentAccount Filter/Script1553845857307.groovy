import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('1 - Login Success - C3'), [:], FailureHandling.STOP_ON_FAILURE)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/Current-Accounts'), 5) == true) {
    WebUI.click(findTestObject('Object Repository/HomePage/Current-Accounts'))
} else {
    WebUI.click(findTestObject('Object Repository/HomePage/Descripton'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Object Repository/HomePage/Current-Accounts'))
}

WebUI.setText(findTestObject('Object Repository/Filter/input_f_currentAccountName'), 'Cari Hesap')

WebUI.setText(findTestObject('Object Repository/Filter/input_f_tc'), '11111111111')

WebUI.setText(findTestObject('Object Repository/Filter/input_f_taxNumber'), '123456789')

WebUI.setText(findTestObject('Object Repository/Filter/input_f_iban'), 'TR121234123412341234123412')

WebUI.setText(findTestObject('Object Repository/Filter/input_f_bankAccountNumber'), '110110110110')

WebUI.click(findTestObject('Object Repository/Filter/button_f_search'))

WebUI.delay(2)

WebUI.closeBrowser()