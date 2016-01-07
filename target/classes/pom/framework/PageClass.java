package pom.framework;

import org.openqa.selenium.WebDriver;


public class PageClass {

protected WebDriver driver;
	
	public PageClass(WebDriver driver){
		this.driver = driver;
		
	}
	
	public void delayFor(int ms){
		try{
			Thread.sleep(ms);
		} catch (InterruptedException e){
		
	  }
	}
}

