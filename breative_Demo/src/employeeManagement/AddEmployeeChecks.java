package employeeManagement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.AppUtils;

public class AddEmployeeChecks extends AppUtils
{

	    public static String url = "https://vibeshr.vibhotech.com/in-staging/master/";
        public static String uid = "ADMIN";
        public static String pwd = "12345";
        static String sname = "Anjani Kumar (VTIN18)";
     public static void main(String[] args) throws Throwable
	{
	  
		AppUtils.LaunchApp(url);
		
		driver.findElement(By.id("username")).sendKeys(uid);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
		
		//Employee
		Thread.sleep(2000);	
	 	driver.findElement(By.xpath("//a[@class='has-arrow waves-effect ']")).click();
	 	driver.findElement(By.xpath("//span[contains(text(),'Employee Checks')]")).click();
	 	driver.findElement(By.xpath("//body/div[@id='layout-wrapper']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("//span[@id='select2-emp_id-container']")).click();
		
	//	driver.findElement(By.xpath("//li[@id='select2-emp_id-result-upsy-2']")).click();
	
		Thread.sleep(2000);
		
		
		
		List<WebElement> slevel = driver.findElement(By.id("select2-emp_id-results")).findElements(By.tagName("li"));
		 System.out.println(slevel.size());
		 
		 for (int k = 0; k < slevel.size(); k++) 
		 { 
			 if (slevel.get(k).getText().equalsIgnoreCase(sname)) 
			 {
				System.out.println("Employee Name Is Selected Successfully - Test Pass");
				slevel.get(k).click();
				break;
			}
			
		}
		
	
		driver.findElement(By.xpath("//label[normalize-space()='ITC']")).click();
		Thread.sleep(2000);
		WebElement id_image1 = driver.findElement(By.xpath("//div[@class='form-group row ITC-DIV']//input[@type='text']"));
		id_image1.sendKeys("C:\\Users\\anjib\\OneDrive\\Desktop\\Vibes_Images\\Images3.jpg"); 
		Thread.sleep(2000);   
		driver.findElement(By.xpath("//label[normalize-space()='Criminal']")).click();
		Thread.sleep(2000);
		 
	    WebElement id_image2 = driver.findElement(By.xpath("//div[@class='form-group row Criminal-DIV']//input[@type='text']"));
	    id_image2.sendKeys("C:\\Users\\anjib\\OneDrive\\Desktop\\Vibes_Images\\Images4.jpg"); 
	    Thread.sleep(2000);
	    
		driver.findElement(By.xpath("//label[normalize-space()='Educational']")).click();
		Thread.sleep(2000);
		WebElement id_image3 = driver.findElement(By.xpath("//div[@class='form-group row EDU-DIV']//input[@type='text']"));
		id_image3.sendKeys("C:\\Users\\anjib\\OneDrive\\Desktop\\Vibes_Images\\Images5.jpg"); 
		Thread.sleep(2000);
		 
	    driver.findElement(By.xpath("//label[normalize-space()='References']")).click();
	    Thread.sleep(2000);
	    WebElement id_image4 = driver.findElement(By.xpath("//div[@class='form-group row REF-DIV']//input[@type='text']"));
	    id_image4.sendKeys("C:\\Users\\anjib\\OneDrive\\Desktop\\Vibes_Images\\Images6.jpg"); 
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
	     
		 if (
			      driver.findElement(By.xpath("//button[normalize-space()='OK']")).isDisplayed())
			      {
			          System.out.println("Successfully Added Employee Checks Details - TestPass");
			      }else {
			    	  System.out.println("UnSuccessfully Added Employee checks Details - TestFail");
				}
			      Thread.sleep(3000);
			      
			      driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
			  
		
		AppUtils.LogOut();
		AppUtils.closeApp();
		
		
}
}