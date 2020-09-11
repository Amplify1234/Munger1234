package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;
import com.qa.util.TestUtil;
import com.relevantcodes.extentreports.model.Log;

public class homePage extends TestBase{
	
	//Page Factory 
	@FindBy(xpath = "//a[contains(text(),'home')]")
	WebElement HomePage;

	@FindBy(xpath = "//select[@name='fromPort']")
	WebElement From;

	@FindBy(xpath = "//select[@name='toPort']")
	WebElement Toselect;

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	WebElement FindflightBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")
	WebElement choseflight;

	@FindBy(xpath = "//input[@id='inputName']")
	WebElement Name;

	@FindBy(xpath = "//input[@id='address']")

	WebElement Address;

	@FindBy(xpath = "//input[@id='city']")
	WebElement city;

	@FindBy(xpath = "//input[@id='state']")
	WebElement state;

	@FindBy(xpath = "//input[@id='zipCode']")
	WebElement zipcord;

	@FindBy(xpath = "//select[@id='cardType']")
	WebElement cardtype;

	@FindBy(xpath = "//input[@id='creditCardNumber']")
	WebElement creditnumber;

	@FindBy(xpath = " //input[@id='creditCardMonth']")
	WebElement month;

	@FindBy(xpath = "//input[@id='creditCardYear']")
	WebElement year;

	@FindBy(xpath = "//input[@id='nameOnCard']")
	WebElement nameoncard;

	@FindBy(xpath = "//div[2]/form[1]/div[11]/div[1]/input[1]")
	WebElement purchaseFlight;

	@FindBy(xpath = "//div[2]/div[1]/pre[1]")
	WebElement Custerid;

	@FindBy(xpath = "//div[2]/div[1]/pre[1]")
	WebElement Customerid;
	
	

	public homePage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public void validatehomePageTitle(){
		
		String home = HomePage.getText();
		if (home.contentEquals("home")){
			
		System.out.println("Testcases pssed" );}
		else{
		System.out.println("Testcases pssed" );	
		}
		
	}
		public boolean fromSelect(String from){
			
			Select fromselect = new Select(From);
			fromselect.selectByValue(from);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			return true;
			
		
		
	     }
		

          public boolean ToSelect(String TO){
	
	        Select TOselect= new Select(Toselect);
	        TOselect.selectByValue(TO);
	        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	         return true;

             }
          
          public  boolean chooseflightbutton(){
        	  driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        	  choseflight.click();
  	         return true;
  	


               }
          
          public boolean BttonClk(){
      		
        	  FindflightBtn.click();
  	         return true;
  	


               }

	
        
  	
  	
              public  boolean CustomerDetail(){	
		String name = prop.getProperty("Name_value");
		String address = prop.getProperty("Address_value");
		String City = prop.getProperty("city_value");
		String State = prop.getProperty("state_value");
		String Zip = prop.getProperty("zipcord_value");
		String Cardtype = prop.getProperty("cardtype_value");
		String cardNumber = prop.getProperty("creditnumber_value");
		String Month = prop.getProperty("month_value");
		String Year = prop.getProperty("year_value");
		String nameOncard = prop.getProperty("nameoncard_value");
		Name.sendKeys(name);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		Address.sendKeys(address);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		city.sendKeys(City);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		state.sendKeys(State);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		zipcord.sendKeys(Zip);
		cardtype.sendKeys(Cardtype);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		creditnumber.sendKeys(cardNumber);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		month.sendKeys(Month);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		year.sendKeys(Year);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		nameoncard.sendKeys(nameOncard);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		purchaseFlight.click();
  			return true;			
  			
  	     }
              
              public void CustomerIDvalidation(){            	
              	String Custid = Custerid.getText();
              	String Customerid_text = Customerid.getText();
              	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
              	if (Customerid_text.contentEquals(Custid)){
              		System.out.println("customer Id verified");
              	}else{
              		System.out.println("customer Id Not verified");
              	}
  			
  				
  			
	
	
	
              }}
