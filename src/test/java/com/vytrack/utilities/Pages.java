package com.vytrack.utilities;

import com.vytrack.pages.*;
import org.openqa.selenium.support.PageFactory;



public class Pages {
	private LoginPage loginPage;
	private BasePage basePage;
	private VehiclesCostPage  vehiclesCostPage;
	
	
	
	public Pages(){
		PageFactory.initElements(Driver.get(),this);
	}
	
	public LoginPage loginPage() {
		if (loginPage == null) {
			loginPage = new LoginPage();
		}
		return loginPage;
	}
	public BasePage basePage() {
		if (basePage == null) {
			basePage = new LoginPage();
		}
		return basePage;
	}
	public VehiclesCostPage vehiclesCostPage() {
		if (vehiclesCostPage == null) {
			vehiclesCostPage = new VehiclesCostPage();
		}
		return vehiclesCostPage;
	}
	
	
}
