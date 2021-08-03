package ConceptsOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Program Files\\Selenium Jar Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		String baseUrl = "https://www.ebay.com/";
		driver.get(baseUrl);
		
		    
		//Mouse Hover
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Fashion"))).build().perform();
		System.out.println("Fashion Tab is selected");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Watches")).click();
		System.out.println("Watches Section is selected");
		
		//Drag and Drop actions
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		System.out.println("Switched to frame");
		action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']"))).moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).release().build().perform();
		System.out.println("Drag and drop actions are performed");
		
		driver.quit();
	}

}
