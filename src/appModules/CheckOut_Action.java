package appModules;

import org.testng.Reporter;

import pageObjects.BaseClass;
import pageObjects.CheckOut_Page;


public class CheckOut_Action {

	public static void Execute() throws Exception{
		 
		// This is to get the Product name on the Check Out page with using getText() method 
		// CheckOut_Page.sProductName is a static variable and can be used anywhere with its class name
		// Once some text is stored in this variable can be used later in any other class 
     	CheckOut_Page.sProductName=CheckOut_Page.txt_ProductName().getText();
     	
        System.out.println("Inside CheckOut Action Execute method");

     	// Verification checks: reports fail at the end
     	// check the value in the variable sProductName is not null
     	if(!"".equals(CheckOut_Page.sProductName)){
     		// verification check on the Product Name, if displayed, my verification will pass
     		System.out.println("Verification Passed: Product Name: " + CheckOut_Page.sProductName);     		
     		Reporter.log("Verification Passed: Product Name on Check Out page.");
     	}else{
     		// If not displayed, verification check failed
     		System.out.println("Verification Failed: Product Name: " + CheckOut_Page.sProductName);
     		Reporter.log("Verification Failed for Product Name on Check Out page.");
     		
     		// at beg of tests, set BaseClass.bResult=true
     		// If above verification failed, set BaseClass.bResult=false; report this to my test     		 
     		// At the end of my test, match the value; if false, fail the test, else the test will be pass
     		BaseClass.bResult=false;
     	}
     	
     	CheckOut_Page.sProductPrice= CheckOut_Page.txt_ProductPrice().getText();
     	if(!"".equals(CheckOut_Page.sProductPrice)){
     		System.out.println("Verification Passed: Product Price: " + CheckOut_Page.sProductPrice);
     		Reporter.log("Verification Passed for Product Price on Check Out page.");
     	}else{
     		System.out.println("Verification Failed: Product Price: " + CheckOut_Page.sProductPrice);
     		Reporter.log("Verification Failed for Product Price on Check Out page.");
     		BaseClass.bResult=false;     
     	}
     	
     	// Clicking on the Continue button on the Check Out page
    	System.out.println("CheckOut button clicked!");
     	CheckOut_Page.btn_Continue().click();
	 }

}
