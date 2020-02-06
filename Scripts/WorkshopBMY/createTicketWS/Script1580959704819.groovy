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

WebUI.setText(findTestObject('Object Repository/CreateTicketWS/input_Sparepart Workshop and RC Center_username'), 'PJTE018')

WebUI.setEncryptedText(findTestObject('Object Repository/CreateTicketWS/input_Sparepart Workshop and RC Center_password'), 
    '+Yp4bihX3nk=')

WebUI.click(findTestObject('Object Repository/CreateTicketWS/button_Sign in'))

WebUI.click(findTestObject('Object Repository/CreateTicketWS/a_Ticket Management'))

WebUI.click(findTestObject('Object Repository/CreateTicketWS/a_Create Ticket Workshop'))

WebUI.setText(findTestObject('Object Repository/CreateTicketWS/input__cinfo_customer_serial'), 'SERIALNUMBER321')

WebUI.setText(findTestObject('Object Repository/CreateTicketWS/input_Item No_cinfo_customer_itemno'), 'ITEMNUMBER321')

WebUI.setText(findTestObject('Object Repository/CreateTicketWS/input_Customer Code_cinfo_customer_code'), 'ITEMNUMBER321')

WebUI.setText(findTestObject('Object Repository/CreateTicketWS/input__cinfo_customer_name'), 'ESWARAN AUTO WS 5')

WebUI.setText(findTestObject('Object Repository/CreateTicketWS/input__cinfo_customer_machinemodel'), 'bizhub')

WebUI.click(findTestObject('Object Repository/CreateTicketWS/b__icon-search'))

WebUI.click(findTestObject('Object Repository/CreateTicketWS/td_BIZHUB PRESS C8000'))

WebUI.doubleClick(findTestObject('Object Repository/CreateTicketWS/td_BIZHUB PRESS C8000'))

WebUI.click(findTestObject('Object Repository/CreateTicketWS/a_Add Item'))

WebUI.setText(findTestObject('Object Repository/CreateTicketWS/input_Search Sparepart_spr_name'), '08AA85512')

WebUI.click(findTestObject('Object Repository/CreateTicketWS/button_Search'))

WebUI.doubleClick(findTestObject('Object Repository/CreateTicketWS/td_08AA85512'))

WebUI.click(findTestObject('Object Repository/CreateTicketWS/button_Esc'))

WebUI.click(findTestObject('Object Repository/CreateTicketWS/button_'))

WebUI.setText(findTestObject('Object Repository/CreateTicketWS/input_Photo Sensor_input_qty1'), '2')

WebUI.click(findTestObject('Object Repository/CreateTicketWS/input_CMSP_is_consume1'))

WebUI.setText(findTestObject('Object Repository/CreateTicketWS/input__remarks'), 'ESWARAN WS TESTING 20200206')

WebUI.click(findTestObject('Object Repository/CreateTicketWS/button_Esc'))

WebUI.click(findTestObject('Object Repository/CreateTicketWS/button_Save'))

WebUI.click(findTestObject('Object Repository/CreateTicketWS/a_Yes'))

not_run: WebUI.closeBrowser()

