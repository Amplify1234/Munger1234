package com.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.homePage;

public class HomePageTest extends TestBase{
	static WebDriver driver;
	
	
	
	public HomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		
			
	}
	
	@Test
	public void seatBooking(){
		
		homePage home = new homePage();
		String from = prop.getProperty("Fromdestinaton");
		String TO = prop.getProperty("ToDestination");
		home.fromSelect(from);
		home.ToSelect(TO);
		home.BttonClk();
		home.chooseflightbutton();		
		home.CustomerDetail();
		home.CustomerIDvalidation();
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
	
	
	
	

}
