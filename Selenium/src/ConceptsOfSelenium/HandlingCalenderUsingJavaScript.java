package ConceptsOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingCalenderUsingJavaScript {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Program Files\\Selenium Jar Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://jqueryui.com/datepicker/";
		driver.get(baseUrl);
		Thread.sleep(1000);
		System.out.println("Launched the browser");
		
		driver.switchTo().frame(1);
		WebElement fromDate = driver.findElement(By.id("datepicker"));
		System.out.println("Element found in the webpage");
		//fromDate.clear();
		Thread.sleep(1000);
		
		String date = "07/27/2021";//*[@id="book-flight"]/div[5]/div[4]/div[4]/div[1]/div[1]/input
		
		DatePicker(driver, fromDate, date);
		
		System.out.println("Date is selected from the calender");
		
		driver.quit();

	}

	public static void DatePicker(WebDriver driver, WebElement element, String date){
		JavascriptExecutor js =((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','27-08-2021');", element);
	}
}
