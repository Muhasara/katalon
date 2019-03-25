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

if (WebUI.verifyElementNotPresent(findTestObject('Object Repository/HomePage/Rules'), 3, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Object Repository/HomePage/Descripton'))
}

if (WebUI.verifyElementNotPresent(findTestObject('Object Repository/HomePage/Dynamic-Fields'), 3, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Object Repository/HomePage/Rules'))
}

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/HomePage/Dynamic-Fields'))

WebUI.click(findTestObject('Object Repository/General/button_operation'))

WebUI.click(findTestObject('Object Repository/General/li_Add-New'))

WebUI.setText(findTestObject('Object Repository/Dynamic Property/input_title'), 'Test')

WebUI.setText(findTestObject('Object Repository/Dynamic Property/input_code'), '123')

WebUI.click(findTestObject('Object Repository/Dynamic Property/button_Kaydet'))

WebUI.delay(2)

WebUI.verifyEqual(WebUI.getAttribute(findTestObject('General/div_afterAddMessage'), 'value'), '')

WebUI.closeBrowser()