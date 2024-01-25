package amazonPageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Click_AllDropDown {
	WebDriver driver;
	
	
	 By dropdownElement = By.id("searchDropdownBox");
	
	public Click_AllDropDown(WebDriver d) {
		driver = d;
	}
	public void All() {

         // Get all options from the dropdown
         java.util.List<WebElement> options = ((ISelect) dropdownElement).getOptions();

         // Display all options in the console
         System.out.println("Options in the dropdown:");
         for (WebElement option : options) {
             System.out.println(option.getText());
         }
	}

}
