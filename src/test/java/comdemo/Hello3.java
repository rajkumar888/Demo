package comdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Hello3 extends Browser {

	@Test
	public void test001()
	{
		getBrowser("chrome");
		getBrowser("firefox");
		getBrowser("ieexplorer");
		
		
		//driver.get("https://www.google.com");
		
		
	}
}
