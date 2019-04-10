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

if (WebUI.verifyElementNotPresent(findTestObject('Object Repository/HomePage/Users_Settings'), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Object Repository/HomePage/Description'))
}

if (WebUI.verifyElementNotPresent(findTestObject('Object Repository/HomePage/Users'), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Object Repository/HomePage/Users_Settings'))

    WebUI.delay(2)
}

WebUI.click(findTestObject('Object Repository/HomePage/Users'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/General/button_operation'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/General/li_Add-New'))

WebUI.setText(findTestObject('Object Repository/User/input_name'), 'İsim')

WebUI.setText(findTestObject('Object Repository/User/input_surname'), 'Soyİsim')

WebUI.setText(findTestObject('Object Repository/User/input_email'), 'test@test.com')

WebUI.setText(findTestObject('Object Repository/User/input_phone'), '5445445454')

WebUI.setText(findTestObject('Object Repository/User/input_mobilePhone'), '5555555555')

WebUI.setText(findTestObject('Object Repository/User/input_description'), 'Otomasyon Test amaçlı kullanıcı')

WebUI.click(findTestObject('Object Repository/User/div_rols'))

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Filter/li_f_combobox(1)'), 3, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Object Repository/Filter/li_f_combobox(1)'))
	
} else {
    FailureHandling.STOP_ON_FAILURE
}

WebUI.click(findTestObject('Object Repository/General/button_save'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('General/button_operation'), 5)

WebUI.closeBrowser()