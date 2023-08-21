package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws  Throwable
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jygidi-27.netlify.app/");
	//	Thread.sleep(5000);
		
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scroll(0,500)");
	    Thread.sleep(3000);
		driver.findElement(By.id("simple-tab-2")).click();
    
        
        JavascriptExecutor jss =(JavascriptExecutor)driver;
        jss.executeScript("window.scroll(0,600)");
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[contains(text(),'AC')]")).click();
        
        JavascriptExecutor jsss = (JavascriptExecutor)driver;
        jsss.executeScript("window.scroll(500,0)");
        
        Thread.sleep(3000);
        driver.findElement(By.className("nvbar-brand")).click();
        if
           (driver.findElement(By.xpath("//header/div[1]/div[1]/ul[1]/li[2]/a[1]")).isDisplayed())
        {
        	 System.out.println("testpass");
        }else
        {
        	System.out.println("TESTFAIL");
        }
  				 
      //  driver.close();
   
        }

}
