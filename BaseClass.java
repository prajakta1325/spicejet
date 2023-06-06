package utility;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass extends Utils{
	@BeforeTest
	public void start() throws Exception {
		
		browserLaunch(getpropvalue("browser"));
		launchUrl(getpropvalue("url"));
		
		
		}
		/*else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
			
	}*/
//	@BeforeMethod
//	public void logIn() {
//		
//	}
//	@AfterMethod
//	public void logOut() {
//		
//	}
	
	
	@AfterTest
	public void closeUp() {
		//driver.quit();
		
	}
}

