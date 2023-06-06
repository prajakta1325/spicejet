package pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.BaseClass;

public class SignUpElement extends BaseClass{

	@FindBy(xpath="(//div[@class='css-76zvg2 r-jwli3a r-ubezar'])[2]")
	WebElement Sign_Up;
	
	@FindBy(xpath="//select[@class='form-control form-select ']")
	WebElement suffix;
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='last_name']")
	WebElement lastName;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	WebElement DOB;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	WebElement year;
	
	@FindBy(xpath="//input[@id='dobDate']")
	WebElement datebox;
	
	@FindBy(xpath="//div[@class='react-datepicker__day react-datepicker__day--013']")
	WebElement date;
	
	@FindBy(xpath="//input[@class=' form-control']")
	WebElement phoneNo;
	
	@FindBy(xpath="//input[@id='email_id']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='new-password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='c-password']")
	WebElement re_password;
	
	@FindBy(xpath="//input[@class='form-check-input mt-02']")
	WebElement check;
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submit;
	
	//*********************************************Login******************************************************
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-jwli3a r-ubezar'])[1]")
	WebElement Home_LogIn;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-tmtnm0 r-oxtfae r-10paoce r-ymttw5 r-9qu9m4'])[1]")
	WebElement Mobileno;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-tmtnm0 r-oxtfae r-10paoce r-ymttw5 r-9qu9m4'])[2]")
	WebElement login_Password;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement Login;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73']")
	WebElement LoginSuccesful;
	
	//*****************************Error message*******************************
	
	@FindBy(xpath="//div[@class='css-76zvg2 r-1ttbpl1 r-18tvxmy r-1enofrn r-1bymd8e']")
	WebElement mobileError;
	
	
	@FindBy(xpath="//div[@class='css-76zvg2 r-1ttbpl1 r-18tvxmy r-1enofrn r-1bymd8e']")
	WebElement noPassword;
	
	//***********************Forgot password
	@FindBy(xpath="//div[@class='css-76zvg2 r-c20mna r-1b43r93']")
	WebElement forgot_Password;
	
	@FindBy(xpath="//div[@class='css-76zvg2 r-1862ga2 r-18tvxmy r-n6v787 r-1bymd8e']")
	WebElement validate_Forgot;
	
	//******************************** Log_Out***************************
	@FindBy(xpath="//div[@class='css-76zvg2 r-jwli3a r-ubezar r-1ozqkpa']")
	WebElement LogOutHome;
	
	@FindBy(xpath="//div[@class='css-76zvg2 r-homxoj']")
	WebElement logout;
	
	public SignUpElement() {
		PageFactory.initElements(driver, this);
	}
	
	public void signup(String fname, String lname, String phoneNo, String Email,String password,String re_password) throws Exception {
		clickElement(Sign_Up);
		
		Set<String> handles=driver.getWindowHandles();
		Iterator it=handles.iterator();
		String parentid=(String) it.next();
		String childid=(String) it.next();
		driver.switchTo().window(childid);
		
		Select sel=new Select(suffix);		
		sel.selectByValue("MISS");
		
		this.firstname.sendKeys(fname);
		this.lastName.sendKeys(lname);
		clickElement(datebox);
		clickElement(year);	
		Select sel1=new Select(year);		
		sel1.selectByValue("1997");		
		clickElement(date);
		
		this.phoneNo.sendKeys(phoneNo);	
		clickElement(email);

		email.sendKeys(Email);		
		this.password.sendKeys(password);

		this.re_password.sendKeys(re_password);
clickElement(check);
clickElement(submit);
		
//		clickElement(check);email.sendKeys(Email);	
//		clickElement(submit);
		
	}
	
	public void logIn(String mobileno, String Password) throws Exception {
		clickElement(Home_LogIn);		
		Mobileno.sendKeys(mobileno);		
		login_Password.sendKeys(Password);
		clickElement(Login);
		Thread.sleep(20000);
	}
	
	public void logOut() {
		clickElement(LogOutHome);	
		clickElement(logout);	
		
	}
	public void forgot() {
		clickElement(Home_LogIn);
		clickElement(forgot_Password);
		
	}
	
	public String validate_forgotpass() {
		String actual=validate_Forgot.getText();
		return actual;
	} 

	public String invalidMobie_no() {
		String actual=mobileError.getText();
		return actual;
	} 
	public String noPassword() {
		String actual=noPassword.getText();
		return actual;
	} 
}
