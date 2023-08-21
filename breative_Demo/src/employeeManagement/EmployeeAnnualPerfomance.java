package employeeManagement;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utils.AppUtils;

public class EmployeeAnnualPerfomance extends AppUtils
{
		public static String url = "https://vibeshr.vibhotech.com/in-staging/master/";
	    public static String uid = "ADMIN";
	    public static String pwd = "12345";
	    static String ename = "Anjani Kumar (VTIN18)";
	public static void main(String[] args) throws Throwable
		{
		  
			AppUtils.LaunchApp(url);
			
			driver.findElement(By.id("username")).sendKeys(uid);
			driver.findElement(By.id("password")).sendKeys(pwd);
			driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
			
		
		//Employee
		Thread.sleep(2000);	
	 	driver.findElement(By.xpath("//a[@class='has-arrow waves-effect ']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Employee Annual Performance']")).click();
	
	   //Add Employee Annual Performance
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='layout-wrapper']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
		driver.findElement(By.id("select2-emp_id-container")).click();
	    Thread.sleep(3000);
	 
		List<WebElement> keywordlist = driver.findElement(By.id("select2-emp_id-results")).findElements(By.tagName("li"));
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
		  //Date Selection
		  
		  driver.findElement(By.id("appraisal_date")).click();
		  Thread.sleep(2000);
		  
		  String edate = "18/May/2022";
		  String[] temp = edate.split("/");
		  String dt = temp[0];
		  String mt = temp[1];
		  String yr = temp[2];
		  
		  Select ylist = new Select(driver.findElement(By.className("ui-datepicker-year")));
		  ylist.selectByVisibleText(yr);
		  
		  Select mlist = new Select(driver.findElement(By.className("ui-datepicker-month")));
		  mlist.selectByVisibleText(mt);
		  
		  WebElement cal = driver.findElement(By.className("ui-datepicker-calendar"));
		  
		  List<WebElement> rows = cal.findElements(By.tagName("tr"));
		    for (int j = 1; j < rows.size(); j++)
		    {
				List<WebElement> cols = rows.get(j).findElements(By.tagName("td"));
				for (int k = 0; k < cols.size(); k++)
				{
				  if(cols.get(k).getText().equals(dt))
				  {
					  cols.get(k).click();
					  break;
				  }
				}
			}
		    
		    driver.findElement(By.id("appraisal_rating")).sendKeys("5");
		    driver.findElement(By.id("existing_role")).sendKeys("tester");
		    driver.findElement(By.id("new_role")).sendKeys("developer");
		    driver.findElement(By.id("existing_salary")).sendKeys("20000");
		    driver.findElement(By.id("new_salary")).sendKeys("25000");
		    driver.findElement(By.id("hr_feedback_comments")).sendKeys("Good");
		    driver.findElement(By.id("employee_feedback_comments")).sendKeys("Good");
		    driver.findElement(By.id("relationship_manager_comments")).sendKeys("Good");
		    
		    JavascriptExecutor js = (JavascriptExecutor)driver;
		    js.executeScript("window.scroll(0,2000)");
		    Thread.sleep(2000);
	        driver.findElement(By.xpath("//button[normalize-space()='Save']")).sendKeys(Keys.ENTER);
		    Thread.sleep(2000);
		     
		    try {
		    	if (driver.findElement(By.id("swal2-title")).isDisplayed())
		    	{
				   System.out.println("Successfully Adding Employee details TestPass");	
				}
				
			} catch (Exception e)
		    {
				System.out.println("TestFail");
			}
		    
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		   
		    
		   // Update Employee Annual Performance
		    
		    driver.findElement(By.xpath("//tr[@class='even']//a[@class='btn btn-info waves-effect waves-light'][normalize-space()='Edit']")).click();
		    driver.findElement(By.id("existing_role")).clear();
		    driver.findElement(By.id("existing_role")).sendKeys("AutomationTester");
		    driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
		    
		    if (driver.findElement(By.xpath("//button[normalize-space()='OK']")).isDisplayed())
			 { System.out.println("Successfully Added Employee Annual Performance Details - TestPass");
				      }else {
				    	  System.out.println("UnSuccessfully Added Employee Annual Performance Details - TestFail");
					}
		    
		    driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		   
		    
		 // Search Employee
		      
			driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Anjani Kumar (VTIN18)");
			WebElement emptable = driver.findElement(By.xpath("//tbody"));
			
			
			List<WebElement> rows1 = emptable.findElements(By.tagName("tr"));
			for (int i=2; i<rows1.size(); i++) 
			{   
				System.out.println(rows1.size());
				List<WebElement> cols2 = rows1.get(i).findElements(By.tagName("td"));
				System.out.println(cols2.size());
	  			if(cols2.get(2).getText().equalsIgnoreCase("Anjani"))
	  			{
	  				System.out.println("New Employee Annual Performance is Displyed in the Employee List , Test Pass");
	  			}else
	  			{
	  				System.out.println("New Employee Annual Performance is not Displyed in the Employee List , Test Fail");
	  			}
			}
			
			AppUtils.LogOut();
			AppUtils.closeApp();
				      
	}

		
	}	


