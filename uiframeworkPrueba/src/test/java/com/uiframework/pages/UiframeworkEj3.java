package com.uiframework.pages;

import org.openqa.selenium.By;
import com.uiframework.utilities.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class UiframeworkEj3 extends Base{
	public UiframeworkEj3(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//Estrategia de localizadores
		By frameworkLinkLocator=By.xpath("//android.view.View[@content-desc='Framework7 Material 1.4.0']");
		By contactListLinkLocator=By.xpath("//android.view.View[@content-desc='Contacts List ']");
		By alexanderLocator=By.xpath("//android.view.View[@content-desc='Alexander']");
		
		public void goToAlexander() {
			explicitWait_elementClickable(frameworkLinkLocator);
			click(frameworkLinkLocator);
			explicitWait_elementClickable(contactListLinkLocator);
			click(contactListLinkLocator);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public Boolean textIsdisplayed() {
			Boolean result=null;
			result=isDisplayed(alexanderLocator);
			return result;
		}
}
