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

WebUI.click(findTestObject('Object Repository/HomePage/Balances'))

WebUI.click(findTestObject('Object Repository/Filter/div_f_bank'))

WebUI.delay(1)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Filter/li_f_combobox(1)'), 3, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Object Repository/Filter/li_f_combobox(1)'))
}

WebUI.click(findTestObject('Object Repository/Filter/div_f_accountName'))

WebUI.delay(1)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Filter/li_f_combobox(1)'), 3, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Object Repository/Filter/li_f_combobox(1)'))
}

WebUI.click(findTestObject('Object Repository/Filter/div_f_currencyCode'))

WebUI.delay(1)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Filter/li_f_combobox(1)'), 3, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Object Repository/Filter/li_f_combobox(1)'))
}

WebUI.setText(findTestObject('Object Repository/Filter/input_f_search'), 'TEST')

WebUI.click(findTestObject('Object Repository/Filter/button_f_search'))

WebUI.delay(2)

WebUI.closeBrowser()