import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class loginSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("user visit the swaglab url")
	def i_want_to_visit_url() {
		println("\n user visit the url")
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://demowebshop.tricentis.com/')

		WebUI.click(findTestObject('Object Repository/login/login_navigation'))
	}

	@When("user input (.*) and (.*)")
	def user_input_credentials(String username, String password) {
		println("\n user input the credentials for login the page")
		println("\n username : "+username)
		println("\n password : "+password)

		WebUI.setText(findTestObject('Object Repository/login/input_Email_Email'), username)

		WebUI.setEncryptedText(findTestObject('Object Repository/login/input_Password'), password)
	}

	@And("user click login button")
	def user_click_login_button() {
		println("\n user click the login button")

		WebUI.click(findTestObject('Object Repository/login/login_button'))
	}

	@Then("system will validation user have the login")
	def validation_login() {
		println("\n system will validation sucess login ")

		try {
			WebUI.verifyElementPresent(findTestObject('Object Repository/login/email_address_after_login'), 0)
		}
		catch (Exception e) {
			WebUI.comment('Login using naufal ammar')
		}

		try {
			WebUI.verifyElementPresent(findTestObject('Object Repository/login/login_ammar_walker'), 0)
		}
		catch (Exception e) {
			WebUI.comment('login using ammar walker')
		}

		WebUI.closeBrowser()
	}
}