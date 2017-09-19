package comdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Browser {

	public static WebDriver getBrowser(String browser) {

		WebDriver driver = null;

		switch (browser.charAt(0)) {
		case 'c': {
			// System.setProperty("webdriver.chrome.driver",Configuration.chromeDriverLocation);
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			break;
		}

		case 'f': {

			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			break;
		}

		case 'i': {

			// Create object of DesiredCapabilities class
			DesiredCapabilities cap = DesiredCapabilities.internetExplorer();

			// Set ACCEPT_SSL_CERTS variable to true
			cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			//System.setProperty("webdriver.ie.driver", Configuration.ieDriverLocation);
			 cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			driver = new InternetExplorerDriver(cap);
			driver.manage().deleteAllCookies();
			break;
		}
		}
		return driver;

	}
	// Description: Used to navigate
	// Parameter1:Url(url of page that you want to hit on browser)
	// Parameter2: driver(WebDriver instance)

	public static void navigate(String url, WebDriver driver) {
		driver.navigate().to(url);
	}

	// Description: Used to navigate
	// Parameter1:Url(url of page that you want to hit on browser)
	// Parameter2: driver(WebDriver instance)
	public static void get(String url, WebDriver driver) {
		driver.get(url);
	}

	// Description: Used to perform browser back operation
	// Parameter: driver(WebDriver instance)
	public static void back(WebDriver driver) {
		driver.navigate().back();
	}

	// Description: Used to perform browser forward operation
	// Parameter: driver(WebDriver instance)
	public static void forward(WebDriver driver) {
		driver.navigate().forward();
	}

	// Description: Used to perform browser refresh operation
	// Parameter: driver(WebDriver instance)
	public static void refresh(WebDriver driver) {
		driver.navigate().refresh();
	}

	// Description: Used to get current page URL.
	// Parameter: driver(WebDriver instance)
	public static String getCurrentPageUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}

}