package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class Confirmation_Page extends BaseClass{
    private static WebElement element = null;
    public static String sProductName;
    public static String sProductPrice;
    
    public Confirmation_Page(WebDriver driver){
        	super(driver);
    }    
    public static WebElement txt_ProductName() throws Exception{
    	
		System.out.println("Inside Confirmation_Page: txt_ProductName() method");

        try{ 
        	 element = driver.findElement(By.xpath(".//*[@id='post-30']/div/div[2]/table/tbody/tr/td[1]"));
             Log.info("Product name found on Confirmation Page");
     		 System.out.println("Product name found on Confirmation Page");

        }catch (Exception e){
       		 Log.error("Product name Not found on Confirmation Page");
       		 System.out.println("Product name Not found on Confirmation Page");
       		throw(e);
       		}
       	return element;
    }
    
    public static WebElement txt_ProductPrice() throws Exception{
    	
		System.out.println("Inside Confirmation_Page: txt_ProductPrice() method");
		
        try{ 
        	 element = driver.findElement(By.xpath(".//*[@id='post-30']/div/div[2]/table/tbody/tr/td[4]"));
             Log.info("Product price found on Confirmation Page");
             System.out.println("Product price found on Confirmation Page");
        }catch (Exception e){
       		 Log.error("Product price Not found on Confirmation Page");
       		 System.out.println("Product price found on Confirmation Page");
       		throw(e);
       		}
       	return element;
    }
}
