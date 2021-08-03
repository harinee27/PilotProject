package ConceptsOfSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "E:\\Program Files\\Selenium Jar Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://courses.letskodeit.com/practice";
		driver.get(baseUrl);
		
		//Handling Alert Pop-up 
		driver.findElement(By.id("alertbtn")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Message : "+alert.getText());
		
		alert.accept();
		System.out.println("Alert Accepted successfully");
		
		driver.findElement(By.id("confirmbtn")).click();
		alert.dismiss();
		System.out.println("Alert dismissed successfully");
		
		
		//Handling File Upload Pop-up 
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\home\\Downloads\\New Text Document.txt");
		Thread.sleep(2000);
		System.out.println("File uploaded successfully");
		driver.quit();
		
	}

}
