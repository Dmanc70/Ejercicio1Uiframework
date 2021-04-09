package com.uiframework.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import com.uiframework.pages.UiframeworkEj3;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class UiframeworkTest3 {
	public AppiumDriver<MobileElement> driver;
	UiframeworkEj3 ui;
	
  @BeforeTest
  public void beforeTest() {
	  ui=new UiframeworkEj3(driver);
	  driver=ui.setup();
  }

  @Test
  public void checkName() {
	  ui.goToAlexander();
	  Assert.assertTrue(ui.textIsdisplayed());
  }
  
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
