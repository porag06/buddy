package pom.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//buddy
public class HomePage extends PageClass{
	
	private WebElement AgeVerify;
	private WebElement Category;
	private WebElement SelectProduct;

	public HomePage(WebDriver driver) {
		super(driver);	
	}
	
	public WebElement AgeVerify(){
		AgeVerify = driver.findElement(By.xpath(".//*[@id='verpage']//*[@class='verpage_actions']/button[1]"));
		return AgeVerify;
    }
	public WebElement Category(){
		Category = driver.findElement(By.xpath(".//*[@class='nav container clearer show-bg']//*[text()='Bongs']"));
		delayFor(2000);
		return Category;
	
}
	public WebElement SelectProduct(){
		//Actions action = new Actions(driver);
		//WebElement mouseover = driver.findElement(By.xpath(".//*[@class='options-container']"));
		//WebElement mo = driver.findElement(By.xpath(".//*[@class='options-container']/form//*[@title='Add to Cart']"));
		 SelectProduct = driver.findElement(By.xpath("//*[@class='product-info' and contains(., 'Freeek - Freeek Tube')]//*[@class='button btn-cart']"));
		//action.moveToElement(mouseover).build().perform();
		//action.moveToElement(mo).click().build().perform();
		return SelectProduct;
	}
}