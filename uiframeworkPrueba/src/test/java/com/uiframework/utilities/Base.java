package com.uiframework.utilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	protected AppiumDriver<MobileElement> driver;
	
	public Base(AppiumDriver<MobileElement> driver) {
		this.driver=driver;
	}
	
	
	public AppiumDriver<MobileElement>  setup(){
		String deviceName="SM-J600G";
		String udid="52002ef958e165e5";
		String appPack="org.eniblo.uicatalog";
		String appActivity="org.eniblo.uicatalog.MainActivity";
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		dc.setCapability(MobileCapabilityType.UDID, udid);
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		dc.setCapability("appPackage",appPack );
		dc.setCapability("appActivity",appActivity);
		
		
		URL url=null;
		try {
			url = new URL("http://127.0.0.1:4723/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver= new AppiumDriver<MobileElement>(url,dc);
		return driver;
	}
	
	/**
	 * This method do a explicit wait that holds until the browser's page load the title in the parameter, 
	 * the wait takes a maximum of ten seconds until it meets the expected conditions.
	 * @author Marlon Navarrete
	 * @param title - It's the string of the title of the browser's page
	 * @return true when the title matches, false otherwise
	 */
	public Boolean explicitWait_TitleContains(String title) {
		WebDriverWait ewait=new WebDriverWait(driver,10);
		return ewait.until(ExpectedConditions.titleContains(title));
	}
	
	/**
	 * This method do a explicit wait that holds until the web element the locator points to is clickable , 
	 * the condition is called with a certain frequency until the timeout of the wait is elapsed.
	 * @author Marlon Navarrete
	 * @param locator - it's  used to find the element of the web page you want to interact with.
	 * @return the WebElement once it is located and clickable (visible and enabled)
	 */
	public WebElement explicitWait_elementClickable(By locator) {
		WebDriverWait ewait=new WebDriverWait(driver,30);
		return ewait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	/**
	 * This method calls the findElement command that can be used with various locator strategies 
	 * such as ID, Name, Class Name, XPATH etc. 
	 * @author Marlon Navarrete
	 * @param locator - By object, It's used to find the  element of the web page you want to interact with
	 * @return the first matching element found in the web page
	 */
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}
	
	

	
	
	/**
	 * This method calls the getText command, that get the visible text of a element located in web page
	 * @author Marlon Navarrete
	 * @param locator - By object, It's used to find the  element of the web page you want to interact with
	 * @return the visible text of the element
	 */
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}

	/**
	 *  This method calls the getText command, that get the visible text of a element located in web page
	 * @author Marlon Navarrete
	 * @param element: WebElement where it's extracted the text
	 * @return The text of the WebElement
	 */
	public String getText(WebElement element) {
		return element.getText();
	}
	/**
	 * This method calls the sendKeys command, which fill a text field with a string written by the user
	 * @author Marlon Navarrete
	 * @param locator - By object, It's used to find the  element of the web page you want to interact with
	 * @param inputText - The string that will fill the text field
	 */
	public void sendKeys(By locator, String inputText) {
		driver.findElement(locator).sendKeys(inputText);
	}
	
	/**
	 * This method calls the click command, click over a element of a web page that is clickable, it accepts a locator as parameter.
	 * @author Marlon Navarrete
	 * @param locator - By object, It's used to find the  element of the web page you want to interact with
	 */
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	/**
	 * This method calls the click command, click over a element of a web page that is clickable. it accepts a WebElement as parameter
	 * @author Marlon Navarrete
	 * @param element: WebElement that is going to be clicked.
	 */
	public void click(WebElement element) {
		element.click();
	}
	
	/**
	 * This method calls isDisplayed command, that verifies if the element of define in the parameter is displayed in
	 * the web page.
	 * @author Marlon Navarrete
	 * @param locator - By object, It's used to find the  element of the web page you want to interact with
	 * @return True or False
	 */
	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/**
	 * This method calls the get command that loads a new web page in the current browser window
	 * @author Marlon Navarrete
	 * @param url - It's the string of the web page.
	 */
	public void getUrl(String url) {
		driver.get(url);
	}
	
	public void closeDriver() {
		driver.close();
	}
	
	

}