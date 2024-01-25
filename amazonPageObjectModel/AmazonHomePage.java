package amazonPageObjectModel;

import org.openqa.selenium.WebDriver;

public class AmazonHomePage {
	WebDriver driver;

	public AmazonHomePage(WebDriver d) {
		driver = d;
	}

	public void VerifyAmazonHomePage() {
		assert driver.getTitle().contains("Amazon") : "Not on Amazon home page";
	}

}
