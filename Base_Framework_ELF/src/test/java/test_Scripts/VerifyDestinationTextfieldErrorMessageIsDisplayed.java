package test_Scripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import pom_scripts.HotelPage;
import pom_scripts.WelcomePage;

public class VerifyDestinationTextfieldErrorMessageIsDisplayed extends Base_Test {
	@Test
	public void Place() {
		WelcomePage wp = new WelcomePage(driver);
		HotelPage hp = new HotelPage(driver);
		wp.clickHotel();
		explicitWait.until(ExpectedConditions.visibilityOf(hp.getHotelHeading()));
		hp.clickDestinationTestfield();
		//hp.enterPlace("Bangalore");
		
		hp.SearchHotelButton();
		String errorMess = hp.getDestinatiomErrorMes().getText();
		test.log(LogStatus.INFO, "Error message is displayed");
	}

}
