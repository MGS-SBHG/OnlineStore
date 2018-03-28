package appModules;

import org.testng.Reporter;

import pageObjects.BaseClass;
import pageObjects.CheckOut_Page;
import pageObjects.Confirmation_Page;


public class Verification_Action {
	public static void Execute() throws Exception{

		System.out.println("Inside Verification_Action Execute method");

		// check that if the Product Name stored from Checkout & Confirmation page is same 		
		if(CheckOut_Page.sProductName.equals(Confirmation_Page.sProductName)){
			
			System.out.println("Product Name - Checkout Page: " + CheckOut_Page.sProductName);
			System.out.println("Product Name - Confirmation Page: " + Confirmation_Page.sProductName);
			
			// verification check on Product Name: if matched, verification passed:
			Reporter.log("Verification Passed for Product Name");
			System.out.println("Verification Passed: Product Name - Checkout Page & Confirmation Page matched"); 
			
		}else{
			// If not matched, verification failed:
			Reporter.log("Verification Failed for Product Name");
			System.out.println("Verification Failed: Product Name - Checkout Page & Confirmation Page NOT match");
			
			// at beg of tests, set BaseClass.bResult=true
     		// If above verification failed, set BaseClass.bResult=false; report this to my test     		 
     		// At the end of my test, match the value; if false, fail the test, else the test will be pass
			BaseClass.bResult=false;
		}
		
		if(CheckOut_Page.sProductPrice.equals(Confirmation_Page.sProductPrice)){
			Reporter.log("Verification Passed for Product Price");
			System.out.println("Verification Passed for Product Price");

		}else{
			Reporter.log("Verification Failed for Product Price");
			System.out.println("Verification Passed for Product Price");
			BaseClass.bResult=false;
		}
	}
}
