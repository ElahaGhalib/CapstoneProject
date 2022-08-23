@Homepagetest
Feature: Home Page

Background:
Given User is on Retail website

@Test @smoke
Scenario: User verify currency values change
When User click on Currency 
And User Chose Euro from dropdown 
Then currency value should change to Euro

@Test
Scenario: User empty Shopping cart message displays 
When User click on cart option
Then 'Your shopping cart is empty!' message should display