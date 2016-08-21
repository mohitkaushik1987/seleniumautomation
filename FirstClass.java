package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirstClass {

	public static void main(String[] args) throws Exception {
		
		
		//ChromeBrowserInvoke
		
		System.setProperty("webdriver.chrome.driver", "/Users/mohitkaushik/C/Softwares/chromedriver");

		  WebDriver driver = new ChromeDriver();
		  driver.get("http://www.google.com/xhtml");
		  Thread.sleep(5000);  // Let the user actually see something!
		  WebElement searchBox = driver.findElement(By.name("q"));
		  searchBox.sendKeys("ChromeDriver");
		  searchBox.submit();
		  Thread.sleep(5000);  // Let the user actually see something!
		  driver.quit();
		  
		  //FirefoxBrowserInvoke
		  
		  WebDriver driver_ff;
		  driver_ff = new FirefoxDriver();
		  String baseURL = "http://www.google.com";
			
		  driver_ff.get(baseURL);
		  Thread.sleep(5000);  // Let the user actually see something!
		  driver_ff.quit();
		  
		  
		  
		
	}

}
