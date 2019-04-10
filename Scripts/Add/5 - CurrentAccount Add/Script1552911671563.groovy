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

if (WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/Current-Accounts'), 15) == true) {
    WebUI.click(findTestObject('Object Repository/HomePage/Current-Accounts'))
} else {
    WebUI.click(findTestObject('Object Repository/HomePage/Descripton'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Object Repository/HomePage/Current-Accounts'))
}

WebUI.click(findTestObject('General/button_operation'))

WebUI.click(findTestObject('General/li_Add-New'))

WebUI.click(findTestObject('CurrentAccount/div_currentAccountType'))

WebUI.click(findTestObject('Filter/li_f_combobox(1)'))

WebUI.setText(findTestObject('CurrentAccount/input_currentAccountCode'), '963.852.741')

WebUI.setText(findTestObject('CurrentAccount/input_currentAccountName'), 'Bireysel Cari Hesap')

WebUI.setText(findTestObject('CurrentAccount/input_tcknNumber'), '11111111110')

WebUI.setText(findTestObject('CurrentAccount/input_email'), 'a@a.com')

WebUI.setText(findTestObject('CurrentAccount/input_companyTitle'), 'Adı Soyadı')

WebUI.setText(findTestObject('CurrentAccount/input_phone'), '2121212121')

WebUI.setText(findTestObject('CurrentAccount/input_gsm'), '5455455454')

WebUI.setText(findTestObject('CurrentAccount/input_taxOffice'), 'Veri Dairesi')

WebUI.setText(findTestObject('CurrentAccount/input_taxNumber'), '0000')

WebUI.setText(findTestObject('CurrentAccount/input_iban'), 'TR111111111111111110101010')

WebUI.click(findTestObject('CurrentAccount/button_addIban'))

WebUI.setText(findTestObject('CurrentAccount/input_bankAccount'), '123987465')

WebUI.click(findTestObject('CurrentAccount/button_addBankAccount'))

WebUI.click(findTestObject('General/button_save'))

WebUI.verifyElementPresent(findTestObject('General/button_operation'), 5)

WebUI.closeBrowser()