package amazonPageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeliverDayRefinements {
	WebDriver driver;

	By GetItToday = By.xpath("//*[@id=\"p_90/6741117031\"]/span/a/div/label/i");
	By GetByTomorrow = By.xpath("//span[contains(text(), 'Get it by tomorrow')]\")");
	By GetInTwoDays = By.xpath("//*[@id=\"p_90/20912642031\"]/span/a/span");
	

	public DeliverDayRefinements(WebDriver d) {
		driver = d;
	}

	public void GetItToday() {
		driver.findElement(GetItToday).click();
		System.out.println("Successfully filtered: Get it Today");

	}

	public void GetByTomorrow() {
		driver.findElement(GetByTomorrow).click();
		System.out.println("Successfully filtered: Get By Tomorrow");

	}

	public void GetInTwoDays() {
		driver.findElement(GetInTwoDays).click();
		System.out.println("Successfully filtered: Get In Two Days");

	}
	
}
