package test_Scripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import pom_scripts.HotelPage;
import pom_scripts.WelcomePage;

public class VerifyIfDestinationPlaceholderIsPresent extends Base_Test {
	@Test
	public void Placeholder() {
		WelcomePage wp = new WelcomePage(driver);
		HotelPage hp = new HotelPage(driver);
		wp.clickHotel();
		explicitWait.until(ExpectedConditions.visibilityOf(hp.getHotelHeading()));
		String str = "Enter City, Area or Hotel Name";
		hp.clickDestinationTestfield();
		hp.enterPlace("Bangalore");
		String placeholder = hp.getDestinationTextBox().getAttribute("placeholder");
		if (placeholder.equals(str)) {
			test.log(LogStatus.INFO, "Destination placeholder is displayed");
		} else {
			test.log(LogStatus.INFO, "Destination placeholder is not displayed");
		}
	}

}
