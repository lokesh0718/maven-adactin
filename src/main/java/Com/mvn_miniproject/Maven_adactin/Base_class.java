package Com.mvn_miniproject.Maven_adactin;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Base_class {
	public static WebDriver driver;

	public static WebDriver systemproperty(String types) {
		if (types.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//driver//chromedriver.exe");

			driver = new ChromeDriver();

		} else if (types.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//driver//geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (types.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "//driver//iedriver.exe");

			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void url(String url) {
		driver.get(url);
	}

	public static void sleepmethod(long mills) throws InterruptedException {
		Thread.sleep(mills);
	}

	public static void input(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void click(WebElement clickoption) {

		clickoption.click();
	}

	public static void selectvisibletext(WebElement element, String value) {

		Select s = new Select(element);
		s.selectByVisibleText(value);
	}

	public static void javascript_method(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000);");
	}

	public static void screenshotmethod() throws IOException {

		TakesScreenshot tt = (TakesScreenshot) driver;
		File dd = tt.getScreenshotAs(OutputType.FILE);

		File s = new File("C:\\Users\\Lokesh M\\eclipse-workspace\\miniproject\\screenshots\\adactin.png");

		FileHandler.copy(dd, s);

	}

	public static void close() {
		driver.close();
	}

}
