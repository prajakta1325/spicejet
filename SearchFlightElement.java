package pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.BaseClass;

public class SearchFlightElement extends BaseClass {
	String DeptCity = "Bagdogra";
	String ArrivalCity = "Jaipur";
	String name = "Students";

	@FindBy(xpath = "//div[@data-testid='one-way-radio-button']")
	WebElement returna;

	@FindBy(xpath = "//div[@data-testid='one-way-radio-button']")
	WebElement oneWay;
	
	@FindBy(xpath = "//div[text()='From']")
	WebElement dept_From_Textbox;

	@FindBy(xpath = "//div[text()='To']")
	WebElement to_Textbox;

	@FindBy(xpath = "//div[text()='Departure Date']")
	WebElement dept_Date;

	@FindBy(xpath = "(//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41'])[150]")
	WebElement date_pic;

	@FindBy(xpath = "(//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41'])[200]")
	WebElement return_date_pic;
	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1d09ksm r-1inuy60 r-m611by']")
	WebElement footer;

	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement submitButton;

	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1tf5bf9 r-1777fci r-1ww30s9']")
	WebElement stud_checkbox;

	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement stud_checkbox_Continue;
	
	@FindBy(xpath = "//div[text()='Select Date']")
	WebElement return_date;

	public SearchFlightElement() {
		PageFactory.initElements(driver, this);

	}

	public void list() {
		clickElement(dept_From_Textbox);
		List<WebElement> From_Textbox = driver
				.findElements(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']"));
		for (int i = 0; i < From_Textbox.size(); i++) {
			WebElement City = From_Textbox.get(i);
			String cityName = City.getText();
			// System.out.println(cityName);
			if (cityName.contains(DeptCity)) {
				clickElement(City);
				break;
			}
		}

	}

	public void tolist() throws Exception {
		clickElement(to_Textbox);

		List<WebElement> totextBox = driver
				.findElements(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']"));
		for (int i = 0; i < totextBox.size(); i++) {
			WebElement City = totextBox.get(i);
			String cityName = City.getText();
			// System.out.println(cityName);
			if (cityName.contains(ArrivalCity)) {
				clickElement(City);
				break;

			}
		}
		Thread.sleep(2000);
		clickElement(date_pic);
		clickElement(footer);
		List<WebElement> radiobutton = driver.findElements(
				By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-15d164r r-1otgn73']"));
		for (int i = 0; i < radiobutton.size(); i++) {
			WebElement footer = radiobutton.get(i);
			String footername = footer.getText();
			// System.out.println(cityName);
			if (footername.contains(name)) {
				clickElement(footer);
				break;
			}
		}
		clickElement(submitButton);
		clickElement(stud_checkbox);
		clickElement(stud_checkbox_Continue);
	}

//*************************************************************ROUND TRIP***************************************
	public void roundTrip() throws Exception {
		clickElement(returna);

		clickElement(dept_From_Textbox);
		List<WebElement> From_Textbox = driver
				.findElements(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']"));
		for (int i = 0; i < From_Textbox.size(); i++) {
			WebElement City = From_Textbox.get(i);
			String cityName = City.getText();
			// System.out.println(cityName);
			if (cityName.contains(DeptCity)) {
				clickElement(City);
				break;
				}
		}
	}
public void toRoundTrip() throws InterruptedException {
	
		clickElement(to_Textbox);
		List<WebElement> totextBox = driver
				.findElements(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']"));
		for (int i = 0; i < totextBox.size(); i++) {
			WebElement City = totextBox.get(i);
			String cityName = City.getText();
			// System.out.println(cityName);
			if (cityName.contains(ArrivalCity)) {
				clickElement(City);
				break;
			}
		}
		Thread.sleep(2000);
		clickElement(date_pic);
		
		clickElement(return_date_pic);
		
	
		clickElement(submitButton);
		clickElement(stud_checkbox);
		clickElement(stud_checkbox_Continue);
	}
}
//	public void Datepicker() {
//		clickElement(footer);
//		List<WebElement> radiobutton = driver
//				.findElements(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-15d164r r-1otgn73']"));
//		for (int i = 0; i < radiobutton.size(); i++) {
//			WebElement City = radiobutton.get(i);
//			String cityName = City.getText();
//			System.out.println(cityName);
//			if (cityName.contains(name)) {
//				clickElement(City);
//				break;
//			}
//		}
//		clickElement(submitButton);
//	}
