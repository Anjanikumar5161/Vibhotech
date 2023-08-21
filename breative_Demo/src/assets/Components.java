package assets;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.AppUtils;

public class Components extends AppUtils
{

	public static String url = "https://vibeshr.vibhotech.com/in-staging/master/";
    public static String uid = "ADMIN";
    public static String pwd = "12345";
    
    
	public static void main(String[] args) throws Throwable
	{
	  
		AppUtils.LaunchApp(url);
		
		driver.findElement(By.id("username")).sendKeys(uid);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
		
	
		
		// Click Assets
		
		driver.findElement(By.xpath("//body/div[@id='layout-wrapper']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Components']")).click();
      
        // Add Components
        
        
        
        driver.findElement(By.xpath("//a[normalize-space()='Add Component']")).click();
        
        String ename = "Raj (VT214098834)"; 
        
        driver.findElement(By.xpath("//span[@role='presentation']")).click();
		
    	
    		Thread.sleep(2000);
    		
    		
    		List<WebElement> keywordlist = driver.findElement(By.id("select2-asset_id-results")).findElements(By.tagName("li"));
    		System.out.println(keywordlist.size());
    	
    		
    		  for (int i = 1; i < keywordlist.size(); i++)
    		  {
    			if (keywordlist.get(i).getText().equalsIgnoreCase(ename))
    			{
    				System.out.println("testpass");
    				keywordlist.get(i).click();
    			    break;
    			}
    		}
    		
    	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Anjani");
    	driver.findElement(By.xpath("//input[@id='qty']")).sendKeys("5");
    	driver.findElement(By.xpath("//select[@id='asset_type_id']")).click();
    	driver.findElement(By.xpath("//option[normalize-space()='LAPTOP']")).click();
    	driver.findElement(By.xpath("//select[@id='brand_id']")).click();
    	driver.findElement(By.xpath("//option[normalize-space()='DELL']")).click();
    		
    	// Calender Selection
    	
    	String pdate = "19/May/2024";
        String[] dt = pdate.split("/");
        String date = dt[0];
        String month = dt[1];
        String year =dt[2];
        
      //  String mmyy = month+""+year;
        String mm = month;
        String yy = year;
        System.out.println(mm);
        System.out.println(yy);
        
        Thread.sleep(3000);
        driver.findElement(By.id("purchase_date")).click();
        String calyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
        System.out.println(calyear);
        
        while (!calyear.equalsIgnoreCase(yy))
        {
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			calyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		}
        String calmonth = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
        System.out.println(calmonth);
        
        while (!calmonth.equalsIgnoreCase(mm))
        {
        	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        	calmonth = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
        	
        }
        
        WebElement table = driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/table[1]"));
        
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        
          for(int i=1; i<rows.size(); i++)
          {
        List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
        
          for(WebElement element : cols)
             {
        	  if(element.getText().equals(date)) 
        	  {
        		  element.click();
        		  break;
        	  }
        	  
             }
          }
       
        
      //Select Status
          
          driver.findElement(By.xpath("//select[@id='status_id']")).click();
          driver.findElement(By.xpath("//option[normalize-space()='WORKING']")).click();
          
          driver.findElement(By.xpath("//input[@id='serial_no']")).sendKeys("12345");
          
          driver.findElement(By.xpath("//select[@id='supplier_id']")).click();
          driver.findElement(By.xpath("//option[normalize-space()='DTDC']")).click();
          driver.findElement(By.xpath("//select[@id='location_id']")).click();
          driver.findElement(By.xpath("//option[normalize-space()='HYDERABAD']")).click();
          driver.findElement(By.xpath("//input[@id='cost']")).sendKeys("50000");
    
          
      	
      	// Calender Selection
      	
          String pdate1 = "19/May/2026";
          String[] dt1 = pdate1.split("/");
          String date1 = dt1[0];
          String month1 = dt1[1];
          String year1 =dt1[2];
          
        //  String mmyy = month+""+year;
          String mm1 = month1;
          String yy1 = year1;
          System.out.println(mm1);
          System.out.println(yy1);
          
          Thread.sleep(3000);
          driver.findElement(By.xpath("//input[@id='warranty']")).click();
          String calyear1 = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
          System.out.println(calyear1);
          
          while (!calyear1.equalsIgnoreCase(yy1))
          {
  			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
  			calyear1 = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
  		}
          String calmonth1 = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
          System.out.println(calmonth1);
          
          while (!calmonth1.equalsIgnoreCase(mm1))
          {
          	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
          	calmonth1 = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
          	
          }
          
          WebElement table1 = driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/table[1]"));
          
          List<WebElement> rows1 = table1.findElements(By.tagName("tr"));
          
            for(int i=1; i<rows.size(); i++)
            {
          List<WebElement> cols1 = rows1.get(i).findElements(By.tagName("td"));
          
            for(WebElement element : cols1)
               {
          	  if(element.getText().equals(date1)) 
          	  {
          		  element.click();
          		  break;
          	  }
          	  
               }
            }
          
           driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("NOTE");
           
           WebElement fileimage = driver.findElement(By.xpath("//input[@id='simage']"));
           fileimage.sendKeys("C:\\\\Users\\\\anjib\\\\OneDrive\\\\Desktop\\\\Vibes_Images\\\\Images4.jpg");
           
           Thread.sleep(2000);
           driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Save']")).click();
           
           if (
     		      driver.findElement(By.xpath("//button[normalize-space()='OK']")).isDisplayed())
     		      {
     		          System.out.println("Successfully Added Component Details - TestPass");
     		      }else {
     		    	  System.out.println("UnSuccessfully Added Component Details - TestFail");
     			}
     		      Thread.sleep(3000);
     		      
     		      driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
     		  
     		     
 // Update Components
     		      
     		      driver.findElement(By.xpath("//tbody/tr[1]/td[7]/a[1]")).click();
     		      driver.findElement(By.xpath("//input[@id='qty']")).clear();
     		      driver.findElement(By.xpath("//input[@id='qty']")).sendKeys("5");
     		      Thread.sleep(2000);
     		      
     		     WebElement fileimage1 = driver.findElement(By.xpath("//input[@id='simage']"));
     	         fileimage1.sendKeys("C:\\\\Users\\\\anjib\\\\OneDrive\\\\Desktop\\\\Vibes_Images\\\\Images5.jpg");
     	           
     	         driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
     	         
     	        if (
     				      driver.findElement(By.xpath("//button[normalize-space()='OK']")).isDisplayed())
     				      {
     				          System.out.println("Successfully Updated Components Details - TestPass");
     				      }else {
     				    	  System.out.println("UnSuccessfully Updated Components Details - TestFail");
     					}
     				      Thread.sleep(3000);
     				      
     				      driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
    
     				      
      // Search Component
     				      
     				    String enm = "mouse";
     		
     				    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("mouse");
     					WebElement emptable = driver.findElement(By.xpath("//table[@id='datatable']"));
     					List<WebElement> rows2 = emptable.findElements(By.xpath("//tr[@class='odd']"));
     					for (int i=1; i<rows2.size(); i++) 
     					{
     						List<WebElement> cols2 = rows2.get(i).findElements(By.xpath("//tr[@class='odd']"));
     			  			if(cols2.get(2).getText().equalsIgnoreCase(enm))
     			  			{
     			  				System.out.println("New Employee Registered is Displyed in the Employee List , Test Pass");
     			  			}else
     			  			{
     			  				System.out.println("New Employee Registered is not Displyed in the Employee List , Test Fail");
     			  			}
     					}
     					
     					AppUtils.LogOut();
     					AppUtils.closeApp();
     						      
	}
	
}
