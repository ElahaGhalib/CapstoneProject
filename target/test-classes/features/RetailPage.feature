@RetailTest
Feature: Retail Page

 
  Background: 
    Given User is on Retail website
    And User click  on MyAccount
    When User click on Login
    And User enter username 'johnwitson1@gmail.com' and password 'E123456'
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on Register for an Affiliate Account link
    And User fill affiliate form with below information
      | company | website      | taxID  | paymentMethod | payeeName |
      | TEK     | tekschool.us | 123456 | Cheque        | TEK User  |
    
    And User click on Continue button
    Then User should see a success message

  
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on ‘Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName    | abaNumber | swiftCode | accountName | accountNumber |
      | Capital One |     23345 |      8965 | John        |   09887654323 |
    And User click on Continue button
    Then User should see a success message

  Scenario: Edit your account Information
    When User click on 'Edit your account information' link
    And User modify below information
      | firstname | lastName | email                | telephone  |
      | John      | witson   | johnwitson1@gmail.com | 7032346578 |
    And User click on Continue button
    Then User should see a message 'Success: Your account has been successfully updated.'
