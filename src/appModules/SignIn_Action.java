package appModules;
import org.testng.Reporter;

import pageObjects.Home_Page;
import pageObjects.LogIn_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;
    
 
    public class SignIn_Action {
    	// iTestcaseRow is the row number of our Testcase name in the Test Data sheet
    	// iTestcaseRow is passed as an Argument to this method, so that it can used inside this method
        public static void Execute(int iTestCaseRow) throws Exception{

        System.out.println("Inside SignIn Action - Execute method");
        
        	
        	// Clicking on the My Account link on the Home Page
        	Home_Page.lnk_MyAccount().click();
        	Log.info("Click action is performed on My Account link" );
			System.out.println("Click action performed! ");
        	
        	// Storing the UserName into a String variable and Get the UserName from Test Data Excel sheet
        	// iTestcaseRow is the row number of our Testcase name in the Test Data sheet
        	// Constant.Col_UserName is the column number for UserName column in the Test Data sheet
        	
        	//String sUserName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_UserName);
        	
			//Satys fixed - I only have 1 login and password
			String sUserName = Constant.Username;
			
			System.out.println("User Name:" + sUserName);

        	// send the UserName string to the UserName Textbox on the LogIN Page (Page Object Model (POM))
      				
            LogIn_Page.txtbx_UserName().sendKeys(sUserName);

            // Print logs for what we have just performed
            Log.info(sUserName+" is entered in UserName text box" );
            System.out.println(sUserName+" is entered in UserName text box");
            
           // String sPassword = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Password);
            
            String sPassword = Constant.Password;
            
            LogIn_Page.txtbx_Password().sendKeys(sPassword);
            Log.info(sPassword+" is entered in Password text box" );
            System.out.println(sPassword+" is entered in Password text box");
            
            LogIn_Page.btn_LogIn().click();
            Log.info("Click action is performed on Submit button");
            System.out.println("Click action is performed on Submit button"); 
            
            // I noticed in few runs that Selenium trys to perform 
            // the next action before the complete Page load
            // wait 10 secs separately before jumping out to next step
            System.out.println("wait 10 secs for LogOut link appears");
            Utils.waitForElement(Home_Page.lnk_LogOut());
            
            // TestNg Reporter logging - used once                   
            Reporter.log("SignIn Action successfully performed!");
            System.out.println("SignIn Action successfully performed!");
        }
    }
