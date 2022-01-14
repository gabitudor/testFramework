package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Shop {

	// -------WebElements------//

	private WebDriver driver;
	private By item = By.xpath("//a[text()='KICKR Smart Trainer']");
	private By addToCartButton= By.id("product-addtocart-button");
	private By 
	
	public Shop(WebDriver driver) {
		this.driver=driver;
	}
	
	
	// -------Methods------//
	public void addRandomItem() {
	driver.findElement(addToCartButton).click();
	}
	
	public void verifySidePannlePresence() {
	driver.findElement(addToCartButton)
	}
}
