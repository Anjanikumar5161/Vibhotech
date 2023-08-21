package login_Module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.AppUtils;

public class LoginWithValidData extends AppUtils
 
{
	  public static String url = "https://vibeshr.vibhotech.com/in-staging/master/";
	  public static String url1 = "https://staging.vibhohcm.in/";
      public static String uid = "ADMIN";
      public static String pwd = "12345";
    
      public static String uid1 = "VTIN18";
      public static String pwd1 = "anjani123";
    
      
//	public static WebDriver driver;
	public static void main(String[] args) throws Throwable
	{
	
		AppUtils.LaunchApp(url);
		
		driver.findElement(By.id("username")).sendKeys(uid);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
		
      if (driver.findElement(By.xpath("//span[contains(text(),' Admin')]")).isDisplayed())
      {
		System.out.println("Admin LogIn Is Successful - Test Pass");
	}else {
		System.out.println("Admin LogIn Is UnSuccessful - Test Fail");
	}
		
		//LogOut
		
		AppUtils.LogOut();
		AppUtils.closeApp();
	    Thread.sleep(2000);
		AppUtils.LaunchApp(url1);
		

		driver.findElement(By.id("username")).sendKeys(uid1);
		driver.findElement(By.id("password")).sendKeys(pwd1);
		driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
		
      if (driver.findElement(By.xpath("//span[contains(text(),'Welcome')]")).isDisplayed())
      {
		System.out.println("Employee LogIn Is Successful - Test Pass");
	}else {
		System.out.println("Employee LogIn Is UnSuccessful - Test Fail");
	}
	
      AppUtils.EmpLogout();
      AppUtils.closeApp();
		
}
}