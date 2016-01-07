package com.everyonedoesit.test;

import org.testng.annotations.Test;

import pom.framework.ScriptPage;

public class Test1 extends ScriptPage{
	
	@Test
	public void NewTest(){
		apppage().homepage().AgeVerify().click();
		apppage().homepage().Category().click();
		apppage().homepage().SelectProduct().click();
		
		apppage().checkout().ProceedToCheckOut().click();
		apppage().checkout().Email().sendKeys("tporag@gmail.com");
		apppage().checkout().FName().sendKeys("John");
		apppage().checkout().LName().sendKeys("Adams");
		apppage().checkout().Address().sendKeys("8931 204th Street");
		apppage().checkout().City().sendKeys("Hollis");
		apppage().checkout().Country().sendKeys("United States");
		apppage().checkout().State().sendKeys("New York");
		apppage().checkout().ZipCode().sendKeys("11423");
		apppage().checkout().Phone().sendKeys("6465771266");
		apppage().checkout().ClickOnShipping().click();
		
		apppage().paymnet().Name().sendKeys("John");
		apppage().paymnet().CardNumber().sendKeys("4242424242424242");
		apppage().paymnet().Month().sendKeys("06");
		apppage().paymnet().Year().sendKeys("2018");
		apppage().paymnet().Sec().sendKeys("569");
		apppage().paymnet().PlaceOrder().click();
		apppage().paymnet().VerifyErrorMassge();
		
	}

}
