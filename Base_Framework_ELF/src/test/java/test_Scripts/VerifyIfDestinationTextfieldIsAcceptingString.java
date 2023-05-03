package test_Scripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import pom_scripts.HotelPage;
import pom_scripts.WelcomePage;

public class VerifyIfDestinationTextfieldIsAcceptingString extends Base_Test {
	@Test
	public void Destination() {
		WelcomePage wp = new WelcomePage(driver);
		HotelPage hp = new HotelPage(driver);
		wp.clickHotel();
		explicitWait.until(ExpectedConditions.visibilityOf(hp.getHotelHeading()));
		hp.clickDestinationTestfield();
		hp.enterPlace("Ban");
		explicitWait.until(ExpectedConditions.elementToBeClickable(hp.getBangaloreSugesstion()));
		hp.clickBangalore();
		hp.SearchHotelButton();
		
	}

}
