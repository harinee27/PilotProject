package ConceptsOfSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class basicConcepts {
	
	public void test() throws Exception{
		System.setProperty("webdriver.chrome.driver", "E:\\Program Files\\Selenium Jar Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Launch Browser
		driver.get("https://courses.letskodeit.com/practice");
		//driver.manage().window().maximize();
		
		
		//Radio Button Example 
		WebElement radio1 = driver.findElement(By.id("benzradio"));
		radio1.click();
		System.out.println("Radio Button is clicked");
		
		//Select Class (or) Drop down Example
		///Single Select Class Example
		
		try{
			/*//Using CSSSelector
			driver.findElement(By.cssSelector("select#carselect option:nth-of-type(2)")).click();
			*/
			Select dropDown = new Select(driver.findElement(By.id("carselect")));
			dropDown.selectByValue("honda");
			//Thread.sleep(2000);
			System.out.println("Dropdown is selected");
			
		}
		catch(Exception e){
			System.out.println("Select class exception is catched");
		   }
		
		//Multiple Select Example
		//Using CSSSelector
		WebElement multi = driver.findElement(By.cssSelector("select#multiple-select-example"));
	    Select multipleSelect = new Select(multi);
		boolean status = multipleSelect.isMultiple();
		if(status == true){
			System.out.print("Dropdown is multiple select");
			try{
			multipleSelect.selectByIndex(1);
			Thread.sleep(1000);
			}
			catch(Exception e){
				System.out.println("select Exception is catched");
			}
			System.out.println("Multiple Options are selected");
		//	multipleSelect.selectByIndex(2);
			
		}
		else{
			System.out.println("Dropdown is single select");
		}
		
		//Retrieve all the options from drop down
		List <WebElement> option = multipleSelect.getOptions();
		System.out.println("Below are the list of fruits : ");
		for(WebElement opt : option){
			System.out.println(opt.getText());
		}
		
		//Retrieve All Selected options from drop down
		List <WebElement> allSelectedOptions = multipleSelect.getAllSelectedOptions();
		System.out.println("Below are the list of options selected in dropdown : ");
		for(WebElement getAllSelectedOptions : allSelectedOptions){
			System.out.println(getAllSelectedOptions.getText());
		}
		
		//Select on Single Check Box
		WebElement checkBox = driver.findElement(By.xpath("//*[@id='bmwcheck']"));
		checkBox.click();
		
		//Select on multiple Check Box
		WebElement multiCheckBox = driver.findElement(By.xpath("//*[@id='hondacheck']"));
		multiCheckBox.click();
		
		WebElement checkBox1 = driver.findElement(By.cssSelector("#benzcheck"));
		checkBox1.click();
		
		
	}
}
