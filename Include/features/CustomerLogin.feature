#Author: reynaldi.octavially@gmail.com
Feature: Customer Login

  @userLogin
  Scenario Outline: Successful login with valid credentials
    Given Customer is on the Voila login page
    When Customer enters valid email "<email>" and password "<password>"
    And Customer clicks the login button
    Then Customer should see the dashboard
    
    Examples: 
      | email 												| password 		|
      | reynaldi.octavially@gmail.com | @Aquila1998 |