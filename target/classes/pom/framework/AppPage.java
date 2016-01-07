package pom.framework;

import org.openqa.selenium.WebDriver;

public class AppPage extends PageClass{
	
	private HomePage homepage;
	private CheckOutPage checkout;
	private Payment payment;

	
	public AppPage (WebDriver driver) {
		super(driver);
	}	
	
	public HomePage homepage(){
		if(homepage == null);
		homepage = new HomePage(driver);
		return homepage;
	}
	
	public CheckOutPage checkout(){
		if(checkout == null);
		checkout = new CheckOutPage(driver);
		return checkout;
	}
	
	public Payment paymnet(){
		if(payment == null);
		payment = new Payment(driver);
		return payment;
	}
}
	
		
		