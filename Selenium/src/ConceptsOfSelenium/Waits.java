package ConceptsOfSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Program Files\\Selenium Jar Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		String baseUrl = "https://www.ebay.com/";
		driver.get(baseUrl);
		
		//Implicit Wait for Page Load
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		//Implicit Wait for all WebElements 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Explicit Wait for the elements to be clickable
		clickOn(driver, driver.findElement(By.linkText("Electronics")), 40);
		System.out.println("Element is clicked");
		
		driver.quit();
		
	}

	public static void clickOn(WebDriver driver, WebElement locator,int timeOut ){
		new WebDriverWait(driver,timeOut).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}
}
