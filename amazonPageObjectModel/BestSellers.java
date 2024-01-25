package amazonPageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BestSellers {
	WebDriver driver;
	
	By BestSellers = By.xpath("//*[@id=\"nav-xshop\"]/a[4]");
	public BestSellers(WebDriver d) {
		driver = d;
	}
	public void VerifyAmazonHomePage() {
		assert driver.getTitle().contains("Amazon") : "Not on Amazon home page";
	}
	public void BestSellers() {
		driver.findElement(BestSellers).click();
		System.out.println("Successfully Landed On BestSellers Page");
	}

}
