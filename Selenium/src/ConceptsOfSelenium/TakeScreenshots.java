package ConceptsOfSelenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshots {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "E://Program Files//Selenium Jar Files//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		String baseUrl = "https://www.ebay.com/";
		driver.get(baseUrl);
		
		//Take Screenshot and store as a file format
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:/Users/home/Downloads/screenshot.png"));
		
		driver.quit();

	}

}
