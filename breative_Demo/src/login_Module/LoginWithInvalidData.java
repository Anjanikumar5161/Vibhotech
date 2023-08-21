package login_Module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.AppUtils;

public class LoginWithInvalidData extends AppUtils
{
	
	  public static String url = "https://vibeshr.vibhotech.com/in-staging/master/";
	  public static String url1 = "https://staging.vibhohcm.in/";
	  
   //   public static String uid = "ADMIN";
    //  public static String pwd = "admin";
    
//	public static WebDriver driver;
	public static void main(String[] args) throws Throwable
	{
	
		AppUtils.LaunchApp(url);
		
		driver.findElement(By.id("username")).sendKeys("ADMIN");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
		
        String errmsg = driver.findElement(By.xpath("//div[@role='alert']")).getText();
		   if (errmsg.toLowerCase().contains("incorrect"))
		   {
			System.out.println("System doesn't Login Correct UserName And Wrong PassWord - Test Pass");
		}  else
		  {
			System.out.println("System Login With Correct UserName And Wrong PassWord - Test Fail");
		}
        
		   Thread.sleep(3000);
		   
		   driver.findElement(By.id("username")).sendKeys("12345");
			driver.findElement(By.id("password")).sendKeys("12345");
			driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
			
	        String errmsg1 = driver.findElement(By.xpath("//div[@role='alert']")).getText();
			   if (errmsg1.toLowerCase().contains("incorrect"))
			   {
				System.out.println("System doesn't Login Wrong UserName And Correct PassWord - Test Pass");
			}  else
			  {
				System.out.println("System Login With Wrong UserName And Correct PassWord - Test Fail");
			}
	        
		
		AppUtils.closeApp();
		
		
		AppUtils.LaunchApp(url1);
		
		driver.findElement(By.id("username")).sendKeys("ADMIN");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
		
        String errmsg11 = driver.findElement(By.xpath("//div[@role='alert']")).getText();
		   if (errmsg11.toLowerCase().contains("incorrect"))
		   {
			System.out.println("System doesn't Login Correct UserName And Wrong PassWord - Test Pass");
		}  else
		  {
			System.out.println("System Login With Correct UserName And Wrong PassWord - Test Fail");
		}
        
		   Thread.sleep(3000);
		 
		
		AppUtils.closeApp();
		
}
}


