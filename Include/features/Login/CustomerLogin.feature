# Author: reynaldi.octavially@gmail.com

Feature: Customer Login

@customerLogin
Scenario Outline: Successful login with valid credentials
  Given Customer is on the landing page
  When Customer clicks the login button to navigate to the login page
  And Customer enters valid email "<email>" and password "<password>"
  And Customer clicks the login button
  Then Customer should see the home page

    Examples:
      | email                          | password    |
      | reynaldi.octavially@gmail.com  | @Aquila1998 |