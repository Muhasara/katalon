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

if (WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/Bank-Accounts'), 15) == true) {
    WebUI.click(findTestObject('Object Repository/HomePage/Bank-Accounts'))
} else {
    WebUI.click(findTestObject('Object Repository/HomePage/Descripton'))

    WebUI.click(findTestObject('Object Repository/HomePage/Bank-Accounts'))
}

WebUI.click(findTestObject('General/button_operation'))

WebUI.click(findTestObject('General/li_Add-New'))

WebUI.click(findTestObject('Object Repository/BankAccountAdd/div_bank'))

WebUI.delay(2)

WebUI.click(findTestObject('Filter/li_f_combobox(1)'))

WebUI.setText(findTestObject('Object Repository/BankAccountAdd/input_branchNumber'), '1234')

WebUI.setText(findTestObject('Object Repository/BankAccountAdd/input_branchName'), 'Davutpasa')

WebUI.setText(findTestObject('Object Repository/BankAccountAdd/input_accountNumber'), '123456789')

WebUI.setText(findTestObject('Object Repository/BankAccountAdd/input_accountName'), 'TL Hesabı')

WebUI.setText(findTestObject('Object Repository/BankAccountAdd/input_erpCode'), '111')

WebUI.setText(findTestObject('Object Repository/BankAccountAdd/input_iban'), 'TR244507799329800145281489')

(WebUI.click(findTestObject('Object Repository/BankAccountAdd/div_currencyCode')))

(WebUI.click(findTestObject('Filter/li_f_combobox(1)')))

(WebUI.click(findTestObject('Object Repository/BankAccountAdd/div_transferType')))

not: run(WebUI.click(findTestObject('Filter/li_f_combobox(1)')))

WebUI.click(findTestObject('Object Repository/BankAccountAdd/span_isActive'))

WebUI.click(findTestObject('General/button_save'))

WebUI.delay(2)