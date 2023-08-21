package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppUtils {

	public static WebDriver driver;
//	public static  String url;
	
	public static void LaunchApp(String url)
	
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

	}

	public static void closeApp()
	{
		driver.close();
	}
	
	public static void LogOut() throws Throwable 
	
	{
		driver.findElement(By.xpath("//span[contains(text(),' Admin')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		
		if (driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).isDisplayed()) 
		{
			System.out.println("Login And Logout Module is Done - Test Pass");
		}else 
		{
			System.out.println("Login And Logout Module is Not Done - Test Fail");	
		}
		
	}
	
	public static void EmpLogout() throws Throwable
	{
		driver.findElement(By.xpath("//i[@class='fa fa-caret-down ml-1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		
		if (driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).isDisplayed()) 
		{
			System.out.println("Employee Login And Logout Module is Done - Test Pass");
		}else 
		{
			System.out.println("Employee Login And Logout Module is Not Done - Test Fail");	
		}
		
		
	}
}
