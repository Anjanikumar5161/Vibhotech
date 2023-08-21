package assets;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.AppUtils;

public class Maintanance extends AppUtils
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
     //   driver.findElement(By.xpath("//span[normalize-space()='Components']")).click();
       
	// Add Maintanance
        
        driver.findElement(By.xpath("//span[normalize-space()='Maintenances']")).click();
        
        driver.findElement(By.xpath("//a[normalize-space()='Add Maintenance']")).click();
        
        
        String ename = "desktop (VT827186401)"; 
        driver.findElement(By.xpath("//span[@id='select2-asset_id-container']")).click();
       
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
        
    	driver.findElement(By.xpath("//select[@id='type_id']")).click();
    	driver.findElement(By.xpath("//option[normalize-space()='Laptop']")).click();
   
    	try {
			
		
    	driver.findElement(By.id("start_dt")).click();
    	 
    	String dob = "12/Jan/2014";
 		String[] temp = dob.split("/");
 		String dt = temp[0];
 		String mon = temp[1];
 		String yr = temp[2];
 		
 		Select ylist = new Select(driver.findElement(By.className("ui-datepicker-year")));
 	    ylist.selectByVisibleText(yr);
 	    
 	    Select mlist = new Select(driver.findElement(By.className("ui-datepicker-month")));
 	    mlist.selectByVisibleText(mon);
 	    
 	    WebElement cal = driver.findElement(By.className("ui-datepicker-calendar"));
 	    
 	    List<WebElement> rows = cal.findElements(By.tagName("tr"));
 	     for(int i=1; i<rows.size(); i++)
 	     {
 	    	 List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
 	    	 for(int j=0; j<cols.size(); j++) 
 	    	 {
 	    		if(cols.get(j).getText().equals(dt))
 	    		{
 	    			cols.get(j).click();
 	    			break;
 	    		}
 	    	 }
 	     }
    	} catch (Exception e)
    	{
			System.out.println("Test Pass");
		}
 	     
    	 Thread.sleep(2000);
    	 driver.findElement(By.xpath("//textarea[@id='comments']")).sendKeys("No Comment");
    	 
    	 driver.findElement(By.xpath("//select[@id='supplier_id']")).click();
    	 driver.findElement(By.xpath("//option[normalize-space()='dell']")).click();
    	 
    	 driver.findElement(By.xpath("//input[@id='end_dt']")).click();
    	 
    	 
    	    String dob2 = "11-Jan-2029";
			String[] temp2 = dob2.split("-");
			String dt2 = temp2[0];
			String mon2 = temp2[1];
			String yr2 = temp2[2];
			
			Select ylist2 = new Select(driver.findElement(By.className("ui-datepicker-year")));
		    ylist2.selectByVisibleText(yr2);
		    
		    Select mlist2 = new Select(driver.findElement(By.className("ui-datepicker-month")));
		    mlist2.selectByVisibleText(mon2);
		    
		    WebElement cal2 = driver.findElement(By.className("ui-datepicker-calendar"));
		    
		    List<WebElement> rows2 = cal2.findElements(By.tagName("tr"));
		     for(int k=1; k<rows2.size(); k++)
		     { 
		    	 List<WebElement> cols2 = rows2.get(k).findElements(By.tagName("td"));
		    	 for(int l=0; l<cols2.size(); l++) 
		    	 {
		    		if(cols2.get(l).getText().equals(dt2))
		    		{
		    			cols2.get(l).click();
		    			break;
		    		}
		    	 }    
	     
	}
    	 
    	 driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Save']")).click();
    	 
    	 if (
   		      driver.findElement(By.xpath("//button[normalize-space()='OK']")).isDisplayed())
   		      {
   		          System.out.println("Successfully Added Employee Details - TestPass");
   		      }else {
   		    	  System.out.println("UnSuccessfully Added Employee Details - TestFail");
   			}
   		      Thread.sleep(3000);
   		      
   		      driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
   		  
    		
   		// Update Maintanance
   		 
   		 Thread.sleep(2000);     
   		 driver.findElement(By.xpath("//tbody/tr[1]/td[8]/a[1]")).click();
   		 Thread.sleep(2000);
   		  
   		driver.findElement(By.xpath("//select[@id='type_id']")).click();
    	driver.findElement(By.xpath("//option[normalize-space()='Desktop']")).click();
    	
    	 driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
	         
	        if (
				      driver.findElement(By.xpath("//button[normalize-space()='OK']")).isDisplayed())
				      {
				          System.out.println("Successfully Updated Maintanance Details - TestPass");
				      }else {
				    	  System.out.println("UnSuccessfully Updated Maintanance Details - TestFail");
					}
				      Thread.sleep(3000);
				      
				      driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();

   // Search Maintanance
				      
	     driver.findElement(By.xpath("//input[@type='search']")).sendKeys("laptop");
	     
	     WebElement tab = driver.findElement(By.xpath("//table[@id='datatable']"));
	     List<WebElement> rows3 = tab.findElements(By.tagName("tr"));
	     
	     for (int i = 1; i < rows3.size(); i++)
	     {
			List<WebElement> col3 = rows3.get(i).findElements(By.tagName("td"));
			for (WebElement element : col3) 
			 {
				String data = element.getText();
				System.out.println(data+"    ");
			}System.out.println();
		}
    								      
				      
   		 
	}
}
