package testpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNGFile {
	
	public String baseURL = "http://newtours.demoaut.com";
	public String baseURLaz = "https://www.amazon.com/";
	public WebDriver driver = new FirefoxDriver();
	
  @Test(priority=2)
  public void verifyHomepageTitle() {
	  driver.get(baseURL);
	  String expectedTitle = "Welcome: Mercury Tours";
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);
	  driver.quit();
	  //driver.get(baseURLaz);
	  //String expectedTitle_az = "Welcome: Mercury Tours";
	  //driver.findElement(By.xpath(".//*[@id='nav-link-shopall']/span[2]"));
	  
  }
 @Test
 public void verifyLinksPresentOnAmazoneHomePage()
 {
	 driver.get(baseURLaz);
	 List<WebElement> txt1 = driver.findElements(By.xpath(".//*[@id='nav-link-shopall']/span[2]"));
	 Assert.assertNotNull(txt1);
		  
	
  }
  
 @Test(priority =1)
 public void loginToAmazon()
 {
	 //driver.get(baseURLaz);
	 //driver.findElement(By.linkText("Hello, Sign in")).click();
	 driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[1]")).click();
	 driver.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys("mohit.kaushik.0608@gmail.com");
	 driver.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys("Villa2018");
	 driver.findElement(By.xpath(".//*[@id='signInSubmit']")).click();
	 String expectedValue_az = "Hello, Mohit";
	 String actualValue_az = driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[1]")).getText();
	 Assert.assertEquals(actualValue_az, expectedValue_az);
	
 }
 
	  
	  
  

}