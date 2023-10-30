//package com.ea.utilities
//
//import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
//import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
//import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
//import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
//
//import com.kms.katalon.core.annotation.Keyword
//import com.kms.katalon.core.checkpoint.Checkpoint
//import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
//import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
//import com.kms.katalon.core.model.FailureHandling
//import com.kms.katalon.core.testcase.TestCase
//import com.kms.katalon.core.testdata.TestData
//import com.kms.katalon.core.testobject.TestObject
//import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
//import org.openqa.selenium.support.ui.select
//import internal.GlobalVariable
//import org.openqa.selenium.WebElement
//
//
//
//public class common_utilities {
//	@Keyword
//
//	def CheckDropdownListElementExist = { TestObject object, String option ->
//		boolean flag = false;
//		WebElement element = WebUiCommonHelper.findWebElement(object, 20);
//		select ddl = new select(element);
//
//		for(WebElement elem: ddl.getOptions() ) {
//			if(elem.getText().equals(option)) {
//				system.out.println('Elemenf Exist')
//				return flag = true;
//			}
//			else {
//				system.out.println('Elemenf Does not Exist')
//			}
//			return flag;
//		}
//	}
//}




package com.ea.utilities;
import org.openqa.selenium.support.ui.Select;
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint;
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase;
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData;
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject;
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject;

import com.kms.katalon.core.annotation.Keyword;
import com.kms.katalon.core.checkpoint.Checkpoint;
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW;
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile;
import com.kms.katalon.core.model.FailureHandling;
import com.kms.katalon.core.testcase.TestCase;
import com.kms.katalon.core.testdata.TestData;
import com.kms.katalon.core.testobject.TestObject;
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS;
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI;
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows;
import internal.GlobalVariable;
import org.openqa.selenium.WebElement;

public class common_utilities {
	@Keyword
	def CheckDropdownListElementExist = { TestObject object, String option ->
		boolean flag = false;
		WebElement element = WebUiCommonHelper.findWebElement(object, 20);

		select ddl = new select(element) {

			for (WebElement elem : ddl.getOptions()) {
				if (elem.getText().equals(option)) {
					System.out.println('Element Exist');
					flag = true;
					break; // You can break out of the loop once you find the element
				} else {
					System.out.println('Element Does not Exist');
				}
			}

			return flag; // Return the flag after the loop
		}
	}
