package pages;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.BaseClass;

public class BookingTC extends BaseClass {
	@Test
	public void tc001_booking_Validation() throws Exception {
		BookingElement be = new BookingElement();
		be.booking("prajakta", "varpe", "9822633405", "prajakta27v@gmail.com", "sangamner", "harshad", "Varpe",
				"9284185661");
		be.payment("132554698516", "Harshad Varpe", "12", "25", "135");
		Thread.sleep(2000);
		be.pay();
		File src=be.paymentsnap.getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\Users\\HP\\eclipse-workspace\\spiceJet\\Screenshot\\payment.png");		
		FileUtils.copyFile(src, target);
		
		Assert.assertTrue(be.proceed_to_pay.isDisplayed());
		Assert.assertEquals("Please enter a valid card", be.cardErrormsg());

		System.out.println(driver.getTitle());

	}

	@Test
	public void tc002_booking_Validation() throws Exception {
		BookingElement be = new BookingElement();
		be.booking("prajakta", "varpe", "9822633405", "prajakta27v@gmail.com", "sangamner", "harshad", "Varpe",
				"9284185661");
		be.payment("132554698516", "Harshad Varpe", "12", "25", "135");
		Assert.assertTrue(be.proceed_to_pay.isDisplayed());

	}

	@Test
	public void tc003_booking_Validation() throws Exception {
		BookingElement be = new BookingElement();
		be.booking("prajakta", "varpe", "9822633405", "prajakta27v@gmail.com", "sangamner", "harshad", "Varpe",
				"9284185661");
		be.payment("132554698516", "Harshad Varpe", "12", "25", "135");
		Thread.sleep(2000);
		be.pay();
		Assert.assertEquals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets",
				driver.getTitle());
	}
@Test
	public void tc004_booking_Validation() throws Exception {
		BookingElement be = new BookingElement();
		be.booking("prajakta", "varpe", "9822633405", "prajakta27v@gmail.com", "sangamner", "", "Varpe", "9822633405");
		Assert.assertEquals("Invalid first name", be.passErrormsg());
	}
@Test
	public void tc005_booking_Validation() throws Exception {
		BookingElement be = new BookingElement();
		be.booking("prajakta", "varpe", "9822633405", "prajakta27v@gmail.com", "sangamner", "Harshad", "",
				"9822633405");
		Assert.assertEquals("Invalid last name", be.passlastErrormsg());
	}
}
