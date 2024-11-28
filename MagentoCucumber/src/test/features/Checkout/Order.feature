@Magento_payment
Feature: payment of my order 
  I want to pay my order
  
Background: 
    Given i enter the url "https://magento.softwaretestingboard.com/" of the page
    When   i click to signin
    And  i enter my email "medinimed89@gmail.com"
    And   i enter my password "Testtest24"
    And   i click to signin button
    Then  i verify that my account "Welcome, Mohamed Medini!" its matched
    
    Given i add the first product 
    When i add the second product 
    And i click to card button 
    Then i check that the two product are added successfully to my card "Jupiter All-Weather Trainer" and "Kratos Gym Pant"


  @Order_Checkout
  Scenario: payment
    Given i click checkout button 
    And i click new adress button
    When i enter my company "proservice"
    And i select my country "Tunisia" and my city "Tunis"
    And i enter my Zip Adress "1200" my street Adress "Milano Street" and my Phone number "987654321"
    And i click to Ship Here and click to next button
    Then i click to palceorder button 
    And i verify my order with the message "Thank you for your purchase!"

 
