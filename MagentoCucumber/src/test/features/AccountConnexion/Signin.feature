@Magento_Authentification
Feature: Account Connexion
  as a user i wanna to connect to my account

  @Account_Connexion
  Scenario: connect to  nope commerce account
    Given i enter the url "https://magento.softwaretestingboard.com/" of the page
    When   i click to signin
    And  i enter my email "medinimed89@gmail.com"
    And   i enter my password "Testtest24"
    And   i click to signin button
    Then  i verify that my account "Welcome, Mohamed Medini!" its matched
    
 