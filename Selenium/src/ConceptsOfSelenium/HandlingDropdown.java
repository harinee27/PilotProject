/*package ConceptsOfSelenium;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown extends basicConcepts{

	
	public static void dropdown() throws Exception{
	//	public static WebDriver driver;
	//WebDriver driver = new ChromeDriver();
		try{
			//Select Class (or) Drop down Example
			Select dropDown = new Select(driver.findElement(By.id("carselect")));
			dropDown.selectByValue("honda");
			System.out.println("Dropdown is selected");
		}
		catch(Exception e){
			System.out.println("Select class exception is catched");
		   }
		
		//Multiple Select Example
		WebElement multi = driver.findElement(By.id("multiple-select-example"));
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
	}
}
*/