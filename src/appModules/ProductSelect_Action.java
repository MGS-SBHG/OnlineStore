package appModules;

import pageObjects.Home_Page;
import pageObjects.ProductListing_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;


public class ProductSelect_Action {
	// iTestcaseRow is the row number of our Testcase name in the Test Data sheet
	// iTestcaseRow is passed as an Argument to this method, so that it can used inside this method
	
	public static void productType(int iTestCaseRow) throws Exception{
		try{

			System.out.println("Inside ProductSelect_Action productType method");
			
        	// iTestcaseRow is the row number of our Testcase name in the Test Data sheet
        	// Constant.Col_ProductType is the column number for Product Type column in the Test Data sheet
        	// Please see the Constant class in the Utility Package
        	// For Use of Constant Variables, please see http://www.toolsqa.com/constant-variables/
			
			// If condition will check that if the Excel value for the Product Type is Accessories, then do this
			if("Accessories".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductType))){				
										
				// Select the link Accessories from Home Page under Top Navigation
				// This is call Page Object Model (POM)
	        	// For use of POM, please see http://www.toolsqa.com/page-object-model/
				Home_Page.TopNavigation.Product_Type.Accessories();
	            // Printing the logs
				Log.info("Product Type Accessories is selected from the Top menu");
				System.out.println("Product Type Accessories is selected from the Top menu");
			}
			// If the Excel value for the Product Type is iMacs, then do this
			if("iMacs".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductType))){
				Home_Page.TopNavigation.Product_Type.iMacs();
				Log.info("Product Type iMacs is selected from the Top menu");
				System.out.println("Product Type iMacs is selected from the Top menu");
			}
			// If the Excel value for the Product Type is iPads, then do this
			if("iPads".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductType))){
				Home_Page.TopNavigation.Product_Type.iPads();
				Log.info("Product Type iPads is selected from the Top menu");
				System.out.println("Product Type iPads is selected from the Top menu");
			}
			// If the Excel value for the Product Type is iPhones, then do this
			if("iPhones".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductType))){
				Home_Page.TopNavigation.Product_Type.iPhones();
				Log.info("Product Type iPhones is selected from the Top menu");
				System.out.println("Product Type iPhones is selected from the Top menu");
			}
			// If the Excel value for the Product Type is null, then do this
			if("".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductType))){
				Log.warn("Excel value for Product Type is Blank");
				System.out.println("Product Type Blank is selected from the Top menu");
			}
			
			System.out.println("Product Type:" + (ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductType)));
			
		// Every exception thrown from any class or method, will be caught here and will be taken care of
	    }catch(Exception e){
			// Here I have used this as just for the sake of an example
			// I am just catching the Exception and again throwing it back to the Main testcase, without handling it
	    	// You may like to print some information here, in case of exception
	    	System.out.println("Exception in Product Type Catch block - Error! ");
	    	Log.info("Exception in Product Type Catch block - Error! ");
	    	throw(e);
			}
		}
	
	
	// iTestcaseRow is the row number of our Testcase name in the Test Data sheet
	//              passed as an Argument and used inside this method
	public static void productNumber(int iTestCaseRow) throws Exception{
		try{
			
			System.out.println("Inside productNumber method");
			
			// in the Test Data sheet:
			// iTestcaseRow is the row number of our Testcase name 
        	// Constant.Col_ProductNumber is the column number for Product Number column
			
			System.out.println("Product Nbr: " + ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductNumber));
			
        	// check if Excel value for Product Number is "Product 1":
			if("Product 1".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductNumber))){
							
				// Click on the Add to Cart button for the Product 1
				// i.e. Page Object Model (POM)	        
				ProductListing_Page.Product_1.btn_AddToCart().click();
				
				// Printing logs for the performed action
				Log.info("Product 1 selected from the Product listing page");
				System.out.println("Product 1 selected from the Product listing page");
				
			}
			// If the Excel value for the Product Number is "Product 2", then do this
			if("Product 2".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductNumber))){
				ProductListing_Page.Product_2.btn_AddToCart().click();
				Log.info("Product 2 is selected from the Product listing page");
				System.out.println("Product 2 selected from the Product listing page");
				
			}
			/// If the Excel value for the Product Type is null, then do this
			if("".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductNumber))){
				Log.warn("Excel value for Product Number is Blank");
				System.out.println("Excel value for Product Number is Blank");
			}
			
			// Click on the "Go to Cart" button on Pop Up Box
			ProductListing_Page.PopUpAddToCart.btn_GoToCart().click();
			System.out.println("[Go to Cart] button clicked on Pop Up Box");	
			
		 // Every exception thrown from any class or method, will be caught here and will be taken care of
		  }catch(Exception e){			
			// Here I have used this as just for the sake of an example
			// I am just catching the Exception and again throwing it back to the Main testcase, without handling it
		    // You may like to print some information here, in case of exception
			  System.out.println("Error: Exception Throw!");    
			throw(e);
			}
		}
	}
