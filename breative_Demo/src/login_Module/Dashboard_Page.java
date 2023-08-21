package login_Module;

import org.openqa.selenium.By;

import utils.AppUtils;

public class Dashboard_Page extends AppUtils

{
	 public static String url = "https://vibeshr.vibhotech.com/in-staging/master/";
     public static String uid = "ADMIN";
     public static String pwd = "12345";
   
//	public static WebDriver driver;
	public static void main(String[] args) throws Throwable
	{
	
		AppUtils.LaunchApp(url);
		
		driver.findElement(By.id("username")).sendKeys(uid);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
		
		//DashBoard - Total Employee
		
	    driver.findElement(By.xpath("//span[contains(text(),'Dashboard')]")).click();
	    
	    if (driver.findElement(By.xpath("//div[@class='app-new-count-card-item mb-3']//h5[contains(text(),'Total Employees')]")).isDisplayed())
	    {
			System.out.println("Dashboard Display Total Employee Details - TestPass");
		}else {
			System.out.println("Dashboard Do not Display Total Employee Details - TestFail");
		}
	    
	    // On Leaves
	    
	    if (driver.findElement(By.xpath("//h5[normalize-space()='On Leaves']")).isDisplayed())
	    {
			System.out.println("Dashboard Display On Leaves Details - TestPass");
		}else {
			System.out.println("Dashboard Do not Display On Leaves Details - TestFail");
		}
	    
	    // Total Clients
	    
	    if (driver.findElement(By.xpath("//h5[normalize-space()='Total Clients']")).isDisplayed())
	    {
			System.out.println("Dashboard Display Total Clients Details - TestPass");
		}else {
			System.out.println("Dashboard Do not Display Total Clients Details - TestFail");
		}
	    
	    // Total Tasks
	    
	    if (driver.findElement(By.xpath("//h5[normalize-space()='Total Tasks']")).isDisplayed())
	    {
			System.out.println("Dashboard Display Total Tasks Details - TestPass");
		}else {
			System.out.println("Dashboard Do not Display Total Tasks Details - TestFail");
		}
	    
	    // Attendence Report
	    
	    if (driver.findElement(By.xpath("//h4[normalize-space()='Attendance Report']")).isDisplayed())
	    {
			System.out.println("Dashboard Display Pie Chart With Attendence Report Details - TestPass");
		}else {
			System.out.println("Dashboard Do not Display Pie Chart With Attendence Report Details - TestFail");
		}
	    
	    // Holidays
	    
	    if (driver.findElement(By.xpath("//h5[normalize-space()='Holidays']")).isDisplayed())
	    {
			System.out.println("Dashboard Display Holiday Details - TestPass");
		}else {
			System.out.println("Dashboard Do not Display Holidays Details - TestFail");
		}
	    
	    // Inbox
	    
	    if (driver.findElement(By.xpath("//h5[normalize-space()='Inbox']")).isDisplayed())
	    {
			System.out.println("Dashboard Display Inbox Details - TestPass");
		}else {
			System.out.println("Dashboard Do not Display Inbox Details - TestFail");
		}
	    
	    AppUtils.LogOut();
	    AppUtils.closeApp();
	}		
}
