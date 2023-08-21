package AddEmployee;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.AppUtils;

public class Demo extends AppUtils
{

	 public static String url = "https://breative.vibhohcm.com";
	 public static String url1 = "https://breative.vibhohcm.com";
	 
     public static String uid = "BREATIVE";   
     public static String pwd = "root";
     
     public static String uid1 = "BRTV07";
     public static String pwd1 = "anjani123";
     
     
     static String ename ="Anjani Kumar (VTIN18)";
     public static void main(String[] args) throws Throwable
	   {
	  
		AppUtils.LaunchApp(url);
		
		driver.findElement(By.id("username")).sendKeys(uid);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
		
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[contains(text(),'Configuration Menu')]")).click();
	    Thread.sleep(2000);
	    
	    // Add Designation
	    
	    driver.findElement(By.xpath("//span[contains(text(),'Designations')]")).click();
	    driver.findElement(By.xpath("//body/div[@id='layout-wrapper']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
	    
	    driver.findElement(By.xpath("//input[@id='designation_name']")).sendKeys("HTML");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
	    
	    
	    if (driver.findElement(By.xpath("//button[normalize-space()='OK']")).isDisplayed())
		 { System.out.println("Successfully Added Employee Designation Details - TestPass");
			      }else {
			    	  System.out.println("UnSuccessfully Added Employee Designation Details - TestFail");
				}
	    
	    driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	   
	    // Add Identification Type 
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[contains(text(),'Identification Type')]")).click();
	    driver.findElement(By.xpath("//body/div[@id='layout-wrapper']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='identification_name']")).sendKeys("Passport2");
	    driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
	    
	    if (driver.findElement(By.xpath("//button[normalize-space()='OK']")).isDisplayed())
		 	   
		 { System.out.println("Successfully Added Identification Type Details - TestPass");
		 }else {
			     System.out.println("UnSuccessfully Added Identification Type Details - TestFail");
				}
	  
	  driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	  Thread.sleep(2000);
	  
	   // Add Client 
	    
	 
	    driver.findElement(By.xpath("//span[contains(text(),'Client Management')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//body/div[@id='layout-wrapper']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
	    driver.findElement(By.xpath("//input[@id='client_name']")).sendKeys("Vibho Solutions");
	    driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
	    
	    Thread.sleep(2000); 
	     if 
	     (driver.findElement(By.xpath("//button[normalize-space()='OK']")).isDisplayed())
		    { System.out.println("Successfully Added Client Management Details - TestPass");
			   }else {
			    System.out.println("UnSuccessfully Added Client Management Details - TestFail");
				}
	    
	    driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	    Thread.sleep(2000);
	    
	    // Add Role Type
	    
	    driver.findElement(By.xpath("//span[contains(text(),'Role Management')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[12]/ul[1]/li[1]/a[1]/div[1]/span[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//body/div[@id='layout-wrapper']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
	    driver.findElement(By.xpath("//input[@id='role_name']")).sendKeys("Dev");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
	    Thread.sleep(2000);
	    
	    if (driver.findElement(By.xpath("//button[normalize-space()='OK']")).isDisplayed())
		 	   
		 { System.out.println("Successfully Added Role Details - TestPass");
		 }else {
			     System.out.println("UnSuccessfully Added Role Details - TestFail");
				}
	  
	  driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	 
	    Thread.sleep(2000);
	    
	  //Employee
		
	  		driver.findElement(By.xpath("//body/div[@id='layout-wrapper']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/div[1]/*[1]")).click();
	  		driver.findElement(By.xpath("//span[contains(text(),'Employee Management')]")).click();
	          
	  		//add employee
	  		String empid = "rajeshalachandra@gmail.com";
	  		String pempid = "anjani.bygani@gmail.com";
	  		String mobno = "7661971432";
	  		
	  		driver.findElement(By.xpath("//body/div[@id='layout-wrapper']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[2]")).click();
	  		Thread.sleep(2000);
	  		driver.findElement(By.id("fname")).sendKeys("Rajesh");
	  		driver.findElement(By.id("lname")).sendKeys("Alachandra");
	  		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
	  		Thread.sleep(2000);
	  		driver.findElement(By.id("email_id")).sendKeys(empid);
	  		driver.findElement(By.id("personal_email_id")).sendKeys(pempid);
	  		Thread.sleep(2000);
	  		driver.findElement(By.id("phone_no")).sendKeys(mobno);
	  	
	  		// DOB Selection
	  		
	  		driver.findElement(By.id("dob")).click();
	  		Thread.sleep(2000);
	  		
	  		String dob = "03/Jun/1998";
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
	  	     driver.findElement(By.xpath("//input[@id='local_contact_name']")).sendKeys("Anjani");
	  	     driver.findElement(By.xpath("//input[@id='local_contact_relationship']")).sendKeys("Brother");
	  	     Thread.sleep(2000);
	  	     driver.findElement(By.xpath("//input[@id='local_contact_ph']")).sendKeys("9490290108");
	  	     Thread.sleep(2000);
	  	     driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
	  	     
	  	     // Company Details
	  	     
	  	     driver.findElement(By.id("designation_id")).click();
	  	     Thread.sleep(2000);
	  	     driver.findElement(By.xpath("//option[contains(text(),'Tester')]")).click();
	  	     driver.findElement(By.id("employment_type")).click();
	  	     Thread.sleep(2000);
	  	     driver.findElement(By.xpath("//option[contains(text(),'Permanent Employee')]")).click();
	  	     driver.findElement(By.id("date_of_joining")).click();
	  	     Thread.sleep(2000);
	  	     
	  	     //calender selection
	  	     
	  	        String dob2 = "12-May-2020";
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
	  		    String benname = "Rajesh";
	  		    String acno = "7661971432";
	  		    
	  		    
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
	  		    
	  		    String idno = "17661971432";
	  		    
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
	  		  
	    
	    
	   AppUtils.LogOut();
	   AppUtils.closeApp();
	    
	    
	
	
}
}