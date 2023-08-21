package AddEmployee;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.AppUtils;

public class Flow extends AppUtils
{
     
	 private static final boolean Select = false;
	public static String url = "https://breative.vibhohcm.com";
	 public static String url1 = "https://breative.vibhohcm.com";
	 
     public static String uid = "BREATIVE";   
     public static String pwd = "Br@99$2023";
     
     public static String uid1 = "BRTV07";
     public static String pwd1 = "anjani123";
     
     
   //  static String ename ="Anjani Kumar (VTIN18)";
	
	public static void main(String[] args) throws Throwable
	{
		AppUtils.LaunchApp(url);
		
		driver.findElement(By.id("username")).sendKeys(uid);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='layout-wrapper']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/div[1]/*[1]")).click();
  		driver.findElement(By.xpath("//span[contains(text(),'Employee Management')]")).click();
       
  		driver.findElement(By.xpath("//body/div[@id='layout-wrapper']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[2]")).click();
  		Thread.sleep(2000);
  		
  		driver.findElement(By.id("form-horizontal-t-1")).click();
  		Thread.sleep(2000);
  		
  		// Candidate role
  		/*
  		driver.findElement(By.id("role_id")).click();
		    Thread.sleep(2000);
		   
		    List<WebElement> words;
		   
		    words = driver.findElements(By.id("role_id"));
			System.out.println(words.size());
			
			for(WebElement element : words)
			{
				String keyword = element.getText();
				System.out.println(keyword);
			}
		   */
		  
  	       	
		    WebElement catelement = driver.findElement(By.id("designation_id"));
	        Select cat = new Select(driver.findElement(By.id("designation_id")));
	        cat.selectByVisibleText("Tester");
	       
		  
			
		
		

	}

}
