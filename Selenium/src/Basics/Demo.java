package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		d.test();
		
	}
	public void test() throws Exception{
			
			System.setProperty("webdriver.chrome.driver", "E:\\Program Files\\Selenium Jar Files\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://phptravels.com/demo/");
			System.out.println("Launched the browser successfully");
			//driver.manage().window().maximize();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,200)");
			driver.wait(10);
			//Click on Home Page Front End Link
			WebElement homePageFrontEnd = driver.findElement(By.linkText("https://www.phptravels.net/admin"));
			homePageFrontEnd.click();
			/*Actions action = new Actions(driver);
			action.moveToElement(homePageFrontEnd).perform();
			action.click();*/
			/*((JavaScriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",homePageFrontEnd);
			homePageFrontEnd.click();
			*/
			//Switch to new window
			//Set<String> phpTravels = driver.getWindowHandles();
			
			
		}


	

}
