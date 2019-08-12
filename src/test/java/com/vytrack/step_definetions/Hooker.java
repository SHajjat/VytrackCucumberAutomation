package com.vytrack.step_definetions;


import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Hooker {
	WebDriverWait wait ;
	
	@Before
public void setUp(){
	 wait = new WebDriverWait(Driver.get(),5);
	Driver.get().get(ConfigurationReader.get("url"));
	Driver.get().manage().window().fullscreen();
	Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}

@After
	public void tearDown(Scenario scenario){
	if( scenario.isFailed() ){
		final byte [] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot,"image/png");
	}
	Driver.closeDriver();
}

}
