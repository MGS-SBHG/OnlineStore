package pageObjects;
        import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
import utility.Utils;
    public class Home_Page extends BaseClass{
            private static WebElement element = null;
           
        public Home_Page(WebDriver driver){
            	super(driver);
        }    
        public static WebElement lnk_MyAccount() throws Exception{
        	
    		System.out.println("Inside Home_Page: lnk_MyAccount() method");       	
        	
            try{ 
	        	 //element = driver.findElement(By.xpath(".//*[@id='account']/a"));
	        	 element = driver.findElement(By.xpath(".//*[@id='account']x:a"));
	             Log.info("My Account link found on Home Page!");
	             System.out.println("My Account link found on Home Page!");
            }catch (Exception e){
           		Log.error("My Acocunt link Not found on Home Page!");
           	 System.out.println("My Account link Not found Home Page!");
           		throw(e);
           		}
           	return element;
        }
        
        public static WebElement lnk_LogOut() throws Exception{
        	
        	System.out.println("Inside Home_Page: lnk_LogOut() method");
        	
            try{
	        	element = driver.findElement(By.id("account_logout"));
	        
	            Log.info("Log Out link found on Home Page");
	            System.out.println("Log Out link found on Home Page");
            }catch (Exception e){
            	Log.error("Log Out link found on Home Page");
            	System.out.println("Log Out link Not found on Home Page");
           		throw(e);
           		}
           	return element;
        }
        
        public static class TopNavigation{
        	
        	public static class Product_Type{
        		
        			static WebElement mainElement;
      		
        		public static void Accessories() throws Exception{
        			
                	System.out.println("Inside Home_page: Product_Type: Accessories() method");

        			try{
	        			mainElement = driver.findElement(By.linkText("Product Category"));
	        			
	        			Log.info("Product category Accessories link found under Top Navigation");
	        			System.out.println("Product category  Accessories link found under Top Navigation");
	        			
	        			Utils.mouseHoverAction(mainElement, "Accessories");
        			}catch (Exception e){
        				Log.error("Product category  Accessories link Not found under Top Navigation");
	        			System.out.println("Product category  Accessories link Not found under Top Navigation");
        				throw(e);
        			}
                   }
        		
        		public static void iMacs() throws Exception{
        			
        			System.out.println("Inside Home_page: Product_Type: iMacs() method");
        			
        			try{
	        			mainElement = driver.findElement(By.linkText("Product Category"));
	        			Log.info("Product category iMacs link is found under Top Navigation");
	        			System.out.println("Product category iMacs() link found under Top Navigation");
	        			Utils.mouseHoverAction(mainElement, "iMacs");
        			}catch (Exception e){
        				Log.error("Accessories link iMacs Not found under Product Category");
        				System.out.println("Product category iMacs() link Not found under Top Navigation");
        				throw(e);
        			}
                   }
        		
        		public static void iPads() throws Exception{
        			
        			System.out.println("Inside Home_page: Product_Type: iPads() method");
        			
        			try{
	        			mainElement = driver.findElement(By.linkText("Product Category"));
	        			Log.info("Product category link is found under Top Navigation");
	        			System.out.println("Product category iPads link found under Top Navigation");
	        			Utils.mouseHoverAction(mainElement, "iPads");
        			}catch (Exception e){
        				Log.error("Accessories link is not found under Product Category");
        				System.out.println("Product category iPads link Not found under Top Navigation");
        				throw(e);
        			}
                   }
        		
        		public static void iPhones() throws Exception{
        			
        			System.out.println("Inside Home_page: Product_Type: iPhones() method");
        			
        			try{
	        			mainElement = driver.findElement(By.linkText("Product Category"));
	        			Log.info("Product category link found under Top Navigation");
	        			System.out.println("Product category iPhones link found under Top Navigation");
	        			Utils.mouseHoverAction(mainElement, "iPhones");
        			}catch (Exception e){
        				Log.error("Accessories link is not found under Product Category");
        				System.out.println("Product category iPhones link Not found under Top Navigation");
        				throw(e);
        			}
                   }        		
        	}        	
        }              
    }
