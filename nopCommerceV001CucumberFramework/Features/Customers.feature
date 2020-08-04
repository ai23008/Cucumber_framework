Feature: Customer

 Scenario: Add a Customer
  Given User Launch chrome browser
  Then  User open Url "https://admin-demo.nopcommerce.com/login"
  And User enters Email as "admin@yourstore.com" and as password as "admin"
  And click on Login 
  Then User can view dashboard
  When User click on customer Menu
  And click on customer Menu Item
  And click on Add new button
  Then User can view Add new customer page
  When User enter customer info
  And click on save button
  Then User can view confirmation message "The new customer has been added successfully."
  And close browser