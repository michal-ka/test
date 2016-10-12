package com.webtest.one;

import java.io.File;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;


public class ScrapTest {
	public WebDriver driver;
	//String url = "http://flipkart.com";
	
	SeleniumPage page = new SeleniumPage();
	
	  @BeforeTest
	  public void beforeTest() {
		  driver = new FirefoxDriver();	
	  }
	
  @Test (enabled = true)
  public void f() {
	  driver.get(page.properties.getProperty("url"));
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
	  jse.executeScript("scroll(0, 1000)"); 
	  
//	  File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	  try  {
//		  FileUtils.copyFile(screenshot, new File("C:\\screenshot.jpg"));
//	  } catch (Exception e){
//		  //System.out.println(e.printStackTrace());
//	  }
  }


  @Test
  public void propertiesTest(){
	  System.out.println("Propertisy z pliku: " + page.properties.getProperty("url"));
	  System.out.println("A liczba proeprtisow to: "+ page.properties.size());
	  
  }


  @AfterTest
  public void afterTest() {
  }
}
