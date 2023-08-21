package assets;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utils.AppUtils;

public class AddAssets extends AppUtils
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
		
	
		
		//Add Assets
		
		driver.findElement(By.xpath("//body/div[@id='layout-wrapper']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='layout-wrapper']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
       
        driver.findElement(By.xpath("//a[normalize-space()='Add Asset']")).click();
        driver.findElement(By.id("name")).sendKeys("anjani");
       
        
     //   driver.findElement(By.xpath("//div[@class='row']//div[2]//div[1]//div[1]//a[1]//i[1]")).click();
     //   driver.findElement(By.xpath("//input[@id='val']")).sendKeys("ee");
        
    //    driver.findElement(By.xpath("//button[@type='button'][normalize-space()='Save']")).sendKeys(Keys.ENTER);
        WebElement catelement = driver.findElement(By.id("supplier_id"));
        Select cat = new Select(driver.findElement(By.id("supplier_id")));
        cat.selectByVisibleText("DTDC");
        
    
        try {
        	driver.findElement(By.id("page-header-user-dropdown")).isDisplayed();
        	System.out.println("Supplier details Added Successfully Test Pass");
		} catch (Exception e)
        {
			System.out.println("Test Fail");
			}
        
        // Select Brand
        Thread.sleep(3000);
        driver.findElement(By.id("brand_id")).click();
    //    driver.findElement(By.id("val")).click();
    //    driver.findElement(By.id("val")).sendKeys("Sony");
    //    driver.findElement(By.xpath("//button[@type='button'][normalize-space()='Save']")).sendKeys(Keys.ENTER);
        
        
        WebElement brandname = driver.findElement(By.id("brand_id"));
        Select name = new Select(brandname);
        name.selectByVisibleText("DELL");
        try {
			driver.findElement(By.id("brand_id")).isDisplayed();
			System.out.println("Brand details Added Successfully Test Pass");
		} catch (Exception e)
        {
			System.out.println("Test Fail");
		}
		
        
        // Select Assert Type
        
      //  driver.findElement(By.id("asset_type_id")).click();
        
        WebElement assertname = driver.findElement(By.id("asset_type_id"));
        Select name2 = new Select(assertname);
        name2.selectByVisibleText("LAPTOP");
        
        try {
			driver.findElement(By.id("brand_id")).isDisplayed();
        	System.out.println("selection of Assert type is Successfully Test Pass");
		} catch (Exception e)
        {
			System.out.println("Test Fail");
		}
        
       // Select Purchase Date
        
        String pdate = "16/Jun/2024";
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
       
        
        
        
        
        
        
        
        
        //Select status  (Active/ InActive)
        
        WebElement statusfield = driver.findElement(By.id("status_id"));
        Select stat = new Select(statusfield);
        stat.selectByVisibleText("WORKING");
        
        try {
			driver.findElement(By.id("brand_id")).isDisplayed();
			System.out.println("Selection of Status Is Successfully  Test Pass");
		} catch (Exception e) {
			System.out.println("Test Fail");
		}
        
        //Select Location
        
        WebElement locname = driver.findElement(By.id("location_id"));
        Select lname = new Select(locname);
        lname.selectByVisibleText("HYDERABAD");
        
        try {
			driver.findElement(By.id("brand_id")).isDisplayed();
			System.out.println("Selection of Status Is Successfully  Test Pass");
		} catch (Exception e) {
			System.out.println("Test Fail");
		}
	
        driver.findElement(By.id("serial_no")).sendKeys("01234567895");
        driver.findElement(By.id("cost")).sendKeys("72000");
        
        //Selecting The Warrenty Date
        
        String expdate = "16/Jun/2025";
        String[] dt2 = expdate.split("/");
        String date2 = dt2[0];
        String month2 = dt2[1];
        String year2 = dt2[2];
        
        String mm2 = month2;
        String yy2 = year2;
        
        
        System.out.println(mm2);
        System.out.println(yy2);
        
        Thread.sleep(3000);
        driver.findElement(By.id("warranty")).click();
        String calyear2 = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
        System.out.println(calyear2);
        
        while(!calyear2.equalsIgnoreCase(yy2))
        		{
        	 driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        	 calyear2 = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
        	 
        		}
        String calmonth2 = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
        System.out.println(calmonth2);
        
        while(!calmonth2.equalsIgnoreCase(mm2))
        {
        	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        	calmonth2 = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
        }
        
        WebElement table2 = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));
        List<WebElement> rows2 = table2.findElements(By.tagName("tr"));
          for (int k=1; k< rows2.size(); k++)
          { 
       List<WebElement> cols2 = rows2.get(k).findElements(By.tagName("td"));
          for (WebElement element : cols2)
          {
        	  if (element.getText().equals(date2))
        	  {
				element.click();
				break;
			}
          }
        
        
        
          }
        
          
       // Update Assets
          
          
        driver.findElement(By.id("description")).sendKeys("Make A Note");
        Thread.sleep(2000);
        WebElement id_image2 = driver.findElement(By.xpath("//input[@id='simage']"));
	    id_image2.sendKeys("C:\\Users\\anjib\\OneDrive\\Desktop\\Vibes_Images\\Images3.jpg"); 
	    
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Save']")).sendKeys(Keys.ENTER);
	
	
        if (
			      driver.findElement(By.xpath("//button[normalize-space()='OK']")).isDisplayed())
			      {
			          System.out.println("Successfully Added Asst Details - TestPass");
			      }else {
			    	  System.out.println("UnSuccessfully Added Asset Details - TestFail");
				}
			      Thread.sleep(3000);
			      
			      driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
			   

			      
			driver.findElement(By.xpath("//tbody/tr[2]/td[8]/div[1]/a[1]")).click();
			driver.findElement(By.xpath("//select[@id='brand_id']")).click();
			driver.findElement(By.xpath("//option[contains(text(),'Printer')]")).click();
			      
			driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
			
			 if (
				      driver.findElement(By.xpath("//button[normalize-space()='OK']")).isDisplayed())
				      {
				          System.out.println("Successfully Updated Assets Details - TestPass");
				      }else {
				    	  System.out.println("UnSuccessfully Updated Assets Details - TestFail");
					}
				      Thread.sleep(3000);
				      
				      driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
				        
			   Thread.sleep(2000); 
			   
			   
	  // Search Asset Name
			   
        // //tbody/tr[1]/td[2]
                
/*			   driver.findElement(By.xpath("//input[@type='search']")).sendKeys("lap");
			   
			   String ename = "laptop";
			   
				WebElement emptable = driver.findElement(By.tagName("tbody"));
				List<WebElement> rows1 = emptable.findElements(By.tagName("tr"));
				for (int i=1; i<rows1.size(); i++) 
				{
					List<WebElement> cols1 = rows1.get(i).findElements(By.tagName("td"));
					
		  			if(cols1.get(0).getText().equals(ename))
		  			{
		  				System.out.println("New Asset Name is Displyed in the Employee List , Test Pass");
		  			}else
		  			{
		  				System.out.println("New Asset name is not Displyed in the Employee List , Test Fail");
		  			}
				}
		*/	   
			      
			      AppUtils.LogOut();
			      AppUtils.closeApp();
							      
}
}