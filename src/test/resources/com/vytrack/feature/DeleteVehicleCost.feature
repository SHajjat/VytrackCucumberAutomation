@training
Feature: checkboxes
  Agile story:
  when I go to CyberTek training page ,
  and go to Checkboxes page,
  By default checkbox 2 should be check
  and I should be able to check and uncheck boxes.

  @checkbox
  Scenario: Un-checking box 2 and checking box 1
    Given User navigates to CybetTek School practice Website
    When User should click on "Checkboxes"
    Then User should see checkbox 2 checked and be able to uncheck it
    Then User should be able to check checkbox 1







