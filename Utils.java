package utility;

import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utils {
	public static WebDriver driver;

	// ***************************************GetData from config.properties file
	public static String getpropvalue(String key) {
		String value = null;
		try {
			Properties prop = new Properties();
			// File file=new
			// File("C:\\Users\\HP\\eclipse-workspace\\StackOverFlow\\config.properties");
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "//config.properties");
			prop.load(ip);
			value = prop.getProperty(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	// ******************************************************************Browser
	// Launch
	public static void browserLaunch(String name) {

		switch (name) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "FireFox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			WebDriverManager.chromedriver().setup();

			System.out.println("No valid options given choosing the default browser");
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}

	// *************************************************************Launch the url
	public static void launchUrl(String url) throws Exception {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

	}

	/*
	 * dropdown method creation and exicution
	 * 
	 * public void dropDownSelectByValue(WebElement element, String value){ Select
	 * sel=new Select(element); sel.SelectByValue(value);
	 * 
	 */
	// ******************************************************Check for element
	// availability
	public void waitforme(WebElement element) {

		try {

			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOf(element));
			wait.until(ExpectedConditions.elementToBeClickable(element));
			// test.log(Status.PASS, id + "is available");

		} catch (Exception e) {
			System.out.println("Error occured while waiting for the element :" + "with exception " + e.getMessage());
			// test.log(Status.FAIL, id + "is not available");

		}

	}

	// Click a Web Element

	public void clickElement(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOf(element));

			element.click();
			// test.log(Status.PASS, id + "is clicked ");

		} catch (Exception e) {
			System.out.println("Error in clicking the webelement :" + e.getMessage());
			// test.log(Status.FAIL, "Failed to click the element :" + id);
		}

	}

	// mouseOver

	public void mouseOver(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}

	// MouseClick

	public void mouseClick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}
}
