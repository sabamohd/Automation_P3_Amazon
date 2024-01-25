package amazonPageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectScreenSize {
  WebDriver driver;
  
  By ScreenSize1 = By.xpath("//*[@id=\"p_n_feature_nine_browse-bin/8561125031\"]/span/a/div/label/i");
  By ScreenSize2 = By.xpath("//*[@id=\"p_n_feature_nine_browse-bin/8561126031\"]/span/a/div/label/i");
  By ScreenSize3 = By.xpath("//*[@id=\"p_n_feature_nine_browse-bin/8561127031\"]/span/a/div/label/i");
  
  public SelectScreenSize(WebDriver d) {
	  driver = d;
  }
  public void ScreenSize1() {
	  driver.findElement(ScreenSize1).click();
	  System.out.println("ScreenSize 1-1.49 GHz is Selected");
  }
  public void ScreenSize2() {
	  driver.findElement(ScreenSize2).click();
	  System.out.println("ScreenSize 2-2.4 GHz is Selected");
  }
  public void ScreenSize3() {
	  driver.findElement(ScreenSize3).click();
	  System.out.println("ScreenSize 2.5 & above GHz is Selected");
  }
}
