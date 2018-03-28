package test.java;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.BaseClass;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;
import appModules.CheckOut_Action;
import appModules.Confirmation_Action;
import appModules.PaymentDetails_Action;
import appModules.ProductSelect_Action;
import appModules.SignIn_Action;
import appModules.Verification_Action;

public class Framework_001{
	public WebDriver driver;
	private String sTestCaseName;
	private int iTestCaseRow;
	
  // Following TestNg Test case pattern, and divided a Test case in to three different parts.
  // Before Method: code will always be the same
  // prerequisites of the main Test Case	
  @BeforeMethod
  public void beforeMethod() throws Exception {
	    // Configuring Log4j logs	    
	  	DOMConfigurator.configure("log4j.xml");
	  	
	  	// Get long test case name including package and class name etc
	  	// to get TestCase row from the Test Data Excel sheet	 
	  	sTestCaseName = this.toString();
	  	
	  	
	  	// refine your test case name to exactly the name used
	  	sTestCaseName = Utils.getTestCaseName(this.toString());
	  	
	  	// Start printing the logs and printing the Test Case name
		Log.startTestCase(sTestCaseName);
		
		// Set up Test Data Excel file using Constants variables		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
		
		// Fetch Test Case row number from Test Data Sheet to get the relevant data from the Test Data sheet 
		iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
		
		// Launch browser taken from Browser Type from Test Data Sheet 
		driver = Utils.OpenBrowser(iTestCaseRow);
		
		// Initialize Base Class for Selenium driver
		// Provide the Selenium driver to any of the Page classes or Module Actions
		// Will soon write a post on Base Class
		new BaseClass(driver);  
        } // beforeMethod()
  
  // start of Main Test Case
  @Test
  public void main() throws Exception {
	  // Every exception thrown from any class or method, will be caught here and will be taken care of	  
	 
	  try{
		// call SignIN Action and passing argument(iTestCaseRow)
		SignIn_Action.Execute(iTestCaseRow);
		
		// select Product category from Top Navigation of the Home Page
		ProductSelect_Action.productType(iTestCaseRow);
		
		// select the Product from the Product Listing Page		
		ProductSelect_Action.productNumber(iTestCaseRow);
		
		// Assign Product Name & Price to the variables from the Check Out page 
		// to be matched later for verification
		CheckOut_Action.Execute();
		
		// call Payment Details Action and pass argument (iTestCaseRow)
		// to provide all the personal detail and payment detail on the page 
		// and complete the payment for the selected product
		PaymentDetails_Action.execute(iTestCaseRow);
		
		// assign Product Name & Price to variables from Confirmation page to be matched later for verification
		Confirmation_Action.Execute();
		
		// match the Product Name & Price stored in variables of Checkout & Confirmation page 
		Verification_Action.Execute();
		
		// Pass or Fail test:
		// For selenium,  test passed: No exception, come to the end or test did not stop anywhere
		// fail: if any verification failed
		// This is to check that if any of your verification during the execution is failed
		if(BaseClass.bResult==true){
			// If boolean variable is True, test completely passed; Mark test as "Pass"
			ExcelUtils.setCellData("Pass", iTestCaseRow, Constant.Col_Result);
		}else{
			// If boolean variable False, test failed
			// throw exception in case of fail test caught by catch block below:
			throw new Exception("Test Case Failed because of Verification");
		}
		
	  // Below are the steps you may like to perform in case of failed test or any exception faced before ending your test 
	  }catch (Exception e){
		  // If any exception during the test, mark test as "Fail" in the test result sheet
		  ExcelUtils.setCellData("Fail", iTestCaseRow, Constant.Col_Result);
		  // If the exception occured between tests, because of any element not found etc - take a screen shot:
		  Utils.takeScreenshot(driver, sTestCaseName);
		  // print the error log message
		  Log.error(e.getMessage());
		  // throw  exception to fail the test completely in the TestNG results
		  throw (e);
	  }		
  }
		
  // finish the test case		
  @AfterMethod
  public void afterMethod() {
	    // Print logs to end the test case
	    Log.endTestCase(sTestCaseName);
	    // Close the opened driver
	    driver.close();
  		}
} //Framework_001
