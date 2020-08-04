Feature: Login

Scenario: Successful Login with Valid Credentials

       Given User Launch Chrome browser
       When User Opens URL "https://admin-demo.nopcommerce.com/login"
       And User enters Email as "admin@yourstore.com" and Password as "admin"
       And Click on Login 
       Then Page Title Should be "Dashboard / nopCommerce administration"
       When User Click on Log out Link
       Then Page Title Should be "Your store. Login"
       And Close browser
       
Scenario Outline: Login Data driven   

        Given User Launch Chrome browser
       When User Opens URL "https://admin-demo.nopcommerce.com/login"
       And User enters Email as "<email>" and Password as "<pass>"
       And Click on Login 
       Then Page Title Should be "Dashboard / nopCommerce administration"
       When User Click on Log out Link
       Then Page Title Should be "Your store. Login"
       And Close browser    
       
       Examples:
       | email | pass |
       | abcd@gmail.com | admin |
       | admin@yourstore.com | admin |