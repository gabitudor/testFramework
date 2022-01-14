package Tests;

import org.testng.annotations.Test;

public class navigateToShopPageTEST extends BaseTEST{
	
	@Test
	//1. Load https://eu.wahoofitness.com/ and open product category

    //2. Select random product and add it to the cart (Verify that side-bar cart appears with added product).
	public void clickOnShop() {
		homePage.navigateToShop();
		
	}

}
