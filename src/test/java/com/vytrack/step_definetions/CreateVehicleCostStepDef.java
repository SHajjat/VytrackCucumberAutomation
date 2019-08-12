package com.vytrack.step_definetions;

import com.github.javafaker.Faker;
import com.vytrack.utilities.*;
import cucumber.api.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Random;
import static org.junit.Assert.*;

public class CreateVehicleCostStepDef {
	WebDriver driver = Driver.get();
	Pages pages = new Pages();
	Random random = new Random();
	String typeSelected; String TotalPriceSelected; String dateSelected; String costDescriptionSelected;
	
	
	WebDriverWait wait = new WebDriverWait(driver,5);
	@Given("User on the Vytrack login page")
	public void user_on_the_Vytrack_login_page() {
		assertEquals(ConfigurationReader.get("url"),driver.getCurrentUrl());
		assertEquals("Login",driver.getTitle());
	}
	
	@When("Enter {string} user name and password")
	public void enter_user_name_and_password(String user) {
		String username = ConfigurationReader.get("salesmanager_username");
		String password = ConfigurationReader.get("salesmanager_password");
		pages.loginPage().login(username,password);
		wait.until(ExpectedConditions.titleContains("Dashboard"));
		assertEquals("Dashboard",driver.getTitle());
		assertEquals("http://qa3.vytrack.com/",driver.getCurrentUrl());
		
	}
	
	
	@When("Navigate to {string} then {string}")
	public void navigate_to_then(String tab, String module) {
		pages.basePage().navigateToModule(tab,module);
		wait.until(ExpectedConditions.visibilityOf(pages.basePage().pageSubTitle));
		assertEquals("http://qa3.vytrack.com/entity/Extend_Entity_VehicleCosts",driver.getCurrentUrl());
		
		
	
	}
	
	@When("User should click on {string} Link")
	public void user_should_click_on_Link(String createButton) {
		pages.basePage().waitUntilLoaderScreenDisappear();
		pages.basePage().createButton(createButton).click();
		
	}
	
	@Then("User should be able to enter valid Vehicle information and Save")
	public void user_should_be_able_to_enter_valid_Vehicle_information_and_Save() {
		pages.basePage().waitUntilLoaderScreenDisappear();
		pages.vehiclesCostPage().typeButton.click();
		pages.vehiclesCostPage().typeOptions.get(random.nextInt(9)).click();
		typeSelected =pages.vehiclesCostPage().typeButton.getText();
		pages.vehiclesCostPage().totalPrice.sendKeys(""+random.nextInt(30000));
		TotalPriceSelected =pages.vehiclesCostPage().totalPrice.getText();
		pages.vehiclesCostPage().DateOption.click();
		pages.vehiclesCostPage().DateOption.sendKeys(BrowserUtils.setDate());
		pages.basePage().waitUntilLoaderScreenDisappear();
		dateSelected = pages.vehiclesCostPage().DateOption.getAttribute("value");
		pages.vehiclesCostPage().costDescription.sendKeys(new Faker().chuckNorris().fact());
		costDescriptionSelected = pages.vehiclesCostPage().costDescription.getAttribute("value");
		pages.vehiclesCostPage().saveAndclose.submit();
		BrowserUtils.waitPlease(3);
	}
	
	@Then("User should be able to see information on Vheicle Costs")
	public void user_should_be_able_to_see_information_on_Vheicle_Costs() {
	pages.basePage().navigateToModule("Fleet","Vehicle Costs");
	
	}
	
	
	
}
