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

WebUI.setText(findTestObject('Object Repository/CreateTicketRC/input_Sparepart Workshop and RC Center_username'), 'RCTE001')

WebUI.setEncryptedText(findTestObject('Object Repository/CreateTicketRC/input_Sparepart Workshop and RC Center_password'), 
    '+Yp4bihX3nk=')

WebUI.sendKeys(findTestObject('Object Repository/CreateTicketRC/input_Sparepart Workshop and RC Center_password'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/CreateTicketRC/a_Ticket Management'))

WebUI.click(findTestObject('Object Repository/CreateTicketRC/a_Create Ticket Workshop'))

WebUI.setText(findTestObject('Object Repository/CreateTicketRC/input__cinfo_customer_serial'), 'RCTE001SP1')

WebUI.setText(findTestObject('Object Repository/CreateTicketRC/input_Item No_cinfo_customer_itemno'), 'ITEMRCTE001')

WebUI.setText(findTestObject('Object Repository/CreateTicketRC/input__cinfo_customer_name'), 'RCTEOK1')

WebUI.setText(findTestObject('Object Repository/CreateTicketRC/input__cinfo_customer_machinemodel'), '250')

WebUI.click(findTestObject('Object Repository/CreateTicketRC/button__btn'))

WebUI.click(findTestObject('Object Repository/CreateTicketRC/td_C250I COPIERPRINTER'))

WebUI.click(findTestObject('Object Repository/CreateTicketRC/button_Select'))

WebUI.click(findTestObject('Object Repository/CreateTicketRC/a_Add Item'))

WebUI.setText(findTestObject('Object Repository/CreateTicketRC/input_Search Sparepart_spr_name'), 'A02EM20100')

WebUI.click(findTestObject('Object Repository/CreateTicketRC/button_Search'))

WebUI.click(findTestObject('Object Repository/CreateTicketRC/td_A02EM20100'))

WebUI.click(findTestObject('Object Repository/CreateTicketRC/button_Add'))

WebUI.click(findTestObject('Object Repository/CreateTicketRC/button_Esc'))

WebUI.click(findTestObject('Object Repository/CreateTicketRC/button_'))

WebUI.setText(findTestObject('Object Repository/CreateTicketRC/input_CLUTCH C353220280360_input_qty1'), '1')

WebUI.click(findTestObject('Object Repository/CreateTicketRC/input_CMSP_is_consume1'))

WebUI.setText(findTestObject('Object Repository/CreateTicketRC/input__remarks'), 'CEK')

WebUI.click(findTestObject('Object Repository/CreateTicketRC/button_x'))

WebUI.click(findTestObject('Object Repository/CreateTicketRC/button_Save'))

WebUI.click(findTestObject('Object Repository/CreateTicketRC/a_Yes'))

not_run: WebUI.closeBrowser()

