package com.vytrack.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Random;

public class BrowserUtils {
	public static WebElement waitForClickablility(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(Driver.get(), timeout);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	
	/**
	 * This method will recover in case of exception after unsuccessful the click,
	 * and will try to click on element again.
	 *
	 * @param by
	 * @param attempts
	 */
	public static void clickWithWait(By by, int attempts) {
		int counter = 0;
		//click on element as many as you specified in attempts parameter
		while (counter < attempts) {
			try {
				//selenium must look for element again
				clickWithJS(Driver.get().findElement(by));
				//if click is successful - then break
				break;
			} catch (WebDriverException e) {
				//if click failed
				//print exception
				
				//print attempt
			
				//wait for 1 second, and try to click again
				waitPlease(1);
			}
		}
	}
	public static void clickWithJS(WebElement element) {
		((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", element);
		((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", element);
	}
	
	public static void waitPlease(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void waitForPresenceOfElement(By by, long time) {
		new WebDriverWait(Driver.get(), time).until(ExpectedConditions.presenceOfElementLocated(by));
	}
	
	public static WebElement waitForVisibility(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(Driver.get(), timeout);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static void scrollToElement(WebElement element) {
		((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public static void waitForStaleElement(WebElement element) {
		int y = 0;
		while (y <= 15) {
			try {
				element.isDisplayed();
				break;
			} catch (StaleElementReferenceException st) {
				y++;
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			break;
		}
	}
	public static void clickWithTimeOut(WebElement element, int timeout) {
		for (int i = 0; i < timeout; i++) {
			try {
				element.click();
				break;
			} catch (WebDriverException e) {
				waitFor(1);
			}
		}
	}
	public static void waitFor(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public static String setDate(){
		Random random = new Random();
		String now = LocalDate.now() +"";
		String [] dateString = now.split("-");
		int year =Integer.parseInt( dateString[0]);
		int month =Integer.parseInt( dateString[1]);
		int day =Integer.parseInt( dateString[2]);
		LocalDate date = LocalDate.of(random.nextInt(100)+year,random.nextInt(12-month)+1+month,random.nextInt(Math.abs(28-day))+1);
		String senddate =date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
		return  senddate;
	}
}
