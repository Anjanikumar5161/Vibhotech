
@tag
Feature: Add Employee Checks
  I want to use this template To Check Add Employee Checks

  @tag1
  Scenario: Check Add Employee Checks
    Given i Open Browser With url  "http://breative.vibhohcm.com"
    Then i Should See Login Page
    When i Enter The Valid Username as "breative"
    And i Enter The Valid Password as "Br@99$2023"
    And i Click LogIn
    Then i Should See Admin Module
    When i click on Employee
    And i click on Employee Checks
    And i click on Add Employee Checks
    And i Select An Employee
    And i Click on Documents Type ITC
    And i upload The ITC Document
    And i click on Document Type Criminal
    And i upload The Criminal Document
    And i click on Document Type Educational
    And i upload The Educational Document
    And i click on The References Document
    And i upload the references Document
    And i Am Saving The Documents
    Then i Should See Text As Ok
    When i Click Logout
    Then i Should See Login Page
    When i Close Browser
 
    
  