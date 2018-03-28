package appModules;

import org.testng.Reporter;

import pageObjects.Confirmation_Page;
import pageObjects.PaymentDetails_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;

public class PaymentDetails_Action {
	
	// iTestcaseRow is the row number of our Testcase name in the Test Data sheet
	// passed as an Argument to this method, used inside this method
	 
	public static void execute(int iTestCaseRow) throws Exception{
		try{
        	
			System.out.println("Inside PaymentDetails_Action Execute method");
     		
        	// from Test Data Excel sheet:
			// Get Email address and Store Email in to a String variable sEmail  
        	// iTestcaseRow is the row number of our Testcase name 
        	// Constant.Col_Email is the column number for Email column 
        	
			String sEmail = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Email);
     		System.out.println("email: " + sEmail);

			
			// Clearing the pre-populated details on this field
			PaymentDetails_Page.txt_Email().clear();
     		System.out.println("Clearing the pre-populated details on this field");
     		
			// Send Email string to the Email Textbox on the Payment Detail Page
        	// i.e. Page Object Model (POM)
     		System.out.println("Sending sEmail !");
			PaymentDetails_Page.txt_Email().sendKeys(sEmail);
			
			// Printing the logs for what we have just performed
			Log.info(sEmail +" is entered as Email on the Payment detail page");
			System.out.println("Print logs - Payment detail page: Email");
			
			String sFirstName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_FirstName);
			PaymentDetails_Page.txt_FirstName().clear();
			PaymentDetails_Page.txt_FirstName().sendKeys(sFirstName);
			Log.info(sFirstName +" is entered as First Name on the Payment detail page");
			System.out.println("Print logs - Payment detail page: First Name");
			
			String sLastName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_LastName);
			PaymentDetails_Page.txt_LastName().clear();
			PaymentDetails_Page.txt_LastName().sendKeys(sLastName);
			Log.info(sLastName +" is entered as Last Name on the Payment detail page");
			System.out.println("Print logs - Payment detail page: Last Name");
			
			String sAddress = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Address);
			PaymentDetails_Page.txt_Address().clear();
			PaymentDetails_Page.txt_Address().sendKeys(sAddress);
			Log.info(sAddress +" is entered as Address on the Payment detail page");
			System.out.println("Print logs - Payment detail page: Address");
			
			String sCity = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_City);
			PaymentDetails_Page.txt_City().clear();
			PaymentDetails_Page.txt_City().sendKeys(sCity);
			Log.info(sCity +" is entered as City on the Payment detail page");
			System.out.println("Print logs - Payment detail page: City");
			
			String sCountry = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Country);
			PaymentDetails_Page.drpdwn_Country(sCountry);
			Log.info(sCountry +" is Selected as Country on the Payment detail page");
			System.out.println("Print logs - Payment detail page: Country");
			
			String sPhone = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Phone);
			PaymentDetails_Page.txt_Phone().clear();
			PaymentDetails_Page.txt_Phone().sendKeys(sPhone);
			Log.info(sPhone +" is entered as Phone on the Payment detail page");
			System.out.println("Print logs - Payment detail page: Phone Nbr");
			
			// This is to check that if the Check box for "Same as Billing address" is not already checked
			if(!PaymentDetails_Page.chkbx_SameAsBillingAdd().isSelected()){
				// It it is unchecked, then check the check box
				PaymentDetails_Page.chkbx_SameAsBillingAdd().click();
				Log.info("Same as Billing address check box is selected on the Payment detail page");
				System.out.println("Print logs - Same as Billing address check box is selected on the Payment detail page");
			}
			
			// Clicking on the Purchase button to complete the payment
			PaymentDetails_Page.btn_Purchase().click();
			Log.info("Click action performed on Purchase button on the Payment detail page");
			System.out.println("Click action performed on Purchase button on the Payment detail page");
			
            // TestNg Reporter logging
            // print the very important messages in to this
            // populate the logs in the TestNG HTML reports
            // used just once in this whole module 
			Reporter.log("Payment successfully performed for the purchased product.");
			System.out.println("Payment successfully performed for the purchased product.");
			
	    }catch(Exception e){
	    	System.out.println("Error: Payment Not successfully performed for the purchased product.");
			throw(e);
			}
		}
}
