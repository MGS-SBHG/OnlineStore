package pageObjects;
        import org.openqa.selenium.*;

import utility.Log;
    public class LogIn_Page extends BaseClass {
           private static WebElement element = null;
        
        public LogIn_Page(WebDriver driver){
            	super(driver);
        }     
        public static WebElement txtbx_UserName() throws Exception{
        	
    		System.out.println("Inside Login_Page: txtbx_UserName() method");       	

        	try{
	            element = driver.findElement(By.id("log"));
	            Log.info("Username text box found on Login Page");
	            System.out.println("Username text box found on Login Page");
        	}catch (Exception e){
           		Log.error("UserName text box Not found on Login Page");
	            System.out.println("Username text box Not found on Login Page");
           		throw(e);
           		}
           	return element;
            }
        
        public static WebElement txtbx_Password() throws Exception{
        	
    		System.out.println("Inside Login_Page: txtbx_Password() method");
    		
        	try{
	        	element = driver.findElement(By.id("pwd"));
	            Log.info("Password text box is found on the Login page");
	            System.out.println("Password text box found on Login Page");
        	}catch (Exception e){
        		Log.error("Password text box Not found on Login Page");
        		System.out.println("Password text box Not found on Login Page");
           		throw(e);
           		}
           	return element;
        }
        
        public static WebElement btn_LogIn() throws Exception{
        	
        	System.out.println("Inside Login_Page: btn_LogIn() method");
        	
        	try{
	        	element = driver.findElement(By.id("login"));
	            Log.info("Submit button found on Login page");
	            System.out.println("Submit button found on Login Page");
	            
        	}catch (Exception e){
        		Log.error("Submit button is not found on the Login Page");
        		System.out.println("Submit button Not found on Login Page"); 	        		
           		throw(e);
           		}
           	return element;
        }
    }
