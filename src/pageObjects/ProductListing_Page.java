package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
 
public class ProductListing_Page extends BaseClass {
	private static WebElement element;
    public ProductListing_Page(WebDriver driver){
    	super(driver);
    	} 
     public static class Product_1{
 

    	 public static WebElement txt_Price() throws Exception{
    		 
   	  		System.out.println("Inside ProductListing_Page: Product_1: txt_Price() method");       	

    		 
         	 element = null;
           	try{
           		element= driver.findElement(By.xpath(".//*[@id='default_products_page_container']/div[3]/div[2]/form/div[1]/p[1]/span[2]"));
           		Log.info("Product 1 Price found");
           		System.out.println("Product 1 Price found");
           	}catch (Exception e){
           		Log.error("Product 1 Sales Price Not found");
           		System.out.println("Product 1 Sales Price Not found");
           		
           		throw(e);
           		}
           	return element;
            }
 
  
         public static WebElement img_Product() throws Exception{
        	 
        	 System.out.println("Inside ProductListing_Page: Product_1: img_Product() method");
        	 
        	 element = null;
          	try{
          		element= driver.findElement(By.xpath(".//*[@id='default_products_page_container']/div[3]/div[1]/a"));
          		Log.info("Product 1 Image found");
          		System.out.println("Product 1 Image found");
          	}catch (Exception e){
          		Log.error("Product 1 Image Not found");
          		System.out.println("Product 1 Image Not found");
          		throw(e);
          		}
          	return element;
            }
         
 
         public static WebElement txt_Name() throws Exception{
        	 
        	System.out.println("Inside ProductListing_Page: Product_1: txt_Name() method");
        	 
            element = null;
         	try{
         		element= driver.findElement(By.xpath(".//*[@id='default_products_page_container']/div[3]/div[2]/h2"));
         		Log.info("Product 1 Name found");
         		System.out.println("Product 1 Name found");
         	}catch (Exception e){
         		Log.error("Product 1 Name Not found");
         		System.out.println("Product 1 Name Not found");
         		throw(e);
         		}
         	return element;
            }
 
 
         public static WebElement btn_AddToCart() throws Exception{
        	 
        	 System.out.println("Inside ProductListing_Page: Product_1: btn_AddToCart() method");
        	 
        	  element = null;
           	try{
           		element= driver.findElement(By.xpath(".//*[@id='default_products_page_container']/div[3]/div[2]/form/div[2]/div[1]/span/input"));
           		Log.info("Product 1: Add to Cart button found");
           		System.out.println("Product 1: Add to Cart button found");
           	}catch (Exception e){
           		Log.error("Product 1 Add to Cart button Not found");
           		System.out.println("Product 1: Add to Cart button Not found");
           		throw(e);
           		}
           	return element;
         	}
 
         }
     
	public static class Product_2{
	 
	         
		 public static WebElement txt_Price() throws Exception{
			 
			 System.out.println("Inside ProductListing_Page: Product_2: txt_Price()  method");
			 
	    	 element = null;
	    	 
	       	try{
	       		element= driver.findElement(By.xpath(".//*[@id='default_products_page_container']/div[4]/div[2]/form/div[1]/p[1]/span[2]"));
	       		Log.info("Product 2 Price found");
	       		System.out.println("Product 2 Price found");
	       	}catch (Exception e){
	       		Log.error("Product 2 Sales Price Not found");
	       		System.out.println("Product 2 Price Not found");
	       		throw(e);
	       		}
	       	return element;
	        }	
	
	     public static WebElement img_Product() throws Exception{
	    	 
	    	 System.out.println("Inside ProductListing_Page: Product_2: img_Product() method");
	    	 
	    	 element = null;
	    	 
	      	try{
	      		element= driver.findElement(By.xpath(".//*[@id='default_products_page_container']/div[4]/div[1]/a"));
	      		Log.info("Product 2 Image found");
	      		System.out.println("Product 2 Image found");
	      	}catch (Exception e){
	      		Log.error("Product 2 Image Not found");
	      		System.out.println("Product 2 Image Not found");
	      		throw(e);
	      		}
	      	return element;
	        }
	     	
	     public static WebElement txt_Name() throws Exception{
	    	
	    	System.out.println("Inside ProductListing_Page: Product_2: txt_Name() method"); 
	    	 
	        element = null;
	        
	     	try{
	     		element= driver.findElement(By.xpath(".//*[@id='default_products_page_container']/div[3]/div[2]/h2"));
	     		Log.info("Product 2 Name found");
	     		System.out.println("Product 2 Name found");
	     	}catch (Exception e){
	     		Log.error("Product 2 Name Not found");
	     		System.out.println("Product 2 Name Not found");
	     		throw(e);
	     		}
	     	return element;
	        }
	
	
	     public static WebElement btn_AddToCart() throws Exception{
	    	 
	    	 System.out.println("Inside ProductListing_Page: Product_2: btn_AddToCart() method");
	    	 
	    	 element = null;
	    	  
	       	try{
	       		element= driver.findElement(By.xpath(".//*[@id='default_products_page_container']/div[4]/div[2]/form/div[2]/div[1]/span/input"));
	       		Log.info("Product 2 Add to Cart button found");
	       		System.out.println("Product 2 Add to Cart button found");
	       	}catch (Exception e){
	       		Log.error("Product 2 Add to Cart button Not found");
	       		System.out.println("Product 2 Add to Cart button Not found");
	       		throw(e);
	       		}
	       	return element;
	     	}
	 
	     }
	
	
	public static class PopUpAddToCart{
		 
	    
		 public static WebElement btn_GoToCart() throws Exception{
			 
			 System.out.println("Inside ProductListing_Page: PopUpAddToCart: btn_GoToCart() method");	 
			 
	   	 element = null;
	      	try{
	      		element= driver.findElement(By.xpath(".//*[@id='fancy_notification_content']/a[1]"));
	      		Log.info("Go to Cart button found on the Cart Pop Up window");
	      		System.out.println("Go to Cart button found on the Cart Pop Up window");
	      	}catch (Exception e){
	      		Log.info("Go to Cart button found on the Cart Pop Up window");
	      		System.out.println("Go to Cart button Not found on the Cart Pop Up window");
	      		throw(e);
	      		}
	      	return element;
	       }
		 
		 public static WebElement btn_ContShopping() throws Exception{
			 
			 System.out.println("Inside ProductListing_Page: PopUpAddToCart: btn_ContShopping() method");
			 
		   	 element = null;
		   	 
		      	try{
		      		element= driver.findElement(By.xpath(".//*[@id='fancy_notification_content']/a[2]"));
		      		Log.info("Continue Shopping button found on Cart Pop Up window");
		      		System.out.println("Continue Shopping button found on Cart Pop Up window");
		      	}catch (Exception e){
		      		Log.info("Continue Shopping button Not found on Cart Pop Up window");
		      		System.out.println("Continue Shopping button Not found on Cart Pop Up window");
		      		throw(e);
		      		}
		      	return element;
		       }
		}	 
}