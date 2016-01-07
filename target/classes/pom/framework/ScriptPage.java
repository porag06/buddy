package pom.framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ScriptPage {
	
	protected WebDriver driver;
	
	private AppPage apppage;
	
	
  @BeforeMethod
  public void setUp() throws Exception {
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.navigate().to("https://new.everyonedoesit.com/");
	  driver.manage().window().maximize();

  }

  @AfterMethod
  public void afterMethod() throws Exception {
	  //driver.close();
  }
  
  public AppPage apppage(){
	  if(apppage == null);
	  return apppage = new AppPage(driver);
	  
  }
}
