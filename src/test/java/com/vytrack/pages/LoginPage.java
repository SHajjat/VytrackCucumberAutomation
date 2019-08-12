package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import com.vytrack.utilities.Pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class LoginPage extends BasePage {
//	public LoginPage(){
//		PageFactory.initElements(Driver.get(),this);
//	}
	
	
	@FindBy(id = "prependedInput")
	public WebElement userNameElement;
	
	@FindBy(name = "_password")
	public WebElement passwordElement;
	
	@FindBy(id="_submit")
	public WebElement loginButtonElement;
	
	public void login(String username, String password){
		userNameElement.sendKeys(username);
		passwordElement.sendKeys(password+ Keys.ENTER);
		//loginButtonElement.click();
	}
}
