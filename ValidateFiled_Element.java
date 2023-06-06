package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.BaseClass;

public class ValidateFiled_Element extends BaseClass {
	@FindBy(xpath = "//div[text()='check-in']")
	WebElement check_in;

	@FindBy(xpath = "//div[text()='flight status']")
	WebElement flight_Status;

	@FindBy(xpath = "//div[text()='manage booking']")
	WebElement manage_booking;

	public ValidateFiled_Element() {
		PageFactory.initElements(driver, this);
	}

	public void validate() {
		clickElement(check_in);
		clickElement(flight_Status);
		clickElement(manage_booking);
	}
}