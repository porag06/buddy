package pom.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Payment extends PageClass{
	
	private WebElement Name;
	private WebElement CardNumber;
	private WebElement Month;
	private WebElement Year;
	private WebElement Sec;
	private WebElement PlaceOrder;
	private WebElement VerifyErrorMassage;

	public Payment(WebDriver driver) {
		super(driver);
	}
	
	public WebElement Name(){
		Name = driver.findElement(By.id("ccsave_cc_owner"));
		return Name;
	}
	
	public WebElement CardNumber(){
		CardNumber = driver.findElement(By.id("ccsave_cc_number"));
		return CardNumber;
	}
	
	public WebElement Month(){
		Month = driver.findElement(By.id("ccsave_expiration"));
		return Month;
	}

	public WebElement Year(){
		Year = driver.findElement(By.id("ccsave_expiration_yr"));
		return Year;
	}
	
	public WebElement Sec(){
		Sec = driver.findElement(By.id("ccsave_cc_cid"));
		return Sec;
	}
	
	public WebElement PlaceOrder(){
		PlaceOrder = driver.findElement(By.id("onestepcheckout-place-order"));
		return PlaceOrder;
	}
	
	public WebElement VerifyErrorMassge(){
		String text = driver.findElement(By.id("onestepcheckout-form")).getText();
		equals(text);
		return VerifyErrorMassage;
	}
}
