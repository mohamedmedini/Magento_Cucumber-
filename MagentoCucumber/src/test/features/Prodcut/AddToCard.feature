@Add_To_Card
Feature: Add products to card
  I want to add products to my card
  
  Background: 
    Given i enter the url "https://magento.softwaretestingboard.com/" of the page
    When   i click to signin
    And  i enter my email "medinimed89@gmail.com"
    And   i enter my password "Testtest24"
    And   i click to signin button
    Then  i verify that my account "Welcome, Mohamed Medini!" its matched
    

  @ChooseProducts 
  Scenario: add two products to my card 
   Given i add the first product 
   When i add the second product 
   And i click to card button 
   Then i check that the two product are added successfully to my card "Jupiter All-Weather Trainer" and "Kratos Gym Pant"


