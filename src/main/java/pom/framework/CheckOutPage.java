package pom.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage extends PageClass {
	
	private WebElement ProceedToCheckOut;
	private WebElement Email;
	private WebElement FName;
	private WebElement LName;
	private WebElement Address;
	private WebElement City;
	private WebElement Country;
	private WebElement State;
	private WebElement ZipCode;
	private WebElement Phone;
	private WebElement ClickOnShipping;



	public CheckOutPage(WebDriver driver) {
		super(driver);
	}
	
	public WebElement ProceedToCheckOut(){
		
		ProceedToCheckOut = driver.findElement(By.xpath(".//*[@id='mini-cart-products']//*[@class='actions clearer']/button[2]"));
		return ProceedToCheckOut;
	}
	
	public WebElement Email(){
		Email = driver.findElement(By.id("billing:email"));
		return Email;
	}
	
	public WebElement FName(){
		FName = driver.findElement(By.id("billing:firstname"));
		return FName;
	}
	
	public WebElement LName(){
		LName = driver.findElement(By.id("billing:lastname"));
		return LName;
	}
	
	public WebElement Address(){
		Address = driver.findElement(By.id("billing:street1"));
		return Address;	
	}
	
	public WebElement City(){
		City = driver.findElement(By.id("billing:city"));
		return City;	
   }
	
	public WebElement Country(){
		Country = driver.findElement(By.id("billing:country_id"));
		return Country;
   }
	
   public WebElement State(){
		State = driver.findElement(By.id("billing:region_id"));
		return State;
   }
	
   public WebElement ZipCode(){
	   ZipCode = driver.findElement(By.id("billing:postcode"));
		return ZipCode;
   }
	
   public WebElement Phone(){
		Phone = driver.findElement(By.id("billing:telephone"));
		return Phone;		
   }
	
	public WebElement ClickOnShipping(){
		ClickOnShipping = driver.findElement(By.xpath(".//*[@class='updateShippingsCarriers']//*[@title='Refresh']"));
		return ClickOnShipping;
	}
}
