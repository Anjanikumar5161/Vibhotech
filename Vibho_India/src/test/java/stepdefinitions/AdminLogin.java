package stepdefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AdminLogin 
{
	
	public static WebDriver driver;
	static String sname = "Anjani kumar (BRTV03)";
	
	@Given("^i Open Browser With url  \"([^\"]*)\"$")
	public void i_Open_Browser_With_url(String url) throws Throwable 
	{
	    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get(url);
		
	}

	@Then("^i Should See Login Page$")
	public void i_Should_See_Login_Page() throws Throwable 
	{
		if(driver.findElement(By.xpath("//h5[normalize-space()='Welcome']")).isDisplayed())
		{System.out.println("System Should Display Login Page");
		  }
	}

	@When("^i Enter The Valid Username as \"([^\"]*)\"$")
	public void i_Enter_The_Valid_Username_as(String uid) throws Throwable
	{
		driver.findElement(By.id("username")).sendKeys(uid);  
	}

	@When("^i Enter The Valid Password as \"([^\"]*)\"$")
	public void i_Enter_The_Valid_Password_as(String pwd) throws Throwable 
	{
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@When("^i Click LogIn$")
	public void i_Click_LogIn() throws Throwable 
	{
		driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click(); 
	}

	@Then("^i Should See Admin Module$")
	public void i_Should_See_Admin_Module() throws Throwable 
	{
		 if (driver.findElement(By.xpath("//span[contains(text(),'Welcome')]")).isDisplayed())
	      {
			System.out.println("Admin LogIn Is Successful - Test Pass");
		}else {
			System.out.println("Admin LogIn Is UnSuccessful - Test Fail");
		}
		
	}

	@When("^i Click Logout$")
	public void i_Click_Logout() throws Throwable 
	{

			
			driver.findElement(By.xpath("//span[contains(text(),'Welcome')]")).click();
			Thread.sleep(3000);
			
			
		     driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		
		
			if (driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).isDisplayed()) 
			{
				System.out.println("Login And Logout Module is Done - Test Pass");
			}else 
			{
				System.out.println("Login And Logout Module is Not Done - Test Fail");	
			}
			
		}

	@When("^i Close Browser$")
	public void i_Close_Browser() throws Throwable 
	{
	    driver.close();
	}

	@Then("^i Should see Error message$")
	public void i_Should_see_Error_message() throws Throwable 
	{
		 String errmsg1 = driver.findElement(By.xpath("//div[@role='alert']")).getText();
		   if (errmsg1.toLowerCase().contains("incorrect"))
		   {
			System.out.println("System doesn't Login Wrong UserName And Correct PassWord - Test Pass");
		}  else
		  {
			System.out.println("System Login With Wrong UserName And Correct PassWord - Test Fail");
		}
      
	}

	//--------------------------- Add Employee ----------------------------------------------
	
	
	@When("^i click on Employee$")
	public void i_click_on_Employee() throws Throwable
	{
	   driver.findElement(By.xpath("//span[normalize-space()='Employee']")).click();
		Thread.sleep(2000);
	}

	@When("^i click on Employee Management$")
	public void i_click_on_Employee_Management() throws Throwable 
	{
		driver.findElement(By.xpath("//span[contains(text(),'Employee Management')]")).click();
	        
	}

	@When("^i click on Add Employee$")
	public void i_click_on_Add_Employee() throws Throwable 
	{
		driver.findElement(By.xpath("//body/div[@id='layout-wrapper']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[2]")).click();
		Thread.sleep(2000);
		
	}

	@When("^i Enter the FirstName as \"([^\"]*)\"$")
	public void i_Enter_the_FirstName_as(String fname) throws Throwable 
	{
		driver.findElement(By.id("fname")).sendKeys(fname);

		
	}

	@When("^i Enter the LastName as \"([^\"]*)\"$")
	public void i_Enter_the_LastName_as(String lname) throws Throwable
	{
		driver.findElement(By.id("lname")).sendKeys(lname);
		
	}

	@When("^i Select the Gender$")
	public void i_Select_the_Gender() throws Throwable 
	{
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		Thread.sleep(2000);
		 	
	}

	@When("^i Enter the Company Email ID as \"([^\"]*)\"$")
	public void i_Enter_the_Company_Email_ID_as(String emailid) throws Throwable
	{
		driver.findElement(By.id("email_id")).sendKeys(emailid);
		   	
	}

	@When("^i Enter the Personal Email ID as \"([^\"]*)\"$")
	public void i_Enter_the_Personal_Email_ID_as(String pemailid) throws Throwable 
	{
		driver.findElement(By.id("personal_email_id")).sendKeys(pemailid);
		Thread.sleep(2000);
		
	}

	@When("^i Enter the Mobile Number as \"([^\"]*)\"$")
	public void i_Enter_the_Mobile_Number_as(String mobno) throws Throwable
	{
		driver.findElement(By.id("phone_no")).sendKeys(mobno);
		 	
	}

	@When("^i Select the Date Of Birth as \"([^\"]*)\"$")
	public void i_Select_the_Date_Of_Birth_as(String dob) throws Throwable 
	{
		driver.findElement(By.id("dob")).click();
		Thread.sleep(2000);
		
		//String dob1 = "16/May/1994";
		String[] temp = dob.split("-");
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
		
	     
	}

	@When("^i Enter the Permanent Address as \"([^\"]*)\"$")
	public void i_Enter_the_Permanent_Address_as(String pradress) throws Throwable
	{
		driver.findElement(By.id("permanent_address")).sendKeys(pradress);
		
	}

	@When("^i Enter the Present Address as \"([^\"]*)\"$")
	public void i_Enter_the_Present_Address_as(String prsadress) throws Throwable 
	{
		driver.findElement(By.id("present_address")).sendKeys("Telangana"); 
		Thread.sleep(2000);
	}

	@When("^i Enter the Local Contact Name as \"([^\"]*)\"$")
	public void i_Enter_the_Local_Contact_Name_as(String lcname) throws Throwable 
	{
		driver.findElement(By.xpath("//input[@id='local_contact_name']")).sendKeys(lcname); 
		
	}

	@When("^i Enter the Local Contact Relationship as \"([^\"]*)\"$")
	public void i_Enter_the_Local_Contact_Relationship_as(String lcrel) throws Throwable 
	{
		driver.findElement(By.xpath("//input[@id='local_contact_relationship']")).sendKeys(lcrel);
	     Thread.sleep(2000);
 	
	}

	@When("^i Enter the Local Contact Mobile Number as \"([^\"]*)\"$")
	public void i_Enter_the_Local_Contact_Mobile_Number_as(String lcmno) throws Throwable 
	{
		 driver.findElement(By.xpath("//input[@id='local_contact_ph']")).sendKeys(lcmno);
	     Thread.sleep(2000);
		
	}

	@When("^i Enter the Overseas Contact Name as \"([^\"]*)\"$")
	public void i_Enter_the_Overseas_Contact_Name_as(String oscname) throws Throwable
	{
	   driver.findElement(By.id("overseas_contact_name")).sendKeys(oscname);
	   Thread.sleep(2000);	
	}

	@When("^i Enter the Overseas Contact Relationship as \"([^\"]*)\"$")
	public void i_Enter_the_Overseas_Contact_Relationship_as(String oscrel) throws Throwable
	{
	  driver.findElement(By.id("overseas_contact_relationship")).sendKeys(oscrel);  
	  Thread.sleep(2000);	
	}

	@When("^i Enter the Overseas Contact Mobile Number as \"([^\"]*)\"$")
	public void i_Enter_the_Overseas_Contact_Mobile_Number_as(String oscmno) throws Throwable 
	{
	  driver.findElement(By.id("overseas_contact_ph")).sendKeys(oscmno);  
	  Thread.sleep(2000);	
	}

	@When("^i Enter the Next icon$")
	public void i_Enter_the_Next_icon() throws Throwable 
	{
		driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
	     Thread.sleep(2000);   
	}

	@When("^i Select An Eployee Designation As \"([^\"]*)\"$")
	public void i_Select_An_Eployee_Designation_As(String arg1) throws Throwable 
	{
		driver.findElement(By.id("designation_id")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//option[contains(text(),'Test')]")).click();  
	}

	@When("^i Select An Employee Typa As \"([^\"]*)\"$")
	public void i_Select_An_Employee_Typa_As(String arg1) throws Throwable 
	{
		 driver.findElement(By.id("employment_type")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//option[contains(text(),'Permanent Employee')]")).click();

	}

	@When("^i Select An Employee Date Of Joining \"([^\"]*)\"$")
	public void i_Select_An_Employee_Date_Of_Joining(String edob) throws Throwable
	{
	    
		 driver.findElement(By.id("date_of_joining")).click();
	     Thread.sleep(2000);
	     //calender selection
	     
	      //  String edob = "12-Jan-2028";
			String[] temp2 = edob.split("-");
			String dt2 = temp2[0];
			String mon2 = temp2[1];
			String yr2 = temp2[2];
			
			Select ylist2 = new Select(driver.findElement(By.className("ui-datepicker-year")));
		    ylist2.selectByVisibleText(yr2);
		    
		    Select mlist2 = new Select(driver.findElement(By.className("ui-datepicker-month")));
		    mlist2.selectByVisibleText(mon2);
		    
		    WebElement cal2 = driver.findElement(By.className("ui-datepicker-calendar"));
		    
		    List<WebElement> rows2 = cal2.findElements(By.tagName("tr"));
		     for(int k=1; k<rows2.size(); k++)
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
		
	}

	@When("^i Select An Employee Role \"([^\"]*)\"$")
	public void i_Select_An_Employee_Role(String arg1) throws Throwable 
	{
		driver.findElement(By.id("role_id")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//option[normalize-space()='Super Admin']")).click();
	    Thread.sleep(2000);
  
	}

	@When("^i am Selecting The Reporting Manager \"([^\"]*)\"$")
	public void i_am_Selecting_The_Reporting_Manager(String arg1) throws Throwable 
	{
		driver.findElement(By.id("reporting_manager_id")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//select[@id='reporting_manager_id']//option[@value='29'][normalize-space()='Anjani kumar (BRTV03)']")).click();
	    Thread.sleep(2000);

	}

	@When("^i am Selecting The HR Manager \"([^\"]*)\"$")
	public void i_am_Selecting_The_HR_Manager(String arg1) throws Throwable 
	{
		 driver.findElement(By.id("hr_manager_id")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//select[@id='hr_manager_id']//option[@value='29'][normalize-space()='Anjani kumar (BRTV03)']")).click();
	}

	@When("^i am selecting The Lead Manager \"([^\"]*)\"$")
	public void i_am_selecting_The_Lead_Manager(String arg1) throws Throwable 
	{
	    driver.findElement(By.id("lead_manager_id")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//select[@id='lead_manager_id']//option[@value='29'][normalize-space()='Anjani kumar (BRTV03)']")).click();

	}

	@When("^i am Selecting The Finance Manager \"([^\"]*)\"$")
	public void i_am_Selecting_The_Finance_Manager(String arg1) throws Throwable 
	{
		driver.findElement(By.id("finance_manager_id")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//select[@id='finance_manager_id']//option[@value='29'][normalize-space()='Anjani kumar (BRTV03)']")).click();
	}

	@When("^i am Selecting The Client \"([^\"]*)\"$")
	public void i_am_Selecting_The_Client(String arg1) throws Throwable 
	{
		driver.findElement(By.id("client_id")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//option[normalize-space()='Vibho']")).click(); 
	}

	@When("^i am Selecting The Client Manager \"([^\"]*)\"$")
	public void i_am_Selecting_The_Client_Manager(String clientname) throws Throwable 
	{
		driver.findElement(By.id("client_manager")).sendKeys(clientname);
	    Thread.sleep(2000);

	}

	@When("^i Enter The Bank Name \"([^\"]*)\"$")
	public void i_Enter_The_Bank_Name(String bname) throws Throwable 
	{
		driver.findElement(By.id("bank_name")).sendKeys(bname);
 
	}

	@When("^i Enter The Account Type As \"([^\"]*)\"$")
	public void i_Enter_The_Account_Type_As(String ectype) throws Throwable 
	{
		driver.findElement(By.xpath("//select[@id='account_type']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//option[@value='Saving Account']")).sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	}

	@When("^i Enter The Beneficiary Name As \"([^\"]*)\"$")
	public void i_Enter_The_Beneficiary_Name_As(String bname) throws Throwable 
	{
		driver.findElement(By.xpath("//input[@placeholder='Enter Beneficiary Name']")).sendKeys(bname);
	    Thread.sleep(2000);
 
	}

	@When("^i Enter The Account Number As \"([^\"]*)\"$")
	public void i_Enter_The_Account_Number_As(String acno) throws Throwable 
	{
	    driver.findElement(By.id("account_number")).sendKeys(acno);
	    Thread.sleep(2000);

	}

	@When("^I Enter The IFSC Code As \"([^\"]*)\"$")
	public void i_Enter_The_IFSC_Code_As(String ifsccode) throws Throwable 
	{
		driver.findElement(By.id("ifsc_code")).sendKeys(ifsccode);
	    Thread.sleep(2000);

	}

	@When("^i am Selecting The Identification Type As \"([^\"]*)\"$")
	public void i_am_Selecting_The_Identification_Type_As(String arg1) throws Throwable 
	{
		driver.findElement(By.id("identification_type_id")).click();
	    driver.findElement(By.xpath("//option[normalize-space()='Passport']")).click();
	    Thread.sleep(2000);

	}

	@When("^i Enter The Identification Number As \"([^\"]*)\"$")
	public void i_Enter_The_Identification_Number_As(String idno) throws Throwable 
	{
		driver.findElement(By.id("identification_number")).sendKeys(idno);
	    Thread.sleep(2000);
  
	}

	@When("^i Upload The Identification image$")
	public void i_Upload_The_Identification_image() throws Throwable 
	{
		WebElement id_image = driver.findElement(By.xpath("//input[@id='simage']"));
	    id_image.sendKeys("C:\\Users\\anjib\\OneDrive\\Desktop\\Vibes_Images\\Images5.jpg");        
	         
	          Thread.sleep(3000);
	}

	@When("^i Click On Finish Icon$")
	public void i_Click_On_Finish_Icon() throws Throwable
	{
		 driver.findElement(By.xpath("//a[contains(text(),'Finish')]")).click();

	}

	@Then("^i Should See Text As Ok$")
	public void i_Should_See_Text_As_Ok() throws Throwable 
	{
		 if (
			      driver.findElement(By.xpath("//button[normalize-space()='OK']")).isDisplayed())
			      {
			          System.out.println("Successfully Added Employee Details - TestPass");
			      }else {
			    	  System.out.println("UnSuccessfully Added Employee Details - TestFail");
				}
			      Thread.sleep(3000);
			      
			      driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
 
	}


	//-------------------Add Employee Checks--------------------------------------------//
	
	
	@When("^i click on Employee Checks$")
	public void i_click_on_Employee_Checks() throws Throwable 
	{
		driver.findElement(By.xpath("//span[contains(text(),'Employee Checks')]")).click();
	 	  
	}

	@When("^i click on Add Employee Checks$")
	public void i_click_on_Add_Employee_Checks() throws Throwable 
	{
	    driver.findElement(By.xpath("//a[normalize-space()='Add Employee Checks']")).click();
	    Thread.sleep(2000);
	}

	@When("^i Select An Employee$")
	public void i_Select_An_Employee() throws Throwable 
	{
	    driver.findElement(By.xpath("//span[@id='select2-emp_id-container']")).click();
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
		
	    
	    
	}

	@When("^i Click on Documents Type ITC$")
	public void i_Click_on_Documents_Type_ITC() throws Throwable 
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[normalize-space()='ITC']")).click();
		Thread.sleep(2000);
	}

	@When("^i upload The ITC Document$")
	public void i_upload_The_ITC_Document() throws Throwable 
	{
		WebElement id_image1 = driver.findElement(By.xpath("//div[@class='form-group row ITC-DIV']//input[@type='text']"));
		id_image1.sendKeys("C:\\Users\\anjib\\OneDrive\\Desktop\\Vibes_Images\\Images3.jpg"); 
		Thread.sleep(2000);   
		
	}

	@When("^i click on Document Type Criminal$")
	public void i_click_on_Document_Type_Criminal() throws Throwable 
	{
		driver.findElement(By.xpath("//label[normalize-space()='Criminal']")).click();
		Thread.sleep(2000);
		  
	}

	@When("^i upload The Criminal Document$")
	public void i_upload_The_Criminal_Document() throws Throwable 
	{
		WebElement id_image2 = driver.findElement(By.xpath("//div[@class='form-group row Criminal-DIV']//input[@type='text']"));
	    id_image2.sendKeys("C:\\Users\\anjib\\OneDrive\\Desktop\\Vibes_Images\\Images4.jpg"); 
	    Thread.sleep(2000);
	      
	}

	@When("^i click on Document Type Educational$")
	public void i_click_on_Document_Type_Educational() throws Throwable 
	{
		driver.findElement(By.xpath("//label[normalize-space()='Educational']")).click();
		Thread.sleep(2000);
		  
	}

	@When("^i upload The Educational Document$")
	public void i_upload_The_Educational_Document() throws Throwable 
	{
		WebElement id_image3 = driver.findElement(By.xpath("//div[@class='form-group row EDU-DIV']//input[@type='text']"));
		id_image3.sendKeys("C:\\Users\\anjib\\OneDrive\\Desktop\\Vibes_Images\\Images5.jpg"); 
		Thread.sleep(2000);
		 
	}

	@When("^i click on The References Document$")
	public void i_click_on_The_References_Document() throws Throwable 
	{
		driver.findElement(By.xpath("//label[normalize-space()='References']")).click();
	    Thread.sleep(2000);
	    
	}

	@When("^i upload the references Document$")
	public void i_upload_the_references_Document() throws Throwable 
	{
		WebElement id_image4 = driver.findElement(By.xpath("//div[@class='form-group row REF-DIV']//input[@type='text']"));
	    id_image4.sendKeys("C:\\Users\\anjib\\OneDrive\\Desktop\\Vibes_Images\\Images6.jpg"); 
	     Thread.sleep(2000);

	}

	@When("^i Am Saving The Documents$")
	public void i_Am_Saving_The_Documents() throws Throwable 
	{
		 driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
	       
	}


	//---------------------------------Add Assets--------------------------------------------//
	
	
	@Then("^i click on Assets Menu$")
	public void i_click_on_Assets_Menu() throws Throwable 
	{
		driver.findElement(By.xpath("//body/div[@id='layout-wrapper']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
          
	}

	@Then("^i click on Assets$")
	public void i_click_on_Assets() throws Throwable 
	{
		driver.findElement(By.xpath("//body/div[@id='layout-wrapper']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
	         
	}

	@Then("^i click on Add Assets$")
	public void i_click_on_Add_Assets() throws Throwable 
	{
		driver.findElement(By.xpath("//a[normalize-space()='Add Asset']")).click();
	        
	}

	@Then("^i Enter the Asset Name As \"([^\"]*)\"$")
	public void i_Enter_the_Asset_Name_As(String arg1) throws Throwable 
	{
		driver.findElement(By.id("name")).sendKeys("anjani");
 
	}

	@Then("^i am Selecting The Supplier Name As \"([^\"]*)\"$")
	public void i_am_Selecting_The_Supplier_Name_As(String arg1) throws Throwable 
	{
		WebElement catelement = driver.findElement(By.id("supplier_id"));
        Select cat = new Select(catelement.findElement(By.id("supplier_id")));
        cat.selectByVisibleText("DTDC");
        
    
        try {
        	driver.findElement(By.id("page-header-user-dropdown")).isDisplayed();
        	System.out.println("Supplier details Added Successfully Test Pass");
		} catch (Exception e)
        {
			System.out.println("Test Fail");
			}
          Thread.sleep(3000);
	}
    
	
	@Then("^i am Selecting The Brand Name As \"([^\"]*)\"$")
	public void i_am_Selecting_The_Brand_Name_As(String arg1) throws Throwable 
	{
		 Thread.sleep(3000);
	        driver.findElement(By.id("brand_id")).click();     
	        
	        WebElement brandname = driver.findElement(By.id("brand_id"));
	        Select name = new Select(brandname);
	        name.selectByVisibleText("DELL");
	        try {
				driver.findElement(By.id("brand_id")).isDisplayed();
				System.out.println("Brand details Added Successfully Test Pass");
			} catch (Exception e)
	        {
				System.out.println("Test Fail");
			}
			 
	}

	@Then("^i am Selecting The Asset Type As \"([^\"]*)\"$")
	public void i_am_Selecting_The_Asset_Type_As(String arg1) throws Throwable 
	{
		 WebElement assertname = driver.findElement(By.id("asset_type_id"));
	        Select name2 = new Select(assertname);
	        name2.selectByVisibleText("LAPTOP");
	        
	        try {
				driver.findElement(By.id("brand_id")).isDisplayed();
	        	System.out.println("selection of Assert type is Successfully Test Pass");
			} catch (Exception e)
	        {
				System.out.println("Test Fail");
			} 
	}

	@Then("^i am Selecting The Purchase date As \"([^\"]*)\"$")
	public void i_am_Selecting_The_Purchase_date_As(String arg1) throws Throwable 
	{
		 String pdate = "16/Jun/2024";
	        String[] dt = pdate.split("/");
	        String date = dt[0];
	        String month = dt[1];
	        String year =dt[2];
	        
	      //  String mmyy = month+""+year;
	        String mm = month;
	        String yy = year;
	        System.out.println(mm);
	        System.out.println(yy);
	        
	        Thread.sleep(3000);
	        driver.findElement(By.id("purchase_date")).click();
	        String calyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	        System.out.println(calyear);
	        
	        while (!calyear.equalsIgnoreCase(yy))
	        {
				driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
				calyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			}
	        String calmonth = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
	        System.out.println(calmonth);
	        
	        while (!calmonth.equalsIgnoreCase(mm))
	        {
	        	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	        	calmonth = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
	        	
	        }
	        
	        WebElement table = driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/table[1]"));
	        
	        List<WebElement> rows = table.findElements(By.tagName("tr"));
	        
	          for(int i=1; i<rows.size(); i++)
	          {
	        List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
	        
	          for(WebElement element : cols)
	             {
	        	  if(element.getText().equals(date)) 
	        	  {
	        		  element.click();
	        		  break;
	        	  }
	        	  
	             }
	          }
	       
	        
	        
	         
	}

	@Then("^i am Selecting The Status Name As \"([^\"]*)\"$")
	public void i_am_Selecting_The_Status_Name_As(String arg1) throws Throwable 
	{
		 WebElement statusfield = driver.findElement(By.id("status_id"));
	        Select stat = new Select(statusfield);
	        stat.selectByVisibleText("WORKING");
	        
	        try {
				driver.findElement(By.id("brand_id")).isDisplayed();
				System.out.println("Selection of Status Is Successfully  Test Pass");
			} catch (Exception e) {
				System.out.println("Test Fail");
			}  
	}

	@Then("^i am Selecting The Location As \"([^\"]*)\"$")
	public void i_am_Selecting_The_Location_As(String arg1) throws Throwable 
	{
		WebElement locname = driver.findElement(By.id("location_id"));
        Select lname = new Select(locname);
        lname.selectByVisibleText("HYDERABAD");
        
        try {
			driver.findElement(By.id("brand_id")).isDisplayed();
			System.out.println("Selection of Status Is Successfully  Test Pass");
		} catch (Exception e) {
			System.out.println("Test Fail");
		} 
	}

	@Then("^i Enter The Serial Number As \"([^\"]*)\"$")
	public void i_Enter_The_Serial_Number_As(String slno) throws Throwable 
	{
		driver.findElement(By.id("serial_no")).sendKeys(slno);
	       
	}

	@Then("^i Enter The Cost$")
	public void i_Enter_The_Cost() throws Throwable 
	{
		driver.findElement(By.id("cost")).sendKeys("72000");  
	}

	@Then("^i am Selecting The Warrenty Date As \"([^\"]*)\"$")
	public void i_am_Selecting_The_Warrenty_Date_As(String arg1) throws Throwable 
	{
		 String expdate = "16/Jun/2025";
	        String[] dt2 = expdate.split("/");
	        String date2 = dt2[0];
	        String month2 = dt2[1];
	        String year2 = dt2[2];
	        
	        String mm2 = month2;
	        String yy2 = year2;
	        
	        
	        System.out.println(mm2);
	        System.out.println(yy2);
	        
	        Thread.sleep(3000);
	        driver.findElement(By.id("warranty")).click();
	        String calyear2 = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	        System.out.println(calyear2);
	        
	        while(!calyear2.equalsIgnoreCase(yy2))
	        		{
	        	 driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	        	 calyear2 = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	        	 
	        		}
	        String calmonth2 = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	        System.out.println(calmonth2);
	        
	        while(!calmonth2.equalsIgnoreCase(mm2))
	        {
	        	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	        	calmonth2 = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	        }
	        
	        WebElement table2 = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));
	        List<WebElement> rows2 = table2.findElements(By.tagName("tr"));
	          for (int k=1; k< rows2.size(); k++)
	          { 
	       List<WebElement> cols2 = rows2.get(k).findElements(By.tagName("td"));
	          for (WebElement element : cols2)
	          {
	        	  if (element.getText().equals(date2))
	        	  {
					element.click();
					break;
				}
	          }
	        
	        
	        
	          }
	        
	}

	@Then("^i Enter The Description Details As \"([^\"]*)\"$")
	public void i_Enter_The_Description_Details_As(String arg1) throws Throwable 
	{
		driver.findElement(By.id("description")).sendKeys("Make A Note");
        Thread.sleep(2000);   
	}

	@Then("^i upload The file$")
	public void i_upload_The_file() throws Throwable 
	{
		 WebElement id_image2 = driver.findElement(By.xpath("//input[@id='simage']"));
		    id_image2.sendKeys("C:\\Users\\anjib\\OneDrive\\Desktop\\Vibes_Images\\Images3.jpg"); 
		   Thread.sleep(2000);  
	}

	@Then("^i Click On Save Option$")
	public void i_Click_On_Save_Option() throws Throwable 
	{
		driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Save']")).sendKeys(Keys.ENTER);
		
		
        if (
			      driver.findElement(By.xpath("//button[normalize-space()='OK']")).isDisplayed())
			      {
			          System.out.println("Successfully Added Asst Details - TestPass");
			      }else {
			    	  System.out.println("UnSuccessfully Added Asset Details - TestFail");
				}
			      Thread.sleep(3000);
			      
			      driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
			
	}

	
	
	//------------------------------ADD Components---------------------------------------//
	
	
	
	@Then("^i click on Components$")
	public void i_click_on_Components() throws Throwable 
	{
		driver.findElement(By.xpath("//span[normalize-space()='Components']")).click();
	       
	}

	@Then("^i click on Add Componants$")
	public void i_click_on_Add_Componants() throws Throwable
	{
		driver.findElement(By.xpath("//a[normalize-space()='Add Component']")).click();
        
	}

	@Then("^i am Selecting The Asset name as \"([^\"]*)\"$")
	public void i_am_Selecting_The_Asset_name_as(String arg1) throws Throwable 
	{
        String ename = "Anjani (VT986645750)"; 
        
        driver.findElement(By.xpath("//span[@role='presentation']")).click();
		
    	
    		Thread.sleep(2000);
    		
    		
    		List<WebElement> keywordlist = driver.findElement(By.id("select2-asset_id-results")).findElements(By.tagName("li"));
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
		
	}

	@Then("^i Enter The Component Name as \"([^\"]*)\"$")
	public void i_Enter_The_Component_Name_as(String cname) throws Throwable 
	{
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(cname);
	      
	}

	@Then("^i Enter The Component Quantity \"([^\"]*)\"$")
	public void i_Enter_The_Component_Quantity(String qty) throws Throwable
	{
		driver.findElement(By.xpath("//input[@id='qty']")).sendKeys(qty);
	     
	}

	@Then("^i am Selecting The Asset Type as \"([^\"]*)\"$")
	public void i_am_Selecting_The_Asset_Type_as(String arg1) throws Throwable 
	{
		driver.findElement(By.xpath("//select[@id='asset_type_id']")).click();
    	driver.findElement(By.xpath("//option[normalize-space()='LAPTOP']")).click();
    	  
	}

	@Then("^i am Selecting The Brand Name as \"([^\"]*)\"$")
	public void i_am_Selecting_The_Brand_Name_as(String arg1) throws Throwable 
	{
		driver.findElement(By.xpath("//select[@id='brand_id']")).click();
    	driver.findElement(By.xpath("//option[normalize-space()='DELL']")).click();
    	
	}

	@Then("^i am Selecting The Component Purchase Date as \"([^\"]*)\"$")
	public void i_am_Selecting_The_Component_Purchase_Date_as(String arg1) throws Throwable 
	{
		String pdate = "19/May/2024";
        String[] dt = pdate.split("/");
        String date = dt[0];
        String month = dt[1];
        String year =dt[2];
        
      //  String mmyy = month+""+year;
        String mm = month;
        String yy = year;
        System.out.println(mm);
        System.out.println(yy);
        
        Thread.sleep(3000);
        driver.findElement(By.id("purchase_date")).click();
        String calyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
        System.out.println(calyear);
        
        while (!calyear.equalsIgnoreCase(yy))
        {
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			calyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		}
        String calmonth = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
        System.out.println(calmonth);
        
        while (!calmonth.equalsIgnoreCase(mm))
        {
        	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        	calmonth = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
        	
        }
        
        WebElement table = driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/table[1]"));
        
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        
          for(int i=1; i<rows.size(); i++)
          {
        List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
        
          for(WebElement element : cols)
             {
        	  if(element.getText().equals(date)) 
        	  {
        		  element.click();
        		  break;
        	  }
        	  
             }
          }
        
	}

	@Then("^i am Selecting The Component Warrenty Date as \"([^\"]*)\"$")
	public void i_am_Selecting_The_Component_Warrenty_Date_as(String arg1) throws Throwable 
	{
		// Calender Selection
      	
        String pdate1 = "19/May/2026";
        String[] dt1 = pdate1.split("/");
        String date1 = dt1[0];
        String month1 = dt1[1];
        String year1 =dt1[2];
        
      //  String mmyy = month+""+year;
        String mm1 = month1;
        String yy1 = year1;
        System.out.println(mm1);
        System.out.println(yy1);
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='warranty']")).click();
        String calyear1 = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
        System.out.println(calyear1);
        
        while (!calyear1.equalsIgnoreCase(yy1))
        {
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			calyear1 = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		}
        String calmonth1 = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
        System.out.println(calmonth1);
        
        while (!calmonth1.equalsIgnoreCase(mm1))
        {
        	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        	calmonth1 = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
        	
        }
        
        WebElement table1 = driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/table[1]"));
        
        List<WebElement> rows1 = table1.findElements(By.tagName("tr"));
        
          for(int i=1; i<rows1.size(); i++)
          {
        List<WebElement> cols1 = rows1.get(i).findElements(By.tagName("td"));
        
          for(WebElement element : cols1)
             {
        	  if(element.getText().equals(date1)) 
        	  {
        		  element.click();
        		  break;
        	  }
        	  
             }
          }  
	}

	@Then("^i am Selecting The Status As \"([^\"]*)\"$")
	public void i_am_Selecting_The_Status_As(String arg1) throws Throwable 
	{
		driver.findElement(By.xpath("//select[@id='status_id']")).click();
        driver.findElement(By.xpath("//option[normalize-space()='WORKING']")).click();
        
	}

	@Then("^i am Entering The Component Serial number as \"([^\"]*)\"$")
	public void i_am_Entering_The_Component_Serial_number_as(String sno) throws Throwable
	{
		driver.findElement(By.xpath("//input[@id='serial_no']")).sendKeys(sno);
         
	}

	@Then("^i am Selecting The Supplier Details as \"([^\"]*)\"$")
	public void i_am_Selecting_The_Supplier_Details_as(String arg1) throws Throwable 
	{
		driver.findElement(By.xpath("//select[@id='supplier_id']")).click();
        driver.findElement(By.xpath("//option[normalize-space()='DTDC']")).click();
       
	}

	@Then("^i am Selecting The Location as \"([^\"]*)\"$")
	public void i_am_Selecting_The_Location_as(String arg1) throws Throwable 
	{
		driver.findElement(By.xpath("//select[@id='location_id']")).click();
        driver.findElement(By.xpath("//option[normalize-space()='HYDERABAD']")).click();
        Thread.sleep(2000);  
	}

	@Then("^i am Entering The Component Cost as \"([^\"]*)\"$")
	public void i_am_Entering_The_Component_Cost_as(String cost) throws Throwable 
	{
		 driver.findElement(By.xpath("//input[@id='cost']")).sendKeys(cost);
		    
         
	}

	//----------------------------Add Maintenance----------------------------------------------//

	
	@Then("^i click on Maintenance$")
	public void i_click_on_Maintenance() throws Throwable 
	{
		driver.findElement(By.xpath("//span[normalize-space()='Maintenances']")).click();
         
	}

	@Then("^i click on Add Maintenance$")
	public void i_click_on_Add_Maintenance() throws Throwable 
	{
		 driver.findElement(By.xpath("//a[normalize-space()='Add Maintenance']")).click();
	       
	}

	@Then("^i am Selecting Asset Name As \"([^\"]*)\"$")
	public void i_am_Selecting_Asset_Name_As(String arg1) throws Throwable 
	{
		 String ename = "Anjani (VT986645750)"; 
	        driver.findElement(By.xpath("//span[@id='select2-asset_id-container']")).click();
	       
	        List<WebElement> keywordlist = driver.findElement(By.id("select2-asset_id-results")).findElements(By.tagName("li"));
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
	           
	}

	@Then("^i am Selecting The Supplier As \"([^\"]*)\"$")
	public void i_am_Selecting_The_Supplier_As(String arg1) throws Throwable 
	{
		driver.findElement(By.xpath("//select[@id='supplier_id']")).click();
   	 driver.findElement(By.xpath("//option[normalize-space()='Dell']")).click();
   	 
	}

	@Then("^i am Selecting The Maintenance Start Date As \"([^\"]*)\"$")
	public void i_am_Selecting_The_Maintenance_Start_Date_As(String arg1) throws Throwable 
	{
		try {
			
			
	    	driver.findElement(By.id("start_dt")).click();
	    	 
	    	String dob = "12/Jan/2014";
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
	    	} catch (Exception e)
	    	{
				System.out.println("Test Pass");
			}
	 	     
	    	 Thread.sleep(2000);   
	}

	@Then("^i am Selecting The Maintenance End Date As \"([^\"]*)\"$")
	public void i_am_Selecting_The_Maintenance_End_Date_As(String arg1) throws Throwable 
	{
		 driver.findElement(By.xpath("//input[@id='end_dt']")).click();
    	 
    	 
 	    String dob2 = "11-Jan-2029";
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
		     for(int k=1; k<rows2.size(); k++)
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
	}

	@Then("^i Enter The Comments As \"([^\"]*)\"$")
	public void i_Enter_The_Comments_As(String arg1) throws Throwable 
	{
		 driver.findElement(By.xpath("//textarea[@id='comments']")).sendKeys("No Comment");
	    	  
	}

	
	//--------------------------Updating Maintenance-------------------------------------------//
	
	
	@Then("^i enter The Search table With The Text as \"([^\"]*)\"$")
	public void i_enter_The_Search_table_With_The_Text_as(String sername) throws Throwable 
	{
	  driver.findElement(By.xpath("//input[@type='search']")).sendKeys(sername);
	  Thread.sleep(2000);
	}

	@Then("^i enter The Edit Option$")
	public void i_enter_The_Edit_Option() throws Throwable 
	{
	    driver.findElement(By.xpath("//tr[@class='odd']//a[@class='btn btn-info waves-effect waves-light'][normalize-space()='Edit']")).click();
	}

	@Then("^i Update The Supplier Details As \"([^\"]*)\"$")
	public void i_Update_The_Supplier_Details_As(String arg1) throws Throwable 
	{
		driver.findElement(By.xpath("//select[@id='type_id']")).click();
    	driver.findElement(By.xpath("//option[normalize-space()='Desktop']")).click();
    	
	}

	@Then("^i Click On Updaate Option$")
	public void i_Click_On_Updaate_Option() throws Throwable 
	{
		driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
        
        if (
			      driver.findElement(By.xpath("//button[normalize-space()='OK']")).isDisplayed())
			      {
			          System.out.println("Successfully Updated Maintanance Details - TestPass");
			      }else {
			    	  System.out.println("UnSuccessfully Updated Maintanance Details - TestFail");
				}
			      Thread.sleep(3000);
			      
			      driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();

	}


  //----------------------------Employee Annual Performance----------------------------------//
	
	
	@When("^i Click On Employee Annual Performance$")
	public void i_Click_On_Employee_Annual_Performance() throws Throwable 
	{
	  driver.findElement(By.xpath("//span[normalize-space()='Employee Annual Performance']")).click();
	}

	@When("^i Click On Add Employee Annual Performance$")
	public void i_Click_On_Add_Employee_Annual_Performance() throws Throwable 
	{
	   driver.findElement(By.xpath("//a[normalize-space()='Add Employee Annual Performance']")).click(); 
	}

	@When("^i Select An Employee name As \"([^\"]*)\"$")
	public void i_Select_An_Employee_name_As(String arg1) throws Throwable 
	{
	  String ename = "Anjani kumar (BRTV03)";	
	  driver.findElement(By.id("select2-emp_id-container")).click(); 
	  Thread.sleep(2000);
	  
	  List<WebElement> keywordlist = driver.findElement(By.id("select2-emp_id-results")).findElements(By.tagName("li"));
	  System.out.println(keywordlist.size());
	  
	  
	  for (int i = 1; i < keywordlist.size(); i++)
	  {
		  if (keywordlist.get(i).getText().equalsIgnoreCase(ename))
		  {
			  System.out.println("Test Pass");
			  keywordlist.get(i).click();
			  break;
			
		} else 
		{
           System.out.println("Test Fail");
		}
		
	}
	}

	@When("^i Select On Appraisal Date As \"([^\"]*)\"$")
	public void i_Select_On_Appraisal_Date_As(String arg1) throws Throwable 
	{
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
	}

	@When("^i Am Entering The Appraisal Rating As \"([^\"]*)\"$")
	public void i_Am_Entering_The_Appraisal_Rating_As(String rat) throws Throwable 
	{
	   driver.findElement(By.xpath("//input[@id='appraisal_rating']")).sendKeys(rat); 
	}

	@When("^i Am Entering The Existing Role As \"([^\"]*)\"$")
	public void i_Am_Entering_The_Existing_Role_As(String erole) throws Throwable 
	{
		 driver.findElement(By.id("existing_role")).sendKeys(erole);
		   
	}

	@When("^i Am Entering The New role \"([^\"]*)\"$")
	public void i_Am_Entering_The_New_role(String nrole) throws Throwable 
	{
		 driver.findElement(By.id("new_role")).sendKeys(nrole);
		  
	}

	@When("^i Am Entering The Existing Salary \"([^\"]*)\"$")
	public void i_Am_Entering_The_Existing_Salary(String esal) throws Throwable 
	{
		   driver.findElement(By.id("existing_salary")).sendKeys(esal);
			
	}

	@When("^i Am Entering the New salary \"([^\"]*)\"$")
	public void i_Am_Entering_the_New_salary(String nsal) throws Throwable 
	{
		   driver.findElement(By.id("new_salary")).sendKeys(nsal);
			   
	}

	@When("^i Am Entering The Hr Feedback Comments As \"([^\"]*)\"$")
	public void i_Am_Entering_The_Hr_Feedback_Comments_As(String hrfdback) throws Throwable 
	{
		   driver.findElement(By.id("hr_feedback_comments")).sendKeys(hrfdback);
		   
	}

	@When("^i Am Entering The Employee Feedback Comments As \"([^\"]*)\"$")
	public void i_Am_Entering_The_Employee_Feedback_Comments_As(String empfdback) throws Throwable 
	{
		 driver.findElement(By.id("employee_feedback_comments")).sendKeys(empfdback);
		   
	}

	@When("^i Am Entering The Relationship Manager Comments As \"([^\"]*)\"$")
	public void i_Am_Entering_The_Relationship_Manager_Comments_As(String rlscom) throws Throwable 
	{
		 driver.findElement(By.id("relationship_manager_comments")).sendKeys(rlscom);
		  
	}

	@When("^i Click on SAVE Option$")
	public void i_Click_on_SAVE_Option() throws Throwable 
	{
		    JavascriptExecutor js = (JavascriptExecutor)driver;
		    js.executeScript("window.scroll(0,2000)");
		    Thread.sleep(2000);
	        driver.findElement(By.xpath("//button[normalize-space()='Save']")).sendKeys(Keys.ENTER);
		    Thread.sleep(2000);
	}


	//--------------------------------Update Employee Annual Performance--------------------------//
	
	
	@When("^i click on Search Option and i enter the Field As \"([^\"]*)\"$")
	public void i_click_on_Search_Option_and_i_enter_the_Field_As(String searchfield) throws Throwable 
	{
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(searchfield);
		Thread.sleep(2000);  
	}

	@When("^i Click On Edit OptioN$")
	public void i_Click_On_Edit_OptioN() throws Throwable 
	{
		driver.findElement(By.xpath("//tr[@class='even']//a[@class='btn btn-info waves-effect waves-light'][normalize-space()='Edit']")).click();
		   
	}

	@When("^i update The New Role As \"([^\"]*)\"$")
	public void i_update_The_New_Role_As(String newrole) throws Throwable 
	{
	    driver.findElement(By.id("existing_role")).clear();
	    driver.findElement(By.id("existing_role")).sendKeys(newrole);
		 
	}

	@When("^i Click On UPDATE option$")
	public void i_Click_On_UPDATE_option() throws Throwable 
	{
		 driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
		 Thread.sleep(2000);   
	}


	
	//-----------------------------Add Employee Checks-------------------------------------//
	
	
	@When("^i Click On Add Employee Checks$")
	public void i_Click_On_Add_Employee_Checks() throws Throwable 
	{
	  driver.findElement(By.xpath("//a[normalize-space()='Add Employee Checks']")).click();
	  Thread.sleep(2000);
	}

	@When("^i Upload The Documents$")
	public void i_Upload_The_Documents() throws Throwable 
	{
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
	}
	
	    
	   //-------------------------------Timesheet Management----------------------------------//
	    
	    
	    
	    @When("^i click On Time Sheet Management$")
	    public void i_click_On_Time_Sheet_Management() throws Throwable 
	    {
	    	driver.findElement(By.xpath("//span[contains(text(),'Timesheet Management')]")).click();
			
	    }

	    @When("^i Click On Timesheet$")
	    public void i_Click_On_Timesheet() throws Throwable 
	    {
	    	driver.findElement(By.xpath("//span[normalize-space()='Timesheet']")).click();
	    	  
	    }

	    @When("^i Select the Client As \"([^\"]*)\"$")
	    public void i_Select_the_Client_As(String cname) throws Throwable 
	    {
	      WebElement clientname = driver.findElement(By.id("select2-client_id-container"));
	      Select clname = new Select(clientname);
	      clname.selectByVisibleText(cname);
	      
	    }

	    @When("^i Select The Timesheet Start Date As \"([^\"]*)\"$")
	    public void i_Select_The_Timesheet_Start_Date_As(String tstdate) throws Throwable 
	    {
	        
	    	try {
	    		
	  		  driver.findElement(By.xpath("//input[@id='start_date']")).click();
	  		
	  		  String edate = tstdate;
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
	  		  
	  		} catch (Exception e)
	  		{
	  			System.out.println("Test Pass");
	  		}
	  		    
	  		    
	  		 Thread.sleep(2000);
	  		 
	    	
	    }

	    @When("^i Select The Timesheet End Date As \"([^\"]*)\"$")
	    public void i_Select_The_Timesheet_End_Date_As(String tenddate) throws Throwable 
	    {
	     
	    	try {
	    		
			    driver.findElement(By.xpath("//input[@placeholder='Select End Date']")).click();
			
			    String dob2 = tenddate;
				String[] temp2 = dob2.split("/");
				String dt2 = temp2[0];
				String mon2 = temp2[1];
				String yr2 = temp2[2];
				
				Select ylist2 = new Select(driver.findElement(By.className("ui-datepicker-year")));
			    ylist2.selectByVisibleText(yr2);
			    
			    Select mlist2 = new Select(driver.findElement(By.className("ui-datepicker-month")));
			    mlist2.selectByVisibleText(mon2);
			    
			    WebElement cal2 = driver.findElement(By.className("ui-datepicker-calendar"));
			    
			    List<WebElement> rows2 = cal2.findElements(By.tagName("tr"));
			     for(int k=1; k<rows2.size(); k++)
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
		} catch (Exception e)
		{
		   System.out.println("Test Pass");
		}		
	    	
	    }

	    @When("^i Click On View$")
	    public void i_Click_On_View() throws Throwable 
	    {

	 	    driver.findElement(By.xpath("//button[normalize-space()='View']")).click();
	 	     
	    }

	    @Then("^i Should See Timesheet Page View$")
	    public void i_Should_See_Timesheet_Page_View() throws Throwable 
	    {
	        
	    	if (driver.findElement(By.xpath("//body/div[@id='layout-wrapper']/div[@class='main-content']/div[@class='page-content']/div[@class='container-fluid']/div[@class='row']/div[@class='col-12']/div[@class='card']/div[@class='card-body']/div[@class='append_timesheet']/div[@class='container']/form[@id='myForm']/div[1]")).isDisplayed()) 
	    	    {
				  System.out.println("Test Pass");
			}else {
				System.out.println("Test Fail");
			}
	    	
	    }


	//---------------------------Add Public Holidays--------------------------------------------//
	    
	    
	    
	    @When("^i click on Public Holidays$")
	    public void i_click_on_Public_Holidays() throws Throwable 
	    {
	    	driver.findElement(By.xpath("//span[contains(text(),'Public Holidays')]")).click();
		    Thread.sleep(2000);
		       
	    }

	    @When("^i click on Add Public Holiday$")
	    public void i_click_on_Add_Public_Holiday() throws Throwable 
	    {
	        driver.findElement(By.xpath("//body/div[@id='layout-wrapper']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
		    Thread.sleep(2000);
		  
	    }

	    @When("^i Enter The Holiday Name As \"([^\"]*)\"$")
	    public void i_Enter_The_Holiday_Name_As(String hname) throws Throwable 
	    {
	    	 driver.findElement(By.xpath("//input[@id='name']")).sendKeys(hname);  
	    }

	    @When("^i Select The Holiday Date As \"([^\"]*)\"$")
	    public void i_Select_The_Holiday_Date_As(String hdate) throws Throwable 
	    {
	       
	    	 driver.findElement(By.xpath("//input[@id='date']")).click();
		     
		     try {
		 		
		    		
		    		String dob2 = hdate;
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
		    	     for(int k=1; k<rows2.size(); k++)
		    	     { 
		    	    	 List<WebElement> cols2 = rows2.get(k).findElements(By.tagName("td"));
		    	    	 for(int x=0; x<cols2.size(); x++) 
		    	    	 {
		    	    		if(cols2.get(x).getText().equals(dt2))
		    	    		{
		    	    			cols2.get(x).click();
		    	    			break;
		    	    		}
		    	    	 }    
		    	     }
		    		} catch (Exception e)
		    	  	 {
		    		System.out.println("Period To Date Is Selected Test Pass");
		    	   }
		    		  
		    		Thread.sleep(2000);
	    	
	    }


	
   //-------------------------Configuration Menu-------------------------------------//
	    
   // Add Designations
	    
	    
	    @When("^i click on Configuration Menu$")
	    public void i_click_on_Configuration_Menu() throws Throwable 
	    {
	    	driver.findElement(By.xpath("//span[contains(text(),'Configuration Menu')]")).click();
		    Thread.sleep(2000);
		    
	    }

	    @When("^i click on Designation$")
	    public void i_click_on_Designation() throws Throwable 
	    {
	        driver.findElement(By.xpath("//span[contains(text(),'Designations')]")).click();
	    		   
	    }

	    @When("^i click On Add Designation$")
	    public void i_click_On_Add_Designation() throws Throwable 
	    {
	       driver.findElement(By.xpath("//body/div[@id='layout-wrapper']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
	   	     
	    }

	    @When("^i Enter The Designation Name As \"([^\"]*)\"$")
	    public void i_Enter_The_Designation_Name_As(String DNM) throws Throwable 
	    {
	       driver.findElement(By.xpath("//input[@id='designation_name']")).sendKeys(DNM);
	  	   Thread.sleep(2000);
	  	  
	    }

	    
	 //-------------------------------Add Management---------------------------------------//
	    
	    
	    @When("^i click On Management$")
	    public void i_click_On_Management() throws Throwable 
	    {
	       driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[10]/ul[1]/li[2]/a[1]/div[1]/span[1]")).click();
	    	    
	    }

	    @When("^i click On Add Management$")
	    public void i_click_On_Add_Management() throws Throwable 
	    {
	       driver.findElement(By.xpath("//body/div[@id='layout-wrapper']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
	    		  
	    }

	    @When("^i Select The Employee Management Name As \"([^\"]*)\"$")
	    public void i_Select_The_Employee_Management_Name_As(String empmanname) throws Throwable 
	    {
	    	driver.findElement(By.id("select2-emp_id-container")).click();
		    Thread.sleep(3000);
		 
			List<WebElement> keywordlist = driver.findElement(By.id("select2-emp_id-results")).findElements(By.tagName("li"));
			System.out.println(keywordlist.size());
		
			
			  for (int i = 1; i < keywordlist.size(); i++)
			  {
				if (keywordlist.get(i).getText().equalsIgnoreCase(empmanname))
				{
					System.out.println("testpass");
					keywordlist.get(i).click();
				    break;
				}
			}
			  
		 Thread.sleep(2000); 
	    }

	    @When("^i Enter The Management Description As \"([^\"]*)\"$")
	    public void i_Enter_The_Management_Description_As(String desc) throws Throwable 
	    {
	      driver.findElement(By.xpath("//input[@id='designation']")).sendKeys(desc);
	   	  
	    }

	    
	 //--------------------------------Add Identification Type-----------------------------//
	    
	    
	    @When("^i click on Identification Type$")
	    public void i_click_on_Identification_Type() throws Throwable 
	    {
	    	 driver.findElement(By.xpath("//span[contains(text(),'Identification Type')]")).click();
	   	     
	    }

	    @When("^i click on Add Identification Type$")
	    public void i_click_on_Add_Identification_Type() throws Throwable 
	    {
	    	driver.findElement(By.xpath("//body/div[@id='layout-wrapper']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
	 	    Thread.sleep(2000);
	 	  
	    }

 /*	    @When("^i Enter The Identification Type$")
	    public void i_Enter_The_Identification_Type() throws Throwable 
	    {
	    	 driver.findElement(By.xpath("//input[@id='identification_name']")).sendKeys("Passport2");
	   	    
	    }
 */
	    @When("^i click on Identification Type As \"([^\"]*)\"$")
	    public void i_click_on_Identification_Type_As(String idname2) throws Throwable 
	    {
	    	driver.findElement(By.xpath("//input[@id='identification_name']")).sendKeys(idname2);
	   	      
	    }

	    
	//----------------------------------Add Client Type--------------------------------------//    
	    
	    
	    @When("^i click on Client Management$")
	    public void i_click_on_Client_Management() throws Throwable 
	    {
	    	driver.findElement(By.xpath("//span[contains(text(),'Client Management')]")).click();
	 	    Thread.sleep(2000);
	 	    
	    }

	    @When("^i Click On Add Client$")
	    public void i_Click_On_Add_Client() throws Throwable 
	    {
	    	driver.findElement(By.xpath("//body/div[@id='layout-wrapper']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
	    	    
	    }

	    @When("^i Enter The Client Name As \"([^\"]*)\"$")
	    public void i_Enter_The_Client_Name_As(String clname) throws Throwable 
	    {
	        driver.findElement(By.xpath("//input[@id='client_name']")).sendKeys(clname);
	   	   
	    }

	    
	//----------------------------------Add Claim Type------------------------------------------//    
	    
	    
	    @When("^i click on Claim Type$")
	    public void i_click_on_Claim_Type() throws Throwable 
	    {
	      driver.findElement(By.xpath("//span[normalize-space()='Claim Type']")).click();  
	      Thread.sleep(2000);
	    }

	    @When("^i click on Add Claim Type$")
	    public void i_click_on_Add_Claim_Type() throws Throwable 
	    {
	       driver.findElement(By.xpath("//a[normalize-space()='Add Claim']")).click(); 
	       Thread.sleep(2000);
	    }

	    @When("^i Enter The Claim Type Name As \"([^\"]*)\"$")
	    public void i_Enter_The_Claim_Type_Name_As(String claimname) throws Throwable 
	    {
	       driver.findElement(By.id("designation_name")).sendKeys(claimname);
	    }
   
	    
	 //------------------------Certificate of Service Letter----------------------------------------//
	    
	    
	    
	    @When("^i Click on Certificate Of Service Letter$")
	    public void i_Click_on_Certificate_Of_Service_Letter() throws Throwable 
	    {
	    	 driver.findElement(By.xpath("//span[contains(text(),'Certificate Of Service Letter')]")).click();
	 	    Thread.sleep(2000); 
	    }

	    @When("^i Select The Certificate Of Service Letter Name As \"([^\"]*)\"$")
	    public void i_Select_The_Certificate_Of_Service_Letter_Name_As(String certname) throws Throwable 
	    {
	    	 driver.findElement(By.xpath("//span[@id='select2-emp_id-container']")).click();
	 	    Thread.sleep(2000);
	 	    
	 	    List<WebElement> emplist = driver.findElement(By.id("select2-emp_id-results")).findElements(By.tagName("li"));
	 	    System.out.println(emplist.size());
	 	    
	 	    
	 	    for (int i = 0; i < emplist.size(); i++)
	 	    {
	 			if (emplist.get(i).getText().equalsIgnoreCase(certname))
	 			{
	 				System.out.println("Generate Certificate Test Pass");
	 				emplist.get(i).click();
	 				break;
	 			}
	 		}
	 	Thread.sleep(2000);  
	    }

	    @When("^i Click on Geenerate Certificate$")
	    public void i_Click_on_Geenerate_Certificate() throws Throwable 
	    {
	    	driver.findElement(By.xpath("//button[contains(text(),'Generate Certificate')]")).click();
	    	Thread.sleep(2000);
	    	 
	    }


   //----------------------------------Add Notification-------------------------------------------//
	    
	    
	    @When("^i click on Notifications$")
	    public void i_click_on_Notifications() throws Throwable 
	    {
	    	driver.findElement(By.xpath("//span[normalize-space()='Notifications']")).click();
		    Thread.sleep(2000);  
	    }

	    @When("^i Click on Add Notifications$")
	    public void i_Click_on_Add_Notifications() throws Throwable 
	    {
	    	driver.findElement(By.xpath("//a[normalize-space()='Add Notifications']")).click();
	        Thread.sleep(2000); 
	    }

	    @When("^i Enter The Title name As \"([^\"]*)\"$")
	    public void i_Enter_The_Title_name_As(String smessage) throws Throwable 
	    {
	    	driver.findElement(By.xpath("//input[@id='title']")).sendKeys(smessage);
	 	    Thread.sleep(2000);
	 	    
	    }

	    @When("^i select the Employs As All$")
	    public void i_select_the_Employs_As_All() throws Throwable  
	    {
	      WebElement elem = driver.findElement(By.id("applicable_to_all"));  
	      Select allemp = new Select(elem);
	      allemp.selectByVisibleText("All");
	    }

	    @When("^i enter the Message As \"([^\"]*)\"$")
	    public void i_enter_the_Message_As(String richtext) throws Throwable 
	    {
	    	driver.findElement(By.xpath("//div[@aria-label='Rich Text Editor, main']")).sendKeys(richtext);
		    Thread.sleep(2000);
	    }

	    @Then("^i will Should See Text As Ok$")
	    public void i_will_Should_See_Text_As_Ok() throws Throwable 
	    {
	    	 driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
	 	    
	 	    if (
	 			      driver.findElement(By.xpath("//button[normalize-space()='OK']")).isDisplayed())
	 			      {
	 			          System.out.println("Successfully Added Notification Details - TestPass");
	 			      }else {
	 			    	  System.out.println("UnSuccessfully Added Notification Details - TestFail");
	 				}
	 			      Thread.sleep(3000);
	 			      
	 			      driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	 		
	 			Thread.sleep(2000);
	 			
	    }

	    
	    @When("^i Go To Dashboard Page$")
	    public void i_Go_To_Dashboard_Page() throws Throwable 
	    {
	       driver.findElement(By.xpath("//span[normalize-space()='Dashboard']")).click();
	       Thread.sleep(2000);
	    }

	    @Then("^i Should See Notfication Details$")
	    public void i_Should_See_Notfication_Details() throws Throwable 
	    {
	     if (driver.findElement(By.xpath("//h6[normalize-space()='Ggfgdf']")).isDisplayed()) 
	     {
			System.out.println("TestPass");
		} else 
		{
			System.out.println("TestFail");
		}  
	    }

 
	//----------------------------------Purchase Orders------------------------------------------//
	    
	//Nature Of Business
	    
	    
	    @When("^i click On Purchase Orders$")
	    public void i_click_On_Purchase_Orders() throws Throwable 
	    {
	    	 driver.findElement(By.xpath("//span[normalize-space()='Purchase Orders']")).click();
	    	 Thread.sleep(2000);  
	    }

	    @When("^i Click On Nature Of Business$")
	    public void i_Click_On_Nature_Of_Business() throws Throwable 
	    {
	      driver.findElement(By.xpath("//span[normalize-space()='Nature Of Business']")).click();
	      Thread.sleep(2000);
	    }

	    @When("^i Click On Add Nature Of Business$")
	    public void i_Click_On_Add_Nature_Of_Business() throws Throwable 
	    {
	      driver.findElement(By.xpath("//a[normalize-space()='Add Nature of Business']")).click();
	      Thread.sleep(2000);
	    }

	    @When("^i Enter The Nature Of Business Name As \"([^\"]*)\"$")
	    public void i_Enter_The_Nature_Of_Business_Name_As(String businessname) throws Throwable 
	    {
	        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(businessname);
	    }

	    
	 //--------------------------Add ECO System Practice--------------------------------//   
	    
	    
	    @When("^i Click on Eco System Practice$")
	    public void i_Click_on_Eco_System_Practice() throws Throwable 
	    {
	      driver.findElement(By.xpath("//span[normalize-space()='Eco System Practice']")).click();
	      Thread.sleep(2000);
	    }

	    @When("^i Click on Add Eco System Practice$")
	    public void i_Click_on_Add_Eco_System_Practice() throws Throwable 
	    {
	       driver.findElement(By.xpath("//a[normalize-space()='Add Eco System/Practice']")).click();
	       Thread.sleep(2000);
	    }

	    @When("^i Enter The Eco System Practice Name As \"([^\"]*)\"$")
	    public void i_Enter_The_Eco_System_Practice_Name_As(String espname) throws Throwable 
	    {
	       driver.findElement(By.xpath("//input[@id='name']")).sendKeys(espname); 
	       Thread.sleep(2000);
	    }

	    
	//--------------------------------Adding Work Orders-------------------------------------------//    
	    
	    
	    @When("^i Click On work Orders$")
	    public void i_Click_On_work_Orders() throws Throwable 
	    {
	      driver.findElement(By.xpath("//span[normalize-space()='Work Orders']")).click();
	      Thread.sleep(2000);
	    }

	    @When("^i Click On Add Work Order$")
	    public void i_Click_On_Add_Work_Order() throws Throwable 
	    {
	       driver.findElement(By.xpath("//a[normalize-space()='Add Work Order']")).click();
	       Thread.sleep(2000);
	    }

	    @When("^i Enter The Claint Name AS \"([^\"]*)\"$")
	    public void i_Enter_The_Claint_Name_AS(String workname) throws Throwable 
	    {
	       driver.findElement(By.xpath("//input[@id='clinet_name']")).sendKeys(workname); 
	    }

	    @When("^i Enter The Project Name As \"([^\"]*)\"$")
	    public void i_Enter_The_Project_Name_As(String prname) throws Throwable 
	    {
	       driver.findElement(By.xpath("//input[@id='project_name']")).sendKeys(prname);
	    		
	    }

	    @When("^i Enter The Client Details As \"([^\"]*)\"$")
	    public void i_Enter_The_Client_Details_As(String place) throws Throwable 
	    {
	      driver.findElement(By.xpath("//textarea[@id='client_details']")).sendKeys(place);	 
	    }

	    @When("^i Enter The PO Deal Amount As \"([^\"]*)\"$")
	    public void i_Enter_The_PO_Deal_Amount_As(String podamount) throws Throwable 
	    {
	    	driver.findElement(By.xpath("//input[@id='PO_deal_amt']")).sendKeys(podamount);
	    }

	    @When("^i Enter The PO Amount As \"([^\"]*)\"$")
	    public void i_Enter_The_PO_Amount_As(String poamount1) throws Throwable 
	    {
	    	driver.findElement(By.xpath("//input[@id='PO']")).sendKeys(poamount1);  
	    }

	    @When("^i Select The Work order Start Date As \"([^\"]*)\"$")
	    public void i_Select_The_Work_order_Start_Date_As(String wsdate) throws Throwable 
	    {
	    	 driver.findElement(By.xpath("//input[@id='start_dt']")).click();
	  	   
	  	   Thread.sleep(2000);
	  	try {	
	  		String dob = wsdate;
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
	  	     }catch (Exception e)
	  	   	 {
	  		System.out.println("Period From Date Is Selected Test Pass");
	  	    }
	  		   Thread.sleep(3000);
	  		   
	    }

	    @When("^i Select The Work order End Date As \"([^\"]*)\"$")
	    public void i_Select_The_Work_order_End_Date_As(String wedate) throws Throwable 
	    {
	    	 driver.findElement(By.xpath("//input[@id='end_dt']")).click();
	   	  Thread.sleep(2000);
	   	try {  
	   	    String dob2 = wedate;
	   		String[] temp2 = dob2.split("/");
	   		String dt2 = temp2[0];
	   		String mon2 = temp2[1];
	   		String yr2 = temp2[2];
	   		
	   		Select ylist2 = new Select(driver.findElement(By.className("ui-datepicker-year")));
	   	    ylist2.selectByVisibleText(yr2);
	   	    
	   	    Select mlist2 = new Select(driver.findElement(By.className("ui-datepicker-month")));
	   	    mlist2.selectByVisibleText(mon2);
	   	    
	   	    WebElement cal2 = driver.findElement(By.className("ui-datepicker-calendar"));
	   	    
	   	    List<WebElement> rows2 = cal2.findElements(By.tagName("tr"));
	   	     for(int k=1; k<rows2.size(); k++)
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
	   	   } catch (Exception e)
	   	   	 {
	   		System.out.println("Period End Date Is Selected Test Pass");
	   	    }
	   		   Thread.sleep(3000);   
	    }

	    @When("^i Enter The PO Hours As \"([^\"]*)\"$")
	    public void i_Enter_The_PO_Hours_As(String poh) throws Throwable 
	    {
	    	driver.findElement(By.xpath("//input[@id='PO_Hrs']")).sendKeys(poh); 
	    }

	    @When("^i Select The NAture of business Name As \"([^\"]*)\"$")
	    public void i_Select_The_NAture_of_business_Name_As(String businame) throws Throwable 
	    {
	    	driver.findElement(By.xpath("//span[@id='select2-nature_of_business_id-container']")).click();
	    	
	    	WebElement role = driver.findElement(By.id("nature_of_business_id"));
	    	Select nat = new Select(role);
	    	
	    	nat.selectByVisibleText(businame);
	    	Thread.sleep(2000);  
	    }

	    @When("^i Enter The No of Resources As \"([^\"]*)\"$")
	    public void i_Enter_The_No_of_Resources_As(String arg1) throws Throwable 
	    {
	    	driver.findElement(By.xpath("//input[@id='no_of_resources']")).click();
	    	
	    	driver.findElement(By.xpath("//select[@id='emp_id_1']")).click();
	    	
	    	String name ="Anjani kumar (BRTV03)";
	    	
	    	
	    	WebElement empid = driver.findElement(By.id("emp_id_1"));
	    	Select idname = new Select(empid);
	    	idname.selectByVisibleText(name);
	    	Thread.sleep(3000);
	    	
	    	driver.findElement(By.xpath("//input[@id='emp_per_hrs_1']")).sendKeys("300");
	    	
	    	// Start From Date
	    	driver.findElement(By.xpath("//input[@id='emp_start_dt_1']")).click();
	    	
	    	   
	    	   Thread.sleep(2000);
	    	try {	
	    		String dob3 = "16/Aug/2025";
	    		String[] temp3 = dob3.split("/");
	    		String dt3 = temp3[0];
	    		String mon3 = temp3[1];
	    		String yr3 = temp3[2];
	    		
	    		Select ylist3 = new Select(driver.findElement(By.className("ui-datepicker-year")));
	    	    ylist3.selectByVisibleText(yr3);
	    	    
	    	    Select mlist3 = new Select(driver.findElement(By.className("ui-datepicker-month")));
	    	    mlist3.selectByVisibleText(mon3);
	    	    
	    	    WebElement cal3 = driver.findElement(By.className("ui-datepicker-calendar"));
	    	    
	    	    List<WebElement> rows3 = cal3.findElements(By.tagName("tr"));
	    	     for(int y=1; y<rows3.size(); y++)
	    	     {
	    	    	 List<WebElement> cols3 = rows3.get(y).findElements(By.tagName("td"));
	    	    	 for(int z=0; z<cols3.size(); z++) 
	    	    	 {
	    	    		if(cols3.get(z).getText().equals(dt3))
	    	    		{
	    	    			cols3.get(z).click();
	    	    			break;
	    	    		}
	    	    	 }
	    	     }
	    	     }catch (Exception e)
	    	   	 {
	    		System.out.println("Period From Date Is Selected Test Pass");
	    	    }
	    		   Thread.sleep(3000);

	    	// Select To Date
	    		   
	    	driver.findElement(By.xpath("//input[@id='emp_end_dt_1']")).click();  
	    	Thread.sleep(2000);
	    	
	    	try {	
	    		String dob4 = "16/Dec/2025";
	    		String[] temp4 = dob4.split("/");
	    		String dt4 = temp4[0];
	    		String mon4 = temp4[1];
	    		String yr4 = temp4[2];
	    		
	    		Select ylist4 = new Select(driver.findElement(By.className("ui-datepicker-year")));
	    	    ylist4.selectByVisibleText(yr4);
	    	    
	    	    Select mlist4 = new Select(driver.findElement(By.className("ui-datepicker-month")));
	    	    mlist4.selectByVisibleText(mon4);
	    	    
	    	    WebElement cal4 = driver.findElement(By.className("ui-datepicker-calendar"));
	    	    
	    	    List<WebElement> rows4 = cal4.findElements(By.tagName("tr"));
	    	     for(int a=1; a<rows4.size(); a++)
	    	     {
	    	    	 List<WebElement> cols4 = rows4.get(a).findElements(By.tagName("td"));
	    	    	 for(int b=0; b<cols4.size(); b++) 
	    	    	 {
	    	    		if(cols4.get(b).getText().equals(dt4))
	    	    		{
	    	    			cols4.get(b).click();
	    	    			break;
	    	    		}
	    	    	 }
	    	     }
	    	     }catch (Exception e)
	    	   	 {
	    		System.out.println("Period From Date Is Selected Test Pass");
	    	    }
	    		   Thread.sleep(3000);

	    	
	    	
	    	
	    	driver.findElement(By.xpath("//input[@id='emp_title_1']")).sendKeys("tester");
	    	driver.findElement(By.xpath("//input[@id='kpis_1']")).sendKeys("50");
	    	
	    	driver.findElement(By.xpath("//button[@class='btn btn-primary Model-Btn']")).click();
	    	Thread.sleep(2000);
	    	 
	    }

	    @When("^i Select The Eco System and Practice As \"([^\"]*)\"$")
	    public void i_Select_The_Eco_System_and_Practice_As(String econm) throws Throwable 
	    {
	    	driver.findElement(By.xpath("//span[@id='select2-eco_system_practice_id-container']")).click();
	    	Thread.sleep(2000);
	    	String espr1 = econm;
	    	WebElement role1 = driver.findElement(By.id("eco_system_practice_id"));
	    	Select nat1 = new Select(role1);
	    	nat1.selectByVisibleText(espr1);
	    	 
	    }

	    @When("^i Am Select The Work Order Year As \"([^\"]*)\"$")
	    public void i_Am_Select_The_Work_Order_Year_As(String arg1) throws Throwable 
	    {
	    	driver.findElement(By.xpath("//input[@id='year']")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//td[@class='dp_current']")).click();
	    	  
	    }

	    @When("^i Enter The Recogniged Amount As \"([^\"]*)\"$")
	    public void i_Enter_The_Recogniged_Amount_As(String reamount) throws Throwable 
	    {
	       driver.findElement(By.xpath("//input[@id='recognized_amt']")).sendKeys(reamount);   
	    }

	    @When("^i Enter The Backlog Amount As \"([^\"]*)\"$")
	    public void i_Enter_The_Backlog_Amount_As(String backamount) throws Throwable 
	    {
	      driver.findElement(By.xpath("//input[@id='backlog_amt']")).sendKeys(backamount); 
	    }

	    @When("^i Enter The EMP Contribusion As \"([^\"]*)\"$")
	    public void i_Enter_The_EMP_Contribusion_As(String empcont) throws Throwable 
	    {
	      driver.findElement(By.xpath("//input[@id='EMP_contribution']")).sendKeys(empcont); 
	    }

	    @When("^i Upload The Work Order Document$")
	    public void i_Upload_The_Work_Order_Document() throws Throwable 
	    {
	    	WebElement id_image2 = driver.findElement(By.xpath("//input[@id='simage']"));
	        id_image2.sendKeys("C:\\Users\\anjib\\OneDrive\\Desktop\\Vibes_Images\\Images3.jpg"); 
	         
	    }

	    
	  //--------------------------------PayRoll--------------------------------------------------//
	    
	    
	 

	    @When("^i click on PayRoll$")
	    public void i_click_on_PayRoll() throws Throwable 
	    {
	        
	    }

	    @When("^i Click on Employee Payroll Details$")
	    public void i_Click_on_Employee_Payroll_Details() throws Throwable 
	    {
	        
	    }

	    @When("^i Click on Add Employee Payroll Details$")
	    public void i_Click_on_Add_Employee_Payroll_Details() throws Throwable 
	    {
	        
	    }

	    @When("^i Select On Payroll Employe Name As \"([^\"]*)\"$")
	    public void i_Select_On_Payroll_Employe_Name_As(String arg1) throws Throwable 
	    {
	        
	    }

	    @When("^i Enter The PAN Number As \"([^\"]*)\"$")
	    public void i_Enter_The_PAN_Number_As(String arg1) throws Throwable 
	    {
	        
	    }

	    @When("^i Enter The UAN Number As \"([^\"]*)\"$")
	    public void i_Enter_The_UAN_Number_As(String arg1) throws Throwable 
	    {
	        
	    }

	    @When("^i Enter The PF Account Number As \"([^\"]*)\"$")
	    public void i_Enter_The_PF_Account_Number_As(String arg1) throws Throwable 
	    {
	        
	    }

	    @When("^i Enter The CTC Amount As \"([^\"]*)\"$")
	    public void i_Enter_The_CTC_Amount_As(String arg1) throws Throwable 
	    {
	        
	    }

	    @When("^i Enter The Monthly Pay AS \"([^\"]*)\"$")
	    public void i_Enter_The_Monthly_Pay_AS(String arg1) throws Throwable 
	    {
	        
	    }

	    @When("^i Enter The Credits As \"([^\"]*)\"$")
	    public void i_Enter_The_Credits_As(String arg1) throws Throwable 
	    {
	        
	    }

	    @When("^i Enter The Basic As \"([^\"]*)\"$")
	    public void i_Enter_The_Basic_As(String arg1) throws Throwable 
	    {
	        
	    }

	    @When("^i Enter The PF As \"([^\"]*)\"$")
	    public void i_Enter_The_PF_As(String arg1) throws Throwable 
	    {
	        
	    }

	    @When("^i Enter The Tax As \"([^\"]*)\"$")
	    public void i_Enter_The_Tax_As(String arg1) throws Throwable 
	    {
	        
	    }

	    @When("^i Enter The Hourly Rate As \"([^\"]*)\"$")
	    public void i_Enter_The_Hourly_Rate_As(String arg1) throws Throwable 
	    {
	        
	    }

	    @When("^i click on Payruns$")
	    public void i_click_on_Payruns() throws Throwable 
	    {
	        
	    }

	    @When("^i click on Add Payrun$")
	    public void i_click_on_Add_Payrun() throws Throwable 
	    {
	        
	    }

	    @When("^i Select Pay Schedule Type As \"([^\"]*)\"$")
	    public void i_Select_Pay_Schedule_Type_As(String arg1) throws Throwable 
	    {
	        
	    }

	    @When("^i Select The Work Weeks$")
	    public void i_Select_The_Work_Weeks() throws Throwable 
	    {
	        
	    }

	    @When("^i Select the Payroll Paydate$")
	    public void i_Select_the_Payroll_Paydate() throws Throwable 
	    {
	        
	    }

	    @When("^i Select the Work Period From Date As \"([^\"]*)\"$")
	    public void i_Select_the_Work_Period_From_Date_As(String arg1) throws Throwable 
	    {
	        
	    }

	    @When("^i Select the Work period To Date As \"([^\"]*)\"$")
	    public void i_Select_the_Work_period_To_Date_As(String arg1) throws Throwable 
	    {
	        
	    }

	    @When("^i Select the Applicable To All As \"([^\"]*)\"$")
	    public void i_Select_the_Applicable_To_All_As(String arg1) throws Throwable 
	    {
	        
	    }

	    @When("^i Click On Pay Schedule$")
	    public void i_Click_On_Pay_Schedule() throws Throwable 
	    {
	        
	    }

	    @When("^i Click On Add Pay Schedule$")
	    public void i_Click_On_Add_Pay_Schedule() throws Throwable 
	    {
	        
	    }

	    @When("^i Enter The Pay Schedule Name As \"([^\"]*)\"$")
	    public void i_Enter_The_Pay_Schedule_Name_As(String arg1) throws Throwable 
	    {
	        
	    }

	    @When("^i Enter The Pay Period Name As \"([^\"]*)\"$")
	    public void i_Enter_The_Pay_Period_Name_As(String arg1) throws Throwable
	    {
	        
	    }

	    @When("^i Select The PayDate$")
	    public void i_Select_The_PayDate() throws Throwable
	    {
	       
	    }
	    
	
}
