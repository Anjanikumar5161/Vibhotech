
@tag
Feature: Add Employee
  I want to use this template To Check Add Employee

  @tag1
  Scenario: Check Add Employee
    Given i Open Browser With url  "http://breative.vibhohcm.com"
    Then i Should See Login Page
    When i Enter The Valid Username as "breative"
    And i Enter The Valid Password as "Br@99$2023"
    And i Click LogIn
    Then i Should See Admin Module
    When i click on Employee
    And i click on Employee Management
    And i click on Add Employee
    And i Enter the FirstName as "Pranathi"
    And i Enter the LastName as "P"
    And i Select the Gender
    And i Enter the Company Email ID as "pranathi310800@gmail.com"
    And i Enter the Personal Email ID as "anji.bygani@gmail.com"
    And i Enter the Mobile Number as "8639616575"
    And i Select the Date Of Birth as "16-May-1998"
    And i Enter the Permanent Address as "Hyderabad"
    And i Enter the Present Address as "Hyderabad"
    And i Enter the Local Contact Name as "Prudhvi"
    And i Enter the Local Contact Relationship as "Brother"
    And i Enter the Local Contact Mobile Number as "9494910143"
    And i Enter the Overseas Contact Name as "Naveen"
    And i Enter the Overseas Contact Relationship as "Brother"
    And i Enter the Overseas Contact Mobile Number as "9490290108"
    And i Enter the Next icon
    And i Select An Eployee Designation As "Tester"
    And i Select An Employee Typa As "Permanent Employee" 
    And i Select An Employee Date Of Joining "12-Jan-2019"
    And i Select An Employee Role "Super Admin"
    And i am Selecting The Reporting Manager ""
    And i am Selecting The HR Manager ""
    And i am selecting The Lead Manager ""
    And i am Selecting The Finance Manager ""
    And i am Selecting The Client ""
    And i am Selecting The Client Manager "Chanakya"
    And i Enter the Next icon
    And i Enter The Bank Name "SBI"
    And i Enter The Account Type As "Saving Account"
    And i Enter The Beneficiary Name As "AnjaniKumar"
    And i Enter The Account Number As "012345678998"
    And I Enter The IFSC Code As "SBIN000000"
    And i Enter the Next icon
    And i am Selecting The Identification Type As "Passport"  
    And i Enter The Identification Number As "92287374633487"
    And i Upload The Identification image
    And i Click On Finish Icon
    Then i Should See Text As Ok
    When i Click Logout
    Then i Should See Login Page
    When i Close Browser
    
   @tag2
   Scenario Outline: Check Update Employee
    Given i Open Browser With url  "http://breative.vibhohcm.com"
    Then i Should See Login Page
    When i Enter The Valid Username as "breative"
    And i Enter The Valid Password as "Br@99$2023"
    And i Click LogIn
    Then i Should See Admin Module
    When i click on Employee
    And i click on Employee Management
    And i click on Search Option and i enter the Field As "Anjani"
    And i Click On Edit OptioN
    And i Click on Company Details
    And i Change The Employee Designation As "Test Engineer"
    And i click On Compensation Details
    And i Click On Finish
    Then i Should See Text As Ok
    When i Click Logout
    Then i Should See Login Page
    When i Close Browser
     
 
