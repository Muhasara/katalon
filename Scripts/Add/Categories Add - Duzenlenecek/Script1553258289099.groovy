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

if (WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/Categories'), 5) == true) {
    WebUI.click(findTestObject('Object Repository/HomePage/Categories'))
} else {
    WebUI.click(findTestObject('Object Repository/HomePage/Descripton'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Object Repository/HomePage/Categories'))
}

WebUI.click(findTestObject('Object Repository/Categories/button_operation1'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Categories/li_addCategory1'))

WebUI.setText(findTestObject('Object Repository/Categories/input_categoryName'), 'Gelen Kategori')

WebUI.click(findTestObject('Object Repository/Categories/button_save'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Categories/button_operation2'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Categories/li_addCategory2'))

WebUI.setText(findTestObject('Object Repository/Categories/input_categoryName'), 'Giden Kategori')

WebUI.click(findTestObject('Object Repository/Categories/button_save'))

WebUI.delay(1)

WebUI.closeBrowser()