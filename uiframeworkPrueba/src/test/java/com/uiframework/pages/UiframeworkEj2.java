package com.uiframework.pages;


import org.openqa.selenium.By;
import com.uiframework.utilities.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
public class UiframeworkEj2 extends Base{

	public UiframeworkEj2(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	//Estrategia de localizadores
	By frameworkLinkLocator=By.xpath("//android.view.View[@content-desc='Framework7 Material 1.4.0']");
	By colorThemeLinkLocator=By.xpath("//android.view.View[@content-desc='Color Themes ']");
	By blackThemeLinkLocator=By.xpath("//android.view.View[@index=3]");
	By blacklayoutLinkLocator=By.xpath("//android.view.View[@index=24]");
	public void themeChanger() throws InterruptedException {
		explicitWait_elementClickable(frameworkLinkLocator);
		click(frameworkLinkLocator);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//Scrolling down
	    TouchAction touch=new TouchAction(driver);
	    touch.longPress(PointOption.point(0, 1128))
	    	  .moveTo(PointOption.point(0, 10)).release().perform();
	    touch.longPress(PointOption.point(0, 1128))
	    	  .moveTo(PointOption.point(0, 5)).release().perform();
	    touch.longPress(PointOption.point(0, 1128))
  	  		  .moveTo(PointOption.point(0, 5)).release().perform();
		
		
		explicitWait_elementClickable(colorThemeLinkLocator);
		click(colorThemeLinkLocator);
		Thread.sleep(2000);
		explicitWait_elementClickable(blackThemeLinkLocator);
		click(blackThemeLinkLocator);
		touch.tap(PointOption.point(582,1082));

		Thread.sleep(5000);
		
	}
	
}
