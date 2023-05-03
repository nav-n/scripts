package test_Scripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import pom_scripts.HotelPage;
import pom_scripts.WelcomePage;

public class VerifyIFDestinationTextfieldLocatorIsPresent extends Base_Test {
	@Test
	public void Locator() {
		WelcomePage wp = new WelcomePage(driver);
		wp.clickHotel();
		HotelPage hp = new HotelPage(driver);
		explicitWait.until(ExpectedConditions.visibilityOf(hp.getHotelHeading()));
		boolean locator = hp.getDestinationLocator().isDisplayed();
		if (locator) {
			test.log(LogStatus.INFO, "Destination locator is displayed");
			System.out.println("Destination locator is displayed: " + hp.getDestinationLocator().getText());
		} else {
			test.log(LogStatus.INFO, "Destination locator is not displayed");
		}
	}

}
