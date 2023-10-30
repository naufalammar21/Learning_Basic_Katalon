import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Call_test_Case_Reusable/login_HRM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/call_test_case_reusable/fill_form_add_admin/Navigation_admin_button'))

WebUI.click(findTestObject('Object Repository/call_test_case_reusable/fill_form_add_admin/button_Add'))

WebUI.click(findTestObject('call_test_case_reusable/fill_form_add_admin/user_role_selected'))

WebUI.click(findTestObject('call_test_case_reusable/fill_form_add_admin/select_admin_role_button'))

WebUI.click(findTestObject('call_test_case_reusable/fill_form_add_admin/status_selected'))

WebUI.click(findTestObject('call_test_case_reusable/fill_form_add_admin/select_status_enabled_button'))

WebUI.setEncryptedText(findTestObject('Object Repository/call_test_case_reusable/fill_form_add_admin/input_Password_oxd-input oxd-input--focus'), 
    'vyilgoBowbBUKn+D9gxEwLHz7x3Mr2QF')

WebUI.setEncryptedText(findTestObject('call_test_case_reusable/fill_form_add_admin/input_Confirm Password_oxd-input oxd-input--focus'), 
    'vyilgoBowbBUKn+D9gxEwLHz7x3Mr2QF')

WebUI.setText(findTestObject('Object Repository/call_test_case_reusable/fill_form_add_admin/input_Username_oxd-input oxd-input--focus_1'), 
    'Sheryl_Sheinafia')

WebUI.setText(findTestObject('call_test_case_reusable/fill_form_add_admin/employee_name'), 'aya saleh')

WebUI.click(findTestObject('Object Repository/call_test_case_reusable/fill_form_add_admin/button_Save'))

WebUI.callTestCase(findTestCase('Call_test_Case_Reusable/logout_hrm'), [:], FailureHandling.STOP_ON_FAILURE)

