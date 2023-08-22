
@tag
Feature: Admin Login
  I want to use this template To Check Admin Login

  @tag1
  Scenario: Check Admin Login With Valid Data
    Given i Open Browser With url  "http://breative.vibhohcm.com"
    Then i Should See Login Page
    When i Enter The Valid Username as "breative"
    And i Enter The Valid Password as "Br@99$2023"
    And i Click LogIn
    Then i Should See Admin Module
    When i Click Logout
    Then i Should See Login Page
    When i Close Browser
 
 
  @tag2   
    Scenario Outline: Check Admin Login With Invalid Data
    Given i Open Browser With url  "http://breative.vibhohcm.com"
    Then i Should See Login Page
    When i Enter The Valid Username as "<username>"
    And i Enter The Valid Password as "<password>"
    And i Click LogIn
    Then i Should see Error message
    When i Close Browser
    
    Examples:
    |username|password|
    |Breative|12345|
    |Anjani|root|
    |Breative|Anjani|
    |12345|root|