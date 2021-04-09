package com.uiframework.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.uiframework.pages.UiframeworkEj2;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class UiframeworkTest2 {
	public AppiumDriver<MobileElement> driver;
	UiframeworkEj2 ui;
  
  @BeforeTest
  public void beforeTest() {
	  ui=new UiframeworkEj2(driver);
	  driver=ui.setup();
  }

  @Test
  public void checkingColor() throws InterruptedException {
	  ui.themeChanger();
	  
  }
  
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
