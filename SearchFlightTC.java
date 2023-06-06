package pages;

import org.testng.Assert;
import org.testng.annotations.Test;

import utility.BaseClass;

public class SearchFlightTC extends BaseClass {
	@Test
	public void tc001_ValidationFor_OneWay() throws Exception {

		SearchFlightElement se = new SearchFlightElement();
		se.list();
		Thread.sleep(3000);
		se.tolist();
		// se.Datepicker();

		Assert.assertEquals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets",
				driver.getTitle());
		System.out.println("Test Case Passed");
	}
	@Test
	public void tc002_ValidationFor_OneWay() throws Exception {

		SearchFlightElement se = new SearchFlightElement();
		se.list();
		Thread.sleep(3000);
		se.tolist();
		
Assert.assertTrue(se.oneWay.isDisplayed());
		System.out.println("Test Case Passed");
	}
@Test
	public void tc001_ValidationFor_RoundWay() throws Exception {

		SearchFlightElement se = new SearchFlightElement();
		se.roundTrip();
		Thread.sleep(3000);
		se.toRoundTrip();
		Assert.assertEquals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets",
				driver.getTitle());
		System.out.println("Test Case Passed");
	}
}
