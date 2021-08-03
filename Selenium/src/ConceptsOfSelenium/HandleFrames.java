package ConceptsOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) throws Exception,InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Program Files\\Selenium Jar Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		
		driver.switchTo().frame("iframe-name");
		System.out.println("Switched to another frame");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Java");
		System.out.println("Search course");
	}

}
