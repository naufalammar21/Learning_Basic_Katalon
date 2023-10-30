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

//open the browser
WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.maximizeWindow()

// input username in login form
WebUI.setText(findTestObject('Object Repository/TC-02 Login with spyweb mode/input_Username_username'), 'Admin')

//input password in login form
WebUI.setText(findTestObject('Object Repository/TC-02 Login with spyweb mode/input_Password_password'), 'admin123')

//click login button
WebUI.click(findTestObject('Object Repository/TC-02 Login with spyweb mode/button_Login'))

//validate time at work
WebUI.verifyElementPresent(findTestObject('Object Repository/TC-02 Login with spyweb mode/p_Time at Work'),4)

//show dropdown for logout
WebUI.click(findTestObject('Object Repository/TC-02 Login with spyweb mode/i_Dashboard_oxd-icon bi-caret-down-fill oxd-userdropdown-icon'))

// click on logout button
WebUI.click(findTestObject('Object Repository/TC-02 Login with spyweb mode/a_Logout'))

//close browser
WebUI.closeBrowser()

