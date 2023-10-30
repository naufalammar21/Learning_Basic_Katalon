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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://upscale.edudev.xyz/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Login and fill the form/Page_Upscale.id, Scaling Up your business w_24ed63/a_Login'))

WebUI.click(findTestObject('Object Repository/Login and fill the form/Page_Upscale.id, Scaling Up your business w_24ed63/input_Email_email'))

WebUI.setText(findTestObject('Object Repository/Login and fill the form/Page_Upscale.id, Scaling Up your business w_24ed63/input_Email_email'), 
    'ammarhtr@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login and fill the form/Page_Upscale.id, Scaling Up your business w_24ed63/input_Password_password'), 
    'KovZvcvtR4ALc5mUvUWWdvCnih/eYzMn')

WebUI.click(findTestObject('Object Repository/Login and fill the form/Page_Upscale.id, Scaling Up your business w_24ed63/button_Login'))

WebUI.click(findTestObject('Object Repository/Login and fill the form/Page_Upscale.id, Scaling Up your business w_24ed63/a_For Business'))

WebUI.setText(findTestObject('Object Repository/Login and fill the form/Page_Upscale.id, Scaling Up your business w_24ed63/input_Simple  an affordable price plans for_2e5a68'), 
    'Naujfal Ammar')

WebUI.setText(findTestObject('Object Repository/Login and fill the form/Page_Upscale.id, Scaling Up your business w_24ed63/input_Simple  an affordable price plans for_d0447f'), 
    '087774456789')

WebUI.setText(findTestObject('Object Repository/Login and fill the form/Page_Upscale.id, Scaling Up your business w_24ed63/input_Simple  an affordable price plans for_90e067'), 
    'ammarwalker@gmail.com')

WebUI.setText(findTestObject('Object Repository/Login and fill the form/Page_Upscale.id, Scaling Up your business w_24ed63/textarea_Simple  an affordable price plans _841a56'), 
    'This is the test in katalon')

WebUI.click(findTestObject('Object Repository/Login and fill the form/Page_Upscale.id, Scaling Up your business w_24ed63/button_Send inquiry'))

WebUI.closeBrowser()

