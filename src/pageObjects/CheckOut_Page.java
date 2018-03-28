package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class CheckOut_Page extends BaseClass{
		private static WebElement element;
		public static String sProductName;
		public static String sProductPrice;
		
     public CheckOut_Page(WebDriver driver){
    	super(driver);
    	}
     
	 public static WebElement txt_ProductPrice() throws Exception{
    	 element = null;
    		System.out.println("Inside CheckOut_Page: txt_ProductPrice() method");
    		
       	try{ 	            		
       		element= driver.findElement(By.xpath(".//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[4]"));
       		Log.info("Product Price for purchased product found on Check Out Page");
       		System.out.println("Product Price for purchased product found on Check Out Page");
       		
       	}catch (Exception e){
       		Log.error("Product Price for purchased product Not found on Check Out page!");
       		System.out.println("Product Price for purchased product Not found on Check Out Page!");
       		throw(e);
       		}
       	return element;
        }
	 
	 public static WebElement txt_ProductName() throws Exception{
    	 element = null;
    	 
 		System.out.println("Inside CheckOut_Page: txt_ProductName() method");
    	 
       	try{
       		element= driver.findElement(By.xpath(".//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[2]/a"));
       		Log.info("Product Name for purchased product found on Check Out Page");
    		System.out.println("Product Name for purchased product found on Check Out Page");
       	}catch (Exception e){
       		Log.error("Product Name for purchased product Not found on Check Out Page");
       		System.out.println("Product Name for purchased product Not found on Check Out Page");
       		throw(e);
       		}
       	return element;
        }
	 
	 public static WebElement btn_Continue() throws Exception{
    	 element = null;
    	 
  		System.out.println("Inside CheckOut_Page: btn_Continue() method");   	 
    	 
       	try{
       		element= driver.findElement(By.xpath(".//*[@id='checkout_page_container']/div[1]/a/span"));
       		Log.info("Continue button found on Check Out Page");
       		System.out.println("Continue button found on Check Out Page");
       		
       	}catch (Exception e){
       		Log.error("Continue button Not found on Check Out Page");
       		System.out.println("Continue button Not found on Check Out Page");
       		throw(e);
       		}
       	return element;
        }
}
