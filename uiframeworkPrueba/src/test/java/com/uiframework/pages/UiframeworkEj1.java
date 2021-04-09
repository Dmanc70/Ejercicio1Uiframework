package com.uiframework.pages;

import org.openqa.selenium.By;


import com.uiframework.utilities.Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class UiframeworkEj1 extends Base{
	
	public UiframeworkEj1(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//Estrategia de localizadores
	By frameworkLinkLocator=By.xpath("//android.view.View[@content-desc='Framework7 Material 1.4.0']");
	By accordionLinkLocator=By.xpath("//android.view.View[@content-desc='Accordion ']");
	By integerSemperLinkLocator=By.xpath("//android.view.View[@content-desc='Integer semper']");
	
	public void goToIntegerSamper() throws InterruptedException {
		explicitWait_elementClickable(frameworkLinkLocator);
			click(frameworkLinkLocator);
			explicitWait_elementClickable(accordionLinkLocator);
			click(accordionLinkLocator);
			explicitWait_elementClickable(integerSemperLinkLocator);
			click(integerSemperLinkLocator);

	}
	
	public Boolean textIsdisplayed() {
		Boolean result=null;
		result=isDisplayed(integerSemperLinkLocator);
		return result;
	}
	
}
