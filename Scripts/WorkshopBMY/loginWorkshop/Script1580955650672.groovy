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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ccrm.konicaminolta.com.my/km_ws_testing/auth')

WebUI.setText(findTestObject('Object Repository/LoginWorkshop/input_Sparepart Workshop and RC Center_username'), 'pjte018')

WebUI.setEncryptedText(findTestObject('Object Repository/LoginWorkshop/input_Sparepart Workshop and RC Center_password'), 
    '+Yp4bihX3nk=')

WebUI.click(findTestObject('Object Repository/LoginWorkshop/button_Sign in'))

WebUI.click(findTestObject('Object Repository/LoginWorkshop/a_Logout'))

WebUI.closeBrowser()

