package ConceptsOfSelenium;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverCommands{

	public void drivers() throws Exception{
	System.setProperty("webdriver.chrome.driver", "E:\\Program Files\\Selenium Jar Files\\chromedriver_win32\\chromedriver.exe");
	
	//get() command
	WebDriver driver = new ChromeDriver();
	String baseUrl = "https://courses.letskodeit.com/practice";
	driver.get(baseUrl);
	//driver.navigate().to(baseUrl);
	
	//get Title of the current web page
	String title = driver.getTitle();
	int titleLength = driver.getTitle().length();
	System.out.println("Title of the Webpage : " +title);
	System.out.println("Length of the title : "+titleLength);
	
	//get Current URL of the web page
	String currentUrl = driver.getCurrentUrl();
	System.out.println("Current URL of Web Page : "+currentUrl);
	
	if(baseUrl.contentEquals(currentUrl)){
		System.out.println("URL has opened Correct Page");
	}
	
	//get Page Source of the web page
	String pageSource = driver.getPageSource();
	int pageSourceLength = pageSource.length();
	//System.out.println("Page Source of the Web Page : "+pageSource);
	System.out.println("Length of Page Source : "+pageSourceLength);
	
	//close the current window of the browser
	//driver.close();
	
	//closes all the window that program has opened
	//driver.quit();
	
	//Window Handling
	String parentWindow = driver.getWindowHandle();
	System.out.println("Parent Window : "+parentWindow);
	
	driver.findElement(By.linkText("ALL COURSES")).click();
	
	driver.findElement(By.linkText("HOME")).click();
	Set<String> childWindow = driver.getWindowHandles();
	String secondWindow =  childWindow.iterator().next();
	driver.switchTo().window(secondWindow);
	System.out.println("Second Window : "+secondWindow);
	
	/*
	//Navigate back by one page on browser's history
	driver.navigate().back();
	System.out.println("Navigated Back by one page on browser's history");
	
	//Navigate forward by one page on browser's history
	driver.navigate().forward();
	System.out.println("Navigated forward by one page on browser's history");
	
	driver.navigate().back();
	
	//Refresh the page
	driver.navigate().refresh();*/
	}	
}
