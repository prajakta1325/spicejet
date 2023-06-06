package pages;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.BaseClass;

public class SignUpTC extends BaseClass{
	@Test
	public void TC001_signupValidCredential() throws Exception {

		SignUpElement sp = new SignUpElement();
		sp.signup("Prajakta", "ghule", "9822633402", "Harshalvarpe000@gmail.com","Harshpiyu@1325","Harshpiyu@1325");
		sp.logOut();
	}
@Test
	public void TC002_LogIn() throws Exception {

		SignUpElement sp = new SignUpElement();
		sp.logIn("9822633405", "Harshpiyu@1325");
		
		File src=sp.LoginSuccesful.getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\Users\\HP\\eclipse-workspace\\spiceJet\\Screenshot\\successfulLogin.png");		
		FileUtils.copyFile(src, target);
		
		System.out.println(driver.getTitle());
		Assert.assertEquals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets", driver.getTitle());
		sp.logOut();
	}
@Test
public void TC002_LogInInvalidMobile() throws Exception {

	SignUpElement sp = new SignUpElement();
	sp.logIn("123", "Harshpiyu@1325");
	
	File src=sp.mobileError.getScreenshotAs(OutputType.FILE);
	File target=new File("C:\\Users\\HP\\eclipse-workspace\\spiceJet\\Screenshot\\mobileErrorMsg.png");
	
	FileUtils.copyFile(src, target);
	
	Assert.assertEquals("Please enter a valid mobile number", sp.invalidMobie_no());
}

@Test
public void TC002_LogIn_No_Password() throws Exception {

	SignUpElement sp = new SignUpElement();
	sp.logIn("9822633405", "");
	Assert.assertEquals("Please enter a valid password", sp.noPassword());
}

@Test
public void TC003_forgotpassword() throws Exception {

	SignUpElement sp = new SignUpElement();
	sp.forgot();
	Assert.assertEquals("Please enter your mobile number to reset your password", sp.validate_forgotpass());
}
@Test
public void TC004_Logout() throws Exception {

	SignUpElement sp = new SignUpElement();
	sp.logOut();
	
}
}
