package amazonTestFiles;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import amazonPageObjectModel.AboutUsPage;
import amazonPageObjectModel.AmazonHomePage;
import amazonPageObjectModel.BestSellers;
import amazonPageObjectModel.BirthDayStore;
import amazonPageObjectModel.ChangeCountry;
import amazonPageObjectModel.ChangeLanguageIndia;
import amazonPageObjectModel.ChooseLocation;
import amazonPageObjectModel.ClickOnSell;
import amazonPageObjectModel.Click_AllDropDown;
import amazonPageObjectModel.ConnectWithUsPage;
import amazonPageObjectModel.DeliverDayRefinements;
import amazonPageObjectModel.FreshIcon;
import amazonPageObjectModel.NewLaunch;
import amazonPageObjectModel.SearchBar;
import amazonPageObjectModel.SelectBrands;
import amazonPageObjectModel.SelectCategory;
import amazonPageObjectModel.SelectElectronics;
import amazonPageObjectModel.SelectScreenSize;
import amazonPageObjectModel.SelectStorage;
import amazonPageObjectModel.TodaysDealsPage;

public class amazonPageObjectModel {

	WebDriver driver;

	@Test

	void homepage() throws InterruptedException {
		String url = "https://www.amazon.in/";
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.amazon.in/");
			System.out.println(driver.getCurrentUrl());
			// Verify Amazon Home Page
			AmazonHomePage AmazonHomePage = new AmazonHomePage(driver);
			AmazonHomePage.VerifyAmazonHomePage();
			System.out.println("Successfully Landed on Amazon HomePage");
			// Search Bar and Search Button
			SearchBar SearchBar = new SearchBar(driver);
			SearchBar.SearchBar();
			SearchBar.SearchButton();
			System.out.println("Successfully Landed on Mobiles Search Page");
			// Deliver Day Refinements
			 DeliverDayRefinements DeliverDayRefinements = new
			 DeliverDayRefinements(driver);
			 DeliverDayRefinements.GetItToday();
			 DeliverDayRefinements.GetByTomorrow();
			 DeliverDayRefinements.GetInTwoDays();
			// Select Brands
			SelectBrands SelectBrands = new SelectBrands(driver);
			SelectBrands.OnePlus();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			SelectBrands.Realme();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			SelectBrands.Samsung();
			System.out.println("Successfully Selected Brands");
			// Select Category
			SelectCategory SelectCategory = new SelectCategory(driver);
			SelectCategory.SmartPhones();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			SelectCategory.SmartandBasicsPhones();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			SelectCategory.BasicPhones();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			// Select Storage
			driver.get("https://www.amazon.in/");
			SearchBar.SearchBar();
			SearchBar.SearchButton();
			SelectStorage SelectStorage = new SelectStorage(driver);
			SelectStorage.FourGbStorage();
			SelectStorage.EightGbStorage();
			SelectStorage.SixteenGbStorage();
			// Select Screen Size
			SelectScreenSize SelectScreenSize = new SelectScreenSize(driver);
			SelectScreenSize.ScreenSize1();
			SelectScreenSize.ScreenSize2();
			// SelectScreenSize.ScreenSize3();
			// Fresh Icon
			driver.get("https://www.amazon.in/");
			FreshIcon FreshIcon = new FreshIcon(driver);
			FreshIcon.FreshIcon();
			FreshIcon.PinCode();
			FreshIcon.Apply();
			FreshIcon.FruitsCategory();
			FreshIcon.AddProducts1();
			FreshIcon.AddProducts2();
			FreshIcon.AdddProducts3();
			// Sell Page
			driver.get("https://www.amazon.in/");
			ClickOnSell ClickOnSell = new ClickOnSell(driver);
			ClickOnSell.VerifyAmazonHomePage();
			ClickOnSell.Sell();
			// Best Sellers
			BestSellers BestSellers = new BestSellers(driver);
			BestSellers.VerifyAmazonHomePage();
			BestSellers.BestSellers();
			// Electronics
			driver.get("https://www.amazon.in/");
			SelectElectronics SelectElectronics = new SelectElectronics(driver);
			SelectElectronics.VerifyAmazonHomePage();
			SelectElectronics.Electronics();
			SelectElectronics.Accessories();
			SelectElectronics.CameraAccessories();
			SelectElectronics.CameraFilm();
			SelectElectronics.SelectBrand();
			// Choose Location
			driver.get("https://www.amazon.in/");
			ChooseLocation ChooseLocation = new ChooseLocation(driver);
			ChooseLocation.Location();
			ChooseLocation.PinCode();
			ChooseLocation.Apply();
			// Click_AllDropDown
			Click_AllDropDown Click_AllDropDown = new Click_AllDropDown(driver);
			Click_AllDropDown.All();
			// ChangeLanguageIndia
			ChangeLanguageIndia ChangeLanguageIndia = new ChangeLanguageIndia(driver);
			ChangeLanguageIndia.Language1();
			ChangeLanguageIndia.Language2();
			ChangeLanguageIndia.Language3();
			// ChangeCountry
			ChangeCountry ChangeCountry = new ChangeCountry(driver);
			ChangeCountry.ChangeCountry();
			ChangeCountry.Country1();
			ChangeCountry.Country2();
			ChangeCountry.Country3();
			// BirthDayStore
			driver.get(url);
			BirthDayStore BirthDayStore = new BirthDayStore(driver);
			BirthDayStore.BirthdayDeals();
			BirthDayStore.BirthDayCards();
			BirthDayStore.Product1();
			// About Us
			driver.get(url);
			AboutUsPage AboutUsPage = new AboutUsPage(driver);
			AboutUsPage.FooterElement();
			AboutUsPage.AboutUs();
			AboutUsPage.Careers();
			// Connect With Us Page
			driver.get(url);
			ConnectWithUsPage ConnectWithUsPage = new ConnectWithUsPage(driver);
			ConnectWithUsPage.FooterElement();
			ConnectWithUsPage.Facebook();
			ConnectWithUsPage.Twitter();
			ConnectWithUsPage.Instagram();
			// New Launch Page
			driver.get(url);
			NewLaunch NewLaunch = new NewLaunch(driver);
			NewLaunch.NewLaunchTab();
			NewLaunch.NewSmartPhone();
			NewLaunch.NewLaptopLaunch();
			// Todays Deals Page
			driver.get(url);
			TodaysDealsPage TodaysDealsPage = new TodaysDealsPage(driver);
			TodaysDealsPage.SeeAllDeals();
			TodaysDealsPage.DealsOnFootwear();
			TodaysDealsPage.DealOfDay();
			TodaysDealsPage.Clothing();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
