package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VehiclesCostPage extends BasePage {
	
	@FindBy (xpath = "//span[@class='select2-chosen']")
	public WebElement typeButton;
	
	@FindBy (xpath = "//li[contains(@class,'select2-results')]")
	public List <WebElement> typeOptions;
	
	
	@FindBy(name = "custom_entity_type[TotalPrice]")
	public WebElement totalPrice;
	
	@FindBy (xpath = "//input[@placeholder='Choose a date']")
	public WebElement DateOption;
	
	@FindBy (xpath = "//textarea[@name='custom_entity_type[CostDescriptions]']")
	public WebElement costDescription;
	
	@FindBy (xpath = "//button[@class='btn btn-success action-button']")
	public WebElement saveAndclose;
}

