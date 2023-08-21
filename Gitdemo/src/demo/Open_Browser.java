package demo;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Open_Browser {

	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://google.com");
		
	/*	driver.get("http://primusbank.qedgetech.com");
		driver.findElement(By.linkText("Site Map")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Cards")).click();
		
		driver.findElement(By.linkText("Site Map")).click();
		List<WebElement> links = driver.findElements(By.linkText("Home"));
		System.out.println(links.size());
		links.get(1).click();
		 
		
		driver.get("http://facebook.com");
		List<WebElement> links =driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        
        for(WebElement element : links)
        {
        	String linkname = element.getText();
        	System.out.println(linkname);
        	
        }
        
		
		
		//OrangeHRM Login Script
			
				driver.get("http://orangehrm.qedgetech.com");
				driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
				driver.findElement(By.className("button")).click();
				
				driver.findElement(By.partialLinkText("Welcome")).click();		
				//driver.findElement(By.linkText("Logout")).click();
				driver.findElement(By.linkText("PIM")).click();
				driver.findElement(By.linkText("Add Employee")).click();
				
				driver.findElement(By.id("firstName")).sendKeys("Anjanikumar");
				driver.findElement(By.name("lastName")).sendKeys("Demo");
				driver.findElement(By.xpath("//*[@value='Save']")).click();
				driver.close(); 
				driver.quit();
				
		
		
		       driver.get("http://primusbank.qedgetech.com");	
		
		       driver.findElement(By.xpath("//*[@src='images/mainlinks_06.jpg']")).click(); //or
	//	       driver.findElement(By.xpath("//a[@href='aboutus.html']")).click();
		 
		 
		  
        driver.get("http://flights.qedgetech.com/");	
		
		driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		driver.findElement(By.xpath("/html/body/header/nav/div/div[3]/ul/li[2]/div/a/i")).click();
		driver.findElement(By.partialLinkText("Logout")).click();	
		
		
		
        driver.get("http://facebook.com");	
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
		
		
		driver.get("http://orangehrm.qedgetech.com");	
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		List<WebElement> chklist = driver.findElements(By.xpath("//input[starts-with(@id,'ohrmList_chkSelectRecord')]"));
		for(WebElement element : chklist)
		{
			element.click();
			}
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ul[@class='paging bottom']//a[contains(text(),'2')]")).click();
	
		List<WebElement> chklist2 =driver.findElements(By.xpath("//input[starts-with(@id, 'ohrmList_chkSelectRecord')]"));
		
		for(WebElement element : chklist2)
		{ 
			element.click();
		}
		
	
	                          //	getText()
		
				driver.get("http://orangehrm.qedgetech.com");
				
				driver.findElement(By.id("txtUsername")).sendKeys("abc");
				driver.findElement(By.name("txtPassword")).sendKeys("xyz");
				driver.findElement(By.className("button")).click();
			
				String errmsg =	driver.findElement(By.id("spanMessage")).getText();
				System.out.println(errmsg);
				
				if(errmsg.toUpperCase().contains("INVALID"))
				{
					System.out.println("test pass");
				}else
				{
					System.out.println("test fail");
				}
				/*
		------------------------------------------------------------------------------------
		getText()
		------------------------------------------------------------------------------------
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				
				driver.get("http://facebook.com");
				
				String msg = driver.findElement(By.xpath("//div[1]/div/div/div/div[1]/h2")).getText();
				System.out.println(msg);
				
		------------------------------------------------------------------------------------
		Script to capture and print all links present in the page using : getText()
		-------------------------------------------------------------------------------------
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.get("http://facebook.com");
				
				List<WebElement> links = driver.findElements(By.tagName("a"));
				System.out.println(links.size());
				
				for(WebElement element : links)
				{
					String linkname = element.getText();
					System.out.println(linkname);
				}
				
		--------------------------------------------------------------------------------------
		Script to capture href property of a link using : getAttribute()
		-----------------------------------------------------------------------------------------
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get("http://google.com");
				
				String redirecturl = driver.findElement(By.linkText("Gmail")).getAttribute("href");
				System.out.println(redirecturl);
				
		---------------------------------------------------------------------------------------
		Script to capture value property of the element using : getAttribute()
		-----------------------------------------------------------------------------------------
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get("http://google.com");
				
						
				String x = driver.findElement(By.name("btnK")).getAttribute("value");
				System.out.println(x);
				
		-------------------------------------------------------------------------------------
		Script to capture Employee Number Auto generated while Adding New Employee
		in orangeHRM App using : getAttribute()
		------------------------------------------------------------------------------------
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.get("http://orangehrm.qedgetech.com");		
				driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
				driver.findElement(By.className("button")).click();
				
				driver.findElement(By.linkText("PIM")).click();
				driver.findElement(By.linkText("Add Employee")).click();
				
				String empid =  driver.findElement(By.id("employeeId")).getAttribute("value");
				System.out.println(empid);
				
		-------------------------------------------------------------------------------------
		Script to check an element is present in the page ornot using : isDisplayed()
		--------------------------------------------------------------------------------------
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				String link_tobe_check = "Business";
				
				driver.get("http://google.com");		
				
				try 
				{
						
					driver.findElement(By.linkText(link_tobe_check)).isDisplayed();
					System.out.println("test pass");
					
				} catch (Exception e) 
				{
					System.out.println("test fail");
				}	
		
		
	                      // 20-07-2022
		
		Script to check Admin Login in OrangeHRM App
		----------------------------------------------------------------------------------------
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.get("http://orangehrm.qedgetech.com");
				driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
				driver.findElement(By.name("Submit")).click();
				
				// Code to check ADmin Module Displayed or not?
				try 
				{
					if(driver.findElement(By.linkText("Admin")).isDisplayed())
					{
						System.out.println("Admin Login Test Pass");
					}
				} catch (Exception e) 
				{
					System.out.println("Admin Login Test Fail");
				}
				/*
				
		--------------------------------------------------------------------------------------
		Script to check Employee Login in OrangeHRM App
		--------------------------------------------------------------------------------------
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.get("http://orangehrm.qedgetech.com");
				driver.findElement(By.id("txtUsername")).sendKeys("Tirupati");
				driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
				driver.findElement(By.name("Submit")).click();
				
				// Code to check Employee Module Displayed or not?
				
				try 
				{
					if(driver.findElement(By.linkText("Admin")).isDisplayed())
					{
						System.out.println("Employee Login Test Fail");
					}
				} catch (Exception e) 
				{
					System.out.println("Employee Login Test Pass");
				}
				
		-----------------------------------------------------------------------------------------
		Script to capture Suggetions in Google
		--------------------------------------------------------------------------------------
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.get("http://google.com");
				
				driver.findElement(By.name("q")).sendKeys("Selenium");		
				Thread.sleep(2000);
				
				List<WebElement> keywordlist = driver.findElement(By.className("G43f7e")).findElements(By.tagName("li"));
				System.out.println(keywordlist.size());
				
				for(WebElement element : keywordlist)
				{
					String keyword = element.getText();
					System.out.println(keyword);
				}
				
		--------------------------------------------------------------------------------------------
		Script to select Selenium Download from Suggetions List
		-------------------------------------------------------------------------------------
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.get("http://google.com");
				
				driver.findElement(By.name("q")).sendKeys("Selenium");		
				Thread.sleep(2000);
				
				List<WebElement> keywordlist = driver.findElement(By.className("G43f7e")).findElements(By.tagName("li"));
				System.out.println(keywordlist.size());
				
				for(WebElement element : keywordlist)
				{
					String keyword = element.getText();
					System.out.println(keyword);
				}
		
		
		                //21-07-2022
		Script to Select an item from DropDownList
		------------------------------------------------------------------------------------
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.get("http://facebook.com");
				driver.findElement(By.linkText("Create new account")).click();
				
				Select day = new Select(driver.findElement(By.id("day")));
				day.selectByVisibleText("15");
				
				WebElement melement = driver.findElement(By.id("month"));
				Select month = new Select(melement);
				month.selectByValue("4");
				
				Select year = new Select(driver.findElement(By.id("year")));
				year.selectByIndex(0);
				
		-------------------------------------------------------------------------------------
		Selecting a Value from DropDownList
		-------------------------------------------------------------------------------------
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.get("http://amazon.com");
				
				WebElement catelement = driver.findElement(By.id("searchDropdownBox"));
				Select cat = new Select(catelement);
				cat.selectByVisibleText("Computers");
				
		 
		---------------------------------------------------------------------------------------------
		Script to count & print all items present in a DropDownList
		-----------------------------------------------------------------------------------------
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.get("http://amazon.com");
				
			
				Select cat = new Select(driver.findElement(By.id("searchDropdownBox")));
				List<WebElement> catlist = cat.getOptions();
				System.out.println(catlist.size());
				
				for(WebElement element : catlist)
				{
					String catname = element.getText();
					System.out.println(catname); 
					
				}
				
		
			// 22-07-2022
		
	//	Script to check the specified item present in the DropDownList or not?
	//			---------------------------------------------------------------------------------------
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
						
						WebDriver driver = new ChromeDriver();
						driver.manage().deleteAllCookies();
						driver.manage().window().maximize();
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						
						driver.get("http://amazon.com");
						
						WebElement catelement = driver.findElement(By.id("searchDropdownBox"));
						Select cat = new Select(catelement);
						List<WebElement> catlist = cat.getOptions();
						
						boolean isitempresent = false;
						String item_tobe_check = "Computers";
						
						for(int i=0;i<catlist.size();i++)
						{
							if(catlist.get(i).getText().equalsIgnoreCase(item_tobe_check))
							{
								isitempresent = true;
								break;
							}
						}
						if(isitempresent)
						{
							System.out.println(item_tobe_check+" is present in the list, test pass");
						}else
						{
							System.out.println(item_tobe_check+" is not present in the list, test fail");
						}
						
				-------------------------------------------------------------------------------------------------
				Script to check all items in a DropDownList are displayed ascending order or not?
				-------------------------------------------------------------------------------------
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
						
						WebDriver driver = new ChromeDriver();
						driver.manage().deleteAllCookies();
						driver.manage().window().maximize();
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						
						driver.get("http://amazon.com");
						
						WebElement catelement = driver.findElement(By.id("searchDropdownBox"));
						Select cat = new Select(catelement);
						List<WebElement> catlist = cat.getOptions();
						
						String str1,str2;
						boolean ordered = true;
						
						for(int i=1;i<catlist.size();i++)
						{
							str1 = catlist.get(i-1).getText();
							str2 = catlist.get(i).getText();
							
							if(str2.compareToIgnoreCase(str1)<0)
							{
								ordered = false;
								break;
							}
						}
						
						if(ordered)
						{
							System.out.println("All items displayed in ascending order, test pass");
						}else
						{
							System.out.println("All items are not displayed in ascending order, test fail");
						}
						
				--------------------------------------------------------------------------------------------
				Script to Select First AC from the Train Class List in makemytrip.com
				-------------------------------------------------------------------------------------
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
						
						WebDriver driver = new ChromeDriver();
						driver.manage().deleteAllCookies();
						driver.manage().window().maximize();
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						
						driver.get("https://www.makemytrip.com");
						driver.findElement(By.linkText("Trains")).click();
						driver.findElement(By.xpath("//div[2]/div/div[4]/label/span")).click();
					
						List<WebElement> classlist =  driver.findElement(By.className("travelForPopup")).findElements(By.tagName("li"));
						for(WebElement element : classlist)
						{
							if(element.getText().equalsIgnoreCase("First Ac"))
							{
								element.click();
								break;
							}
						}
				
		//23-07-2022
		
        SCRIPT TO CHECK A LINK WORKING OR NOT BASED ON THE TITLE OF THE WINDOW   
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
           System.setProperty("WebDriver.Chrome.Driver", "Chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().deleteAllCookies();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	       driver.get("http://facebook.com");
	
       	   driver.findElement(By.partialLinkText("Forgotten")).click();
	
	       String pgtitle = driver.getTitle();
	       if(pgtitle.toLowerCase().contains("forgotten password"))
	  {
		   System.out.println("Test Pass");
		   System.out.println(pgtitle);
	  }    else
    	{
	       System.out.println("Test Fail");
    	}
	       
------------------------------------------------------------------------------------------------------------------------------------------------
      // SCRIPT TO CHECK A LINK WORKING OR NOT BASED ON THE VISIBILITY OF AN ELEMENT
--------------------------------------------------------------------------------------------------------------------------------------------
           System.setProperty("WebDriver.Chrome.Driver", "Chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().deleteAllCookies();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	      *
	       driver.get("http://facebook.com");
	
	       driver.findElement(By.linkText("Log in")).click();
	  try {
		  if(driver.findElement(By.id("loginbutton")).isDisplayed())
			System.out.println("Test Pass");
	       }
     catch (Exception e)
	       {
	        System.out.println("Test Fail");
	       }
	  
---------------------------------------------------------------------------------------------------------------------------------------------
          //SCRIPT TO COUNT AND PRINT ALL LINKS PRESENT IN THE WINDOW
-----------------------------------------------------------------------------------------------------------------------------------------------
         

    // 25-07-2022
		
	  Script to count No. of Rows Present in a HTML Table
	  ------------------------------------------------------------------------------------
	  		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");		
	  		WebDriver driver = new ChromeDriver();
	  		driver.manage().deleteAllCookies();
	  		driver.manage().window().maximize();
	  		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  		
	  		driver.get("https://www.railyatri.in/time-table");
	  		
	  		WebElement traintable = driver.findElement(By.xpath("//div[2]/div/div/div/div/div/table"));
	  		List<WebElement> rows = traintable.findElements(By.tagName("tr"));
	  		System.out.println("Count of Rows: "+rows.size());
	  		
	  --------------------------------------------------------------------------------------------
	  Script to count No. of Columns of a Table Row.
	  ------------------------------------------------------------------------------------
	  		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");		
	  		WebDriver driver = new ChromeDriver();
	  		driver.manage().deleteAllCookies();
	  		driver.manage().window().maximize();
	  		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  		
	  		driver.get("https://www.railyatri.in/time-table");
	  		
	  		WebElement traintable = driver.findElement(By.xpath("//div[2]/div/div/div/div/div/table"));
	  		List<WebElement> rows = traintable.findElements(By.tagName("tr"));
	  		
	  		List<WebElement> cols =  rows.get(1).findElements(By.tagName("td"));
	  		System.out.println("Count of Columns: "+cols.size());
	  		
	  -----------------------------------------------------------------------------------------
	  Script to Train No & Train Name present in IRCTC Trains Table
	  -------------------------------------------------------------------------------------
	  		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");		
	  		WebDriver driver = new ChromeDriver();
	  		driver.manage().deleteAllCookies();
	  		driver.manage().window().maximize();
	  		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  		
	  		driver.get("https://www.railyatri.in/time-table");
	  		
	  		WebElement traintable = driver.findElement(By.xpath("//div[2]/div/div/div/div/div/table"));
	  		List<WebElement> rows = traintable.findElements(By.tagName("tr"));
	  		
	  		for(int i=1;i<rows.size();i++)
	  		{
	  			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
	  			String trainno= cols.get(0).getText();
	  			String trainname = cols.get(1).getText();
	  			System.out.println(trainno+" "+trainname);
	  		}
	  		
	  ----------------------------------------------------------------------------------------------
	  Script to Read all Rows of Data Present in a HTML Table
	  ---------------------------------------------------------------------------------------
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");		
	  		WebDriver driver = new ChromeDriver();
	  		driver.manage().deleteAllCookies();
	  		driver.manage().window().maximize();
	  		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  		
	  		driver.get("https://www.railyatri.in/time-table");
	  		
	  		WebElement traintable = driver.findElement(By.xpath("//div[2]/div/div/div/div/div/table"));
	  		List<WebElement> rows = traintable.findElements(By.tagName("tr"));
	  		
	  		for(int i=1;i<rows.size();i++)
	  		{
	  			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
	  			for(WebElement element : cols)
	  			{
	  				String data = element.getText();
	  				System.out.print(data+"   ");
	  			}
	  			System.out.println();
	  		}
	  		
	  ------------------------------------------------------------------------------------------
	  Script to check New Employee Registered is displayed Employee List Table or not
	  in OrangeHRM App
	  ------------------------------------------------------------------------------------
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");		
	  		WebDriver driver = new ChromeDriver();
	  		driver.manage().deleteAllCookies();
	  		driver.manage().window().maximize();
	  		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  		
	  		driver.get("http://orangehrm.qedgetech.com");
	  		
	  		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
	  		driver.findElement(By.name("Submit")).click();
	  		
	  		driver.findElement(By.linkText("PIM")).click();
	  		driver.findElement(By.linkText("Add Employee")).click();
	  		
	  		driver.findElement(By.id("firstName")).sendKeys("Anjani");
	  		driver.findElement(By.id("lastName")).sendKeys("Demo");
	  		
	  		String empno = driver.findElement(By.id("employeeId")).getAttribute("value");
	  		driver.findElement(By.id("btnSave")).click();
	  		
	  		driver.findElement(By.linkText("Employee List")).click();
	  		driver.findElement(By.id("empsearch_id")).sendKeys(empno);
	  		driver.findElement(By.id("searchBtn")).click();
	  		
	  		WebElement emptable = driver.findElement(By.id("resultTable"));
	  		
	  		List<WebElement> rows = emptable.findElements(By.tagName("tr"));
	  		for(int i=1;i<rows.size();i++)
	  		{
	  			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
	  			if(cols.get(1).getText().equalsIgnoreCase(empno))
	  			{
	  				System.out.println("New Employee Registered is Displyed in the Employee List , Test Pass");
	  			}else
	  			{
	  				System.out.println("New Employee Registered is not Displyed in the Employee List , Test Fail");
	  			}
	  		}
		*/
		
		//26-07-2022
		
	/*	Script to Select DOB while Registering a New User in Flights App using : sendKeys()
		-------------------------------------------------------------------------------------
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");		
				WebDriver driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
				driver.get("http://flights.qedgetech.com/");
				driver.findElement(By.linkText("Register")).click();
				driver.findElement(By.name("dob")).sendKeys("15-10-1980");
				
				
		-----------------------------------------------------------------------------------
		Script to Select DateOfFly in Flights App using : sendKeys()
		-------------------------------------------------------------------------------------
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");		
				WebDriver driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.get("http://flights.qedgetech.com/");
				driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");
				driver.findElement(By.name("password")).sendKeys("demo");
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				
				driver.findElement(By.id("search-date")).sendKeys("8/15/2024");	
				
		---------------------------------------------------------------------------------------	
		Selecting a Date From Calendar by operating the Calendar
		-------------------------------------------------------------------------------------
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");		
				WebDriver driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				*/
				driver.get("http://flights.qedgetech.com/");
				driver.findElement(By.linkText("Register")).click();
				driver.findElement(By.name("dob")).click();
				
				String dob = "16-May-1991";
				String[] temp =  dob.split("-");
				String dt = temp[0];
				String month = temp[1];
				String year = temp[2];
				
				Select ylist = new Select(driver.findElement(By.className("ui-datepicker-year")));
				ylist.selectByVisibleText(year);
				
				Select mlist = new Select(driver.findElement(By.className("ui-datepicker-month")));
				mlist.selectByVisibleText(month);
				
				WebElement cal = driver.findElement(By.className("ui-datepicker-calendar"));
				
				List<WebElement>rows = cal.findElements(By.tagName("tr"));
				for(int i=1;i<rows.size();i++)
				{
					List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
					for(int j=0;j<cols.size();j++)
					{
						if(cols.get(j).getText().equals(dt))
						{
							cols.get(j).click();
							break;
						}
					}
					
				}
				/*
		-------------------------------------------------------------------------------------------
		Script to select dateOfFly from Calendar in Flights App
		-------------------------------------------------------------------------------------------
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");		
				WebDriver driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.get("http://flights.qedgetech.com/");
				driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");
				driver.findElement(By.name("password")).sendKeys("demo");
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				
				driver.findElement(By.id("search-date")).click();
				
				String flydate = "22/October/2030";
				String[] temp = flydate.split("/");
				
				String dt = temp[0];
				String month = temp[1];
				String year = temp[2];
				
				
				
				String calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
				while(!calyear.equals(year))
				{
					driver.findElement(By.linkText("Next")).click();
					calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
				}
				
				String calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
				while(!calmonth.equalsIgnoreCase(month))
				{
					driver.findElement(By.linkText("Next")).click();
					calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
				}
				
				WebElement cal = driver.findElement(By.className("ui-datepicker-calendar"));
				
				
				List<WebElement> rows = cal.findElements(By.tagName("tr"));
				for(int i=1;i<rows.size();i++)
				{
					List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
					for(WebElement element : cols)
					{
						if(element.getText().equals(dt))
						{
							element.click();
							break;					
						}
					}
				}
			/*
		
		// 27-07-2022
		
		SCRIPT TO AUTOMATE MOVE TO ELEMENT & CONTENT CLICK() MOUSE OPERATIONS
		-----------------------------------------------------------------------------------------------------------------------------------------------------------

		            System.setProperty("WebDriver.Chrome.driver", "ChromeDriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
				driver.get("http://snapdeal.com");
				
				Actions act = new Actions(driver);
				act.moveToElement(driver.findElement(By.linkText("Home & Kitchen")));
				act.contextClick();
				act.build().perform();
     
		-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		 SCRIPT TO HANDLE IFRAME AND ALSO MOUSE DRAG & DROP OPERATION
		----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		            System.setProperty("WebDriver.Chrome.driver", "ChromeDriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
				driver.get("http://jqueryui.com/");
				
				driver.findElement(By.linkText("Droppable")).click();
				
				driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
			//	WebElement srcelement,trgelement;
				
				WebElement srcelement = driver.findElement(By.id("draggable"));
				WebElement trgelement = driver.findElement(By.id("droppable"));
				
				Actions act = new Actions(driver);
				act.dragAndDrop(srcelement, trgelement);
				act.build().perform();
				driver.quit();
          
	
		//29-07-2022
		
		Script to accept alert/popup displyed
		------------------------------------------------------------------------------------
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");		
				WebDriver driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.get("http://primusbank.qedgetech.com");
				driver.findElement(By.id("txtuId")).sendKeys("abc");
				driver.findElement(By.id("txtPword")).sendKeys("xyz");
				driver.findElement(By.id("login")).click();
			
				 driver.switchTo().alert().accept();
		 	 
		------------------------------------------------------------------------------------
		
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");		
				WebDriver driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.get("http://flights.qedgetech.com");
				
				driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");
				driver.findElement(By.name("password")).sendKeys("demo");
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				
				driver.findElement(By.partialLinkText("Bookings")).click(); 
				
				String orderno = "2956";
				
				WebElement flightstable = driver.findElement(By.className("flights_table"));
			
				List<WebElement> rows = flightstable.findElements(By.tagName("tr"));
				for(int i=1;i<rows.size();i++)
				{
					List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
					if(cols.get(0).getText().equals(orderno))
					{
						cols.get(9).findElement(By.partialLinkText("Delete")).click();
						String alertmsg = driver.switchTo().alert().getText();
						if(alertmsg.toLowerCase().contains("delete"))
						{
							driver.switchTo().alert().accept();
						}else
						{
							driver.switchTo().alert().dismiss();
						}
						
						break;
					}			
				}

				
		--------------------------------------------------------------------------------------------------
		Script to capture Screenshot of the window
		-------------------------------------------------------------------------------------
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");		
				WebDriver driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.get("http://primusbank.qedgetech.com");
				driver.findElement(By.id("txtuId")).sendKeys("Admin");
				driver.findElement(By.id("txtPword")).sendKeys("Admin");
				driver.findElement(By.id("login")).click();
				
				driver.findElement(By.xpath("//*[contains(@href,'password')]")).click();
				
				TakesScreenshot ts = (TakesScreenshot)driver; 
				File srcfile = ts.getScreenshotAs(OutputType.FILE);
				
				File destfile = new File("c:\\temp\\defect1.bmp");
				
			//	FileUtils.copyFile(srcfile, destfile);
		*/
	}
}	
	


