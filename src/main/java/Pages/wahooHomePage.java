package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Pages.Shop;

public class wahooHomePage {

	// This is the place to start when navigating to other pages

	// -------WebElements------//
	private WebDriver driver;
	private By shopMenuPg = By.linkText("SHOP");
	private By clickAcceptButton = By.id("onetrust-accept-btn-handler");
//		private By systmMenuPg = 
//		private By discoverMenuPg = 

	public wahooHomePage(WebDriver driver) {
		this.driver = driver;
	}

	public Shop navigateToShop() {
		WebElement shopMenu = driver.findElement(shopMenuPg);
		WebElement acceptButton = driver.findElement(clickAcceptButton);
		Actions action = new Actions(driver);
		action.click(acceptButton);
		action.moveToElement(shopMenu).click().build().perform();
		return new Shop(driver);
	}
}
