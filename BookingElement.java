package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.BaseClass;

public class BookingElement extends BaseClass {
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-zso239'])[2]")
	WebElement returna;

	@FindBy(xpath = "//div[@data-testid='to-testID-origin']")
	WebElement deptTextbox;

	@FindBy(xpath = "//div[@data-testid='to-testID-destination']")
	WebElement toTextbox;

	@FindBy(xpath = "(//div[contains(text(),'Delhi')])[1]")
	WebElement Fromcity_Delhi;

	@FindBy(xpath = "(//div[contains(text(),'Pune')])[1]")
	WebElement Fromcity_Pune;

	@FindBy(xpath = "(//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41'])[120]")
	WebElement date;

	@FindBy(css = ".r-1g94qm0")
	WebElement search;

	// **************************** 2nd page
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement continue1;// path for 2nd page continue

	@FindBy(css = ".r-hrhsj0") // path for 2nd page continue
	WebElement priceContinue;
	// ********************************* booking page
	@FindBy(xpath = "//input[@data-testid='first-inputbox-contact-details']")
	WebElement firstName;

	@FindBy(xpath = "//input[@data-testid='last-inputbox-contact-details']")
	WebElement lastName;

	@FindBy(xpath = "//input[@data-testid='emailAddress-inputbox-contact-details']")
	WebElement email;

	@FindBy(xpath = "//input[@data-testid='city-inputbox-contact-details']")
	WebElement town;

	@FindBy(xpath = "//input[@data-testid='contact-number-input-box']")
	WebElement mobileNo;

	// *****************************passenger details
	@FindBy(xpath = "//input[@data-testid='traveller-0-first-traveller-info-input-box']")
	WebElement passName;

	@FindBy(xpath = "//input[@data-testid='traveller-0-last-traveller-info-input-box']")
	WebElement passLname;

	@FindBy(xpath = "//input[@data-testid='sc-member-mobile-number-input-box']")
	WebElement pass_mobileNo;

	@FindBy(xpath = "//div[@data-testid='traveller-info-continue-cta']")
	WebElement amountContinue;
	
	@FindBy(xpath = "//div[contains(text(),'Invalid first name')]")
	WebElement passerror;

	@FindBy(xpath = "//div[contains(text(),'Invalid last name')]")
	WebElement passlasterror;

	// **************************Booking continue page
	@FindBy(xpath = "//div[@data-testid='bookingFlow-assurance-add-cta']")
	WebElement add;

	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-zso239'])[10]")
	WebElement CheckBox;

	@FindBy(xpath = "//div[@class='css-76zvg2 r-jwli3a r-poiln3 r-ubezar r-1kfrs79']")
	WebElement done;

	@FindBy(xpath = "//div[@class='at_addon_close']")
	WebElement close;

	// ****************************** Add On******************************

	@FindBy(xpath = "(//div[contains(text(),'Continue')])[3]")
	WebElement BookingContinue;

	@FindBy(xpath = "//div[@data-testid='spice-max-card-add-cta']")
	WebElement seatadd;

	// ****************************payment confirmation previous page
	@FindBy(xpath = "(//div[text()='Continue'])[3]")
	WebElement Confirm_Continue;

	// @FindBy(xpath="(//div[text()='1A'])[2]")
	@FindBy(css = ".r-6dt33c > .css-76zvg2")
	WebElement seat_Selection;

	// @FindBy(xpath="//div[text()='Skip']")
	@FindBy(css = ".r-ah5dr5:nth-child(1)")
	WebElement skip;

	// @FindBy(xpath="//div[text()='Select Meals']")
	@FindBy(css = "r-ah5dr5:nth-child(1)")
	WebElement selectMeal;

	@FindBy(xpath = "//div[text()='Vegetable junglee sandwich in white bread']")
	WebElement sandwitch;

	@FindBy(xpath = "//div[text()='Done']")
	WebElement seatDone;

	// ***********************************************PAYMENT PAGE
	@FindBy(xpath = "//span[@class='css-76zvg2 css-16my406 r-homxoj r-13awgt0 r-poiln3 r-1p6iasa r-qhyqy2']")
	WebElement trya;

