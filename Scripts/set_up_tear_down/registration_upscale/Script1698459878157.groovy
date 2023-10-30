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
import org.apache.commons.lang3.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('')

WebUI.navigateToUrl('http://upscale.edudev.xyz/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/set_up_tear_down/registration_upscale/login_navigation'))

WebUI.click(findTestObject('Object Repository/set_up_tear_down/registration_upscale/registration_direct_link'))

def randomUsername = 'user_' + RandomStringUtils.randomAlphanumeric(8 // Contoh: user_ABC12345
    )

WebUI.setText(findTestObject('Object Repository/set_up_tear_down/registration_upscale/input_Username_username'), randomUsername)

println('User_name: ' + randomUsername)

def randomEmail = RandomStringUtils.randomAlphanumeric(10) + '@example.com' // Contoh: ABC12345@example.com

WebUI.setText(findTestObject('Object Repository/set_up_tear_down/registration_upscale/input_Alamat Email_email'), randomEmail)

println('Email: ' + randomEmail)

WebUI.setEncryptedText(findTestObject('Object Repository/set_up_tear_down/registration_upscale/input_Password_password'), 
    'p4y+y39Ir5OwzjICMj0FadHN8BCqy+k1')

WebUI.setEncryptedText(findTestObject('Object Repository/set_up_tear_down/registration_upscale/input_Konfirmasi Password_password_confirmation'), 
    'p4y+y39Ir5OwzjICMj0FadHN8BCqy+k1')

WebUI.setText(findTestObject('Object Repository/set_up_tear_down/registration_upscale/input_Nomor Telepon_phone_number'), 
    '87774403516')

WebUI.setText(findTestObject('Object Repository/set_up_tear_down/registration_upscale/input_Dari mana kamu dapat informasi soal k_9ca1e3'), 
    'Facebook')

WebUI.click(findTestObject('Object Repository/set_up_tear_down/registration_upscale/button_daftar'))

