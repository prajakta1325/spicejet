package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.BaseClass;

public class ValidateFiled_TC extends BaseClass{
@Test
public void tc001_Validation() {
	ValidateFiled_Element vfe=new ValidateFiled_Element();
	Assert.assertEquals(true, vfe.check_in.isDisplayed());
	System.out.println("Check in button is present ");
	Assert.assertEquals(true, vfe.flight_Status.isDisplayed());
	System.out.println("flight status is present ");
	Assert.assertEquals(true, vfe.manage_booking.isDisplayed());
	System.out.println("manage booking is present ");
	
}
@Test
public void tc002_ValidateClick() throws Exception {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File target=new File("C:\\Users\\HP\\eclipse-workspace\\spiceJet\\Screenshot\\homepage.png");
	
	FileUtils.copyFile(src, target);
	
	ValidateFiled_Element vfe=new ValidateFiled_Element();
	vfe.validate();
}

}