	@FindBy(xpath = "//input[@placeholder='Enter Card Number Here']")
	WebElement cardno;

	@FindBy(xpath = "//input[@placeholder='Cardholder Name']")
	WebElement cardHolder_Name;

	@FindBy(xpath = "//input[@name='card_exp_month']")
	WebElement card_Expiry_date;

	@FindBy(xpath = "//input[@name='card_exp_year']")
	WebElement card_Expiry_year;

	@FindBy(id="skipfrompopup")
	WebElement popUp;
	
	@FindBy(xpath = "//input[@name='security_code']")
	WebElement ccv;

	@FindBy(xpath = "//div[@data-testid='common-proceed-to-pay']")
	WebElement proceed_to_pay;

	// **************************************** after clicking error
	@FindBy(xpath = "//div[@id='payment_form_card_number_error']")
	WebElement cardError;

	@FindBy(xpath = "//iframe[@class='card_number_iframe']")
	WebElement framepath;
	
	@FindBy(xpath = "//iframe[@class='name_on_card_iframe']")
	WebElement framepath1;
	
	@FindBy(xpath = "//iframe[@class='card_exp_month_iframe']")
	WebElement framepath2;
	
	@FindBy(xpath = "//iframe[@class='card_exp_year_iframe']")
	WebElement framepath3;
	
	@FindBy(xpath = "//iframe[@class='security_code_iframe']")
	WebElement framepath4;
	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1adg3ll r-13awgt0 r-eqz5dr r-1wtj0ep r-1dqxon3 r-gmdvlt']")
	WebElement paymentsnap
	;
	public BookingElement() {
		PageFactory.initElements(driver, this);
	}

	public void booking(String fName, String lName, String contNo, String email, String town, String passfname,
			String passlName, String passmobileNo) throws Exception {
		clickElement(deptTextbox);
		clickElement(Fromcity_Delhi);
		clickElement(toTextbox);
		clickElement(Fromcity_Pune);
		clickElement(date);
		clickElement(search);
		clickElement(continue1); 
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		mobileNo.sendKeys(contNo);
		this.email.sendKeys(email);
		this.town.sendKeys(town);

		passName.sendKeys(passfname);
		passLname.sendKeys(passlName);
		pass_mobileNo.sendKeys(passmobileNo);
		clickElement(amountContinue);
	}

	public void payment(String cardno, String cardHoldername, String expirymonth, String expiryYear, String ccv)
			throws Exception {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", Confirm_Continue);		
		
		j.executeScript("arguments[0].click();", popUp);
		
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(framepath));	
		driver.switchTo().frame(framepath);		
		this.cardno.sendKeys(cardno);		
		driver.switchTo().defaultContent();
		
		
		wait.until(ExpectedConditions.visibilityOf(framepath1));
		driver.switchTo().frame(framepath1);
		cardHolder_Name.sendKeys(cardHoldername);
		driver.switchTo().defaultContent();
		
		wait.until(ExpectedConditions.visibilityOf(framepath2));
		driver.switchTo().frame(framepath2);
		card_Expiry_date.sendKeys(expirymonth);
		driver.switchTo().defaultContent();
		
		wait.until(ExpectedConditions.visibilityOf(framepath3));
		driver.switchTo().frame(framepath3);
		card_Expiry_year.sendKeys(expiryYear);
		driver.switchTo().defaultContent();
		
		wait.until(ExpectedConditions.visibilityOf(framepath4));
		driver.switchTo().frame(framepath4);
		this.ccv.sendKeys(ccv);
		driver.switchTo().defaultContent();
		
		

	}
	public void pay() {
		clickElement(proceed_to_pay);
	}

	public String cardErrormsg() {
		String actual = cardError.getText();
		return actual;
	}
	public String passErrormsg() {
		String actual = passlasterror.getText();
		return actual;
	}
	public String passlastErrormsg() {
		String actual = passlasterror.getText();
		return actual;
	}
}