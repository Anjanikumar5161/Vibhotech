
@tag
Feature: Employee Annual Performance
  I want to use this template To Check Employee Annual Performance

  @AddEmployee
  Scenario: Add Employee Annual Performance
    Given i Open Browser With url  "http://breative.vibhohcm.com"
    Then i Should See Login Page
    When i Enter The Valid Username as "breative"
    And i Enter The Valid Password as "Br@99$2023"
    And i Click LogIn
    Then i Should See Admin Module
    When i click on Employee
    And i Click On Employee Annual Performance
    And i Click On Add Employee Annual Performance
    And i Select An Employee name As "Anjani kumar (BRTV03)"
    And i Select On Appraisal Date As "" 
    And i Am Entering The Appraisal Rating As "5"
    And i Am Entering The Existing Role As "JavaDeveloper"
    And i Am Entering The New role "QA"
    And i Am Entering The Existing Salary "300000"
    And i Am Entering the New salary "500000"
    And i Am Entering The Hr Feedback Comments As "Good"
    And i Am Entering The Employee Feedback Comments As "Good"
    And i Am Entering The Relationship Manager Comments As "Good"
    And i Click on SAVE Option
    Then i Should See Text As Ok
    When i Click Logout
    Then i Should See Login Page
    When i Close Browser

 @UpdateEmployee
  Scenario: Update Employee Annual Performance
    Given i Open Browser With url  "http://breative.vibhohcm.com"
    Then i Should See Login Page
    When i Enter The Valid Username as "breative"
    And i Enter The Valid Password as "Br@99$2023"
    And i Click LogIn
    Then i Should See Admin Module
    When i click on Employee
    And i Click On Employee Annual Performance
    And i click on Search Option and i enter the Field As "Anjani"
    And i Click On Edit OptioN
    And i update The New Role As "TestEngineer"
    And i Click On UPDATE option
    Then i Should See Text As Ok
    When i Click Logout
    Then i Should See Login Page
    When i Close Browser

   
