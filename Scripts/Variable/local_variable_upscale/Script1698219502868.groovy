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
import org.apache.commons.lang3.RandomStringUtils

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(url)

WebUI.click(findTestObject('Object Repository/Variable_regist_upscale/Login_navigation'))

WebUI.click(findTestObject('Object Repository/Variable_regist_upscale/regist_account_direct_link'))

def randomUsername = "User_" + RandomStringUtils.randomAlphanumeric(8)  // Membuat nama pengguna acak
def randomEmail = RandomStringUtils.randomAlphanumeric(10) + "@example.com"  // Membuat alamat email acak

WebUI.setText(findTestObject('Object Repository/Variable_regist_upscale/input_Username_username'), randomUsername)

WebUI.setText(findTestObject('Object Repository/Variable_regist_upscale/input_Alamat Email_email'), randomEmail)

WebUI.setEncryptedText(findTestObject('Object Repository/Variable_regist_upscale/input_Password_for_login'), 'TZDtNgpp81oE9dt2H+/bLw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Variable_regist_upscale/input_Konfirmasi Password_password_confirmation'), 
    'TZDtNgpp81oE9dt2H+/bLw==')

def randomPhoneNumber = "0" + RandomStringUtils.randomNumeric(10)  // Membuat nomor telepon acak

WebUI.setText(findTestObject('Object Repository/Variable_regist_upscale/input_Nomor Telepon_phone_number'), randomPhoneNumber)

WebUI.setText(findTestObject('Object Repository/Variable_regist_upscale/input_Dari mana kamu dapat informasi soal k_9ca1e3'), 
    sumber_informasi)

WebUI.click(findTestObject('Object Repository/Variable_regist_upscale/Button_DAFTAR'))

WebUI.verifyTextPresent(verifikasi_sucess_regist, false)

WebUI.closeBrowser()

