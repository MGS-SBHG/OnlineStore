package appModules;

import org.testng.Reporter;

import pageObjects.BaseClass;
import pageObjects.CheckOut_Page;
import pageObjects.Confirmation_Page;


@SuppressWarnings("unused")
public class Confirmation_Action {
	 public static void Execute() throws Exception{

			System.out.println("Inside Confirmation Action Execute method");
		 
		    // get Product name on the Confirmation page using getText() method 
			// Confirmation_Page.sProductName is a static variable and can be used anywhere with its class name
			// Once some text is stored in this variable can be used later in any other class 
	     	Confirmation_Page.sProductName=Confirmation_Page.txt_ProductName().getText();
	     	
	    	System.out.println("Product Name: " + Confirmation_Page.sProductName);
	     	
	        // Verification checks: simply report fail at the end
	     	// check if the variable sProductName is not null:
	     	if(!"".equals(Confirmation_Page.sProductName)){
	     	    // verification check on the Product Name, if displayed, verification passed
		    	System.out.println("Verification Passed for Confirmation Page Product Name: " + Confirmation_Page.sProductName);
	     		Reporter.log("Verification Passed for Product Name on Confirmation page");
	     	}else{
	     	    // If not displayed, verification check failed:
	     		System.out.println("Verification Failed for Confirmation Page Product Name: " + Confirmation_Page.sProductName);
	     		Reporter.log("Verification Failed for Product Name on Confirmation page");
	     		
	     		// at beg of tests, set BaseClass.bResult=true
	     		// If above verification failed, set BaseClass.bResult=false; report this to my test     		 
	     		// At the end of my test, match the value; if false, fail the test, else the test will be pass
	     		BaseClass.bResult=false;
	     	}
	     	
	     	Confirmation_Page.sProductPrice= Confirmation_Page.txt_ProductPrice().getText();
	     	if(!"".equals(Confirmation_Page.sProductPrice)){
	     		System.out.println("Verification Passed for Confirmation Page  Product Price: " + Confirmation_Page.sProductPrice);
	     		Reporter.log("Verification Passed for Product Price on Confirmation page");
	     	}else{
	     		System.out.println("Verification Failed for Confirmation Page  Product Price: " + Confirmation_Page.sProductPrice);
	     		Reporter.log("Verification Failed for Product Price on Confirmation page");
	     		BaseClass.bResult=false;
	     	}
		 }
}
