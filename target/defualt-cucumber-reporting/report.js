$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com/vytrack/feature/CreateVehicleCost.feature");
formatter.feature({
  "name": "As Sales Manager I should be able to Save Vehicle Cost information",
  "description": " Agile Story:\n As Sales Manager I should be able to create and save Vehicle Cost",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@VYC5-32"
    }
  ]
});
formatter.scenario({
  "name": "Sales manager Creating Vehicle Cost",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@VYC5-32"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User on the Vytrack login page",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateVehicleCostStepDef.user_on_the_Vytrack_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"sales manager\" user name and password",
  "keyword": "When "
});
formatter.match({
  "location": "CreateVehicleCostStepDef.enter_user_name_and_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to \"Fleet\" then \"Vehicle Costs\"",
  "keyword": "And "
});
formatter.match({
  "location": "CreateVehicleCostStepDef.navigate_to_then(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on \"Create Vehicle Costs\" Link",
  "keyword": "And "
});
formatter.match({
  "location": "CreateVehicleCostStepDef.user_should_click_on_Link(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to enter valid Vehicle information and Save",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateVehicleCostStepDef.user_should_be_able_to_enter_valid_Vehicle_information_and_Save()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to see information on Vheicle Costs",
  "keyword": "And "
});
formatter.match({
  "location": "CreateVehicleCostStepDef.user_should_be_able_to_see_information_on_Vheicle_Costs()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});