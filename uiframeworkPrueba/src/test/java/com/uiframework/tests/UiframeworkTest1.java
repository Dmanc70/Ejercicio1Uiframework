package com.uiframework.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import com.uiframework.pages.UiframeworkEj1;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class UiframeworkTest1 {
	public AppiumDriver<MobileElement> driver;
	UiframeworkEj1 ui;

  @BeforeTest
  public void beforeTest() {
	  ui=new UiframeworkEj1(driver);
	  driver=ui.setup();
  }
  
	@Test
	public void checkIntegerSemper() throws InterruptedException {
		ui.goToIntegerSamper();
		Assert.assertTrue(ui.textIsdisplayed());
	}
  
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
