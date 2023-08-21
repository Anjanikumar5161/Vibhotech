package employeeManagement;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.AppUtils;

public class AddEmployee extends AppUtils
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
		
	
		//Employee
		
		driver.findElement(By.xpath("//body/div[@id='layout-wrapper']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/div[1]/*[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Employee Management')]")).click();
        
		//add employee
		String empid = "tester_sai1123@gmail.com";
		String pempid = "testing1123@gmail.com";
		String mobno = "98480223312";
		
		driver.findElement(By.xpath("//body/div[@id='layout-wrapper']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("fname")).sendKeys("Anjani");
		driver.findElement(By.id("lname")).sendKeys("Kumar");
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("email_id")).sendKeys(empid);
		driver.findElement(By.id("personal_email_id")).sendKeys(pempid);
		Thread.sleep(2000);
		driver.findElement(By.id("phone_no")).sendKeys(mobno);
	
		// DOB Selection
		
		driver.findElement(By.id("dob")).click();
		Thread.sleep(2000);
		
		String dob = "16/May/1994";
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
		
	     driver.findElement(By.id("permanent_address")).sendKeys("Hyderabad");
	     driver.findElement(By.id("present_address")).sendKeys("Telangana");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@id='local_contact_name']")).sendKeys("Prudhvi");
	     driver.findElement(By.xpath("//input[@id='local_contact_relationship']")).sendKeys("Brother");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@id='local_contact_ph']")).sendKeys("9494910143");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
	     
	     // Company Details
	     
	     driver.findElement(By.id("designation_id")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//option[contains(text(),'test')]")).click();
	     driver.findElement(By.id("employment_type")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//option[contains(text(),'Permanent Employee')]")).click();
	     driver.findElement(By.id("date_of_joining")).click();
	     Thread.sleep(2000);
	     //calender selection
	     
	        String dob2 = "12-Jan-2028";
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
		     for(int k=1; k<rows.size(); k++)
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

		    driver.findElement(By.id("role_id")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//option[@value='Employee']")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("reporting_manager_id")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//select[@id='reporting_manager_id']//option[@value='1']")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("hr_manager_id")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//select[@id='hr_manager_id']//option[@value='1']")).click();
		    driver.findElement(By.id("lead_manager_id")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//select[@id='lead_manager_id']//option[@value='1']")).click();
		    driver.findElement(By.id("finance_manager_id")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//select[@id='finance_manager_id']//option[@value='1']")).click();
		    driver.findElement(By.id("client_id")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//select[@id='client_id']//option[@value='1']")).click();
		    driver.findElement(By.id("client_manager")).sendKeys("Chanakya");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//a[@href='#next']")).click();
		    
		    //Bank Details
		    String benname = "AnjaniKumar5";
		    String acno = "012345678910";
		    
		    
		    driver.findElement(By.id("bank_name")).sendKeys("SBI");
		    driver.findElement(By.id("account_type")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//option[@value='Saving Account']")).click();	    
		    driver.findElement(By.id("beneficiary_name")).sendKeys(benname);
		    Thread.sleep(2000);
		    driver.findElement(By.id("account_number")).sendKeys(acno);
		    driver.findElement(By.id("ifsc_code")).sendKeys("Sbin000000");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//a[@href='#next']")).click();
		    
		    //Identification Details
		    
		    String idno = "987654321034";
		    
		    driver.findElement(By.id("identification_type_id")).click();
		    driver.findElement(By.xpath("//select[@id='identification_type_id']//option[@value='1']")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("identification_number")).sendKeys(idno);
		    Thread.sleep(2000);
		   // driver.findElement(By.xpath("//span[contains(text(),'Choose file')]")).click();
		    
		   //FileUpload 
		    
		    WebElement id_image = driver.findElement(By.xpath("//input[@id='simage']"));
		    id_image.sendKeys("C:\\Users\\anjib\\OneDrive\\Desktop\\Vibes_Images\\Images5.jpg");        
		         
		          Thread.sleep(3000);
		          
		      driver.findElement(By.xpath("//a[contains(text(),'Finish')]")).click();
		  
		      if (
		      driver.findElement(By.xpath("//button[normalize-space()='OK']")).isDisplayed())
		      {
		          System.out.println("Successfully Added Employee Details - TestPass");
		      }else {
		    	  System.out.println("UnSuccessfully Added Employee Details - TestFail");
			}
		      Thread.sleep(3000);
		      
		      driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		   //   driver.close();
		     
		
		  //  driver.findElement(By.xpath("//a[normalize-space()='Back']")).click();
		    
		 //   AppUtils.closeApp();
		      
		      
		// Update Employee Details
		   String mno = "98480223341";   
		      
		  driver.findElement(By.xpath("//tbody/tr[1]/td[15]/a[1]")).click(); 
		  
		  driver.findElement(By.id("phone_no")).clear();
		  driver.findElement(By.id("phone_no")).sendKeys(mno);
		  driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[@href='#next']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[@href='#next']")).click();
		  Thread.sleep(2000);
		  
		//  driver.findElement(By.xpath("//a[@href='#next']")).click();
		  WebElement id_image2 = driver.findElement(By.xpath("//input[@id='simage']"));
		    id_image2.sendKeys("C:\\Users\\anjib\\OneDrive\\Desktop\\Vibes_Images\\Images3.jpg"); 
		    
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//a[@href='#next']")).click();
		      
		   Thread.sleep(2000); 
		  driver.findElement(By.xpath("//a[normalize-space()='Finish']")).click();
		  
		  if (
			      driver.findElement(By.xpath("//button[normalize-space()='OK']")).isDisplayed())
			      {
			          System.out.println("Successfully Added Employee Details - TestPass");
			      }else {
			    	  System.out.println("UnSuccessfully Added Employee Details - TestFail");
				}
			      Thread.sleep(3000);
			      
			      driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
			   
		 
	  // Search Employee
	/*		      
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("sai");
		WebElement emptable = driver.findElement(By.xpath("//tbody"));
		List<WebElement> rows1 = emptable.findElements(By.tagName("tr"));
		for (int i=1; i<rows1.size(); i++) 
		{
			List<WebElement> cols = rows1.get(i).findElements(By.tagName("td"));
  			if(cols.get(2).getText().equalsIgnoreCase("sai"))
  			{
  				System.out.println("New Employee Registered is Displyed in the Employee List , Test Pass");
  			}else
  			{
  				System.out.println("New Employee Registered is not Displyed in the Employee List , Test Fail");
  			}
		}
		*/
		
		AppUtils.LogOut();
		AppUtils.closeApp();
			      
			      
			      
	}
	}
	
