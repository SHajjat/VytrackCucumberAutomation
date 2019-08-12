@VYC5-32
Feature: As Sales Manager I should be able to Save Vehicle Cost information
 Agile Story:
 As Sales Manager I should be able to create and save Vehicle Cost

  Scenario: Sales manager Creating Vehicle Cost
    Given User on the Vytrack login page
    When Enter "sales manager" user name and password
    And  Navigate to "Fleet" then "Vehicle Costs"
    And  User should click on "Create Vehicle Costs" Link
    Then User should be able to enter valid Vehicle information and Save
    And User should be able to see information on Vheicle Costs
