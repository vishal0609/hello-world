package testNgDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestScript2 {
	
	@Test
	
	@Parameters("Browser")
	public void testRun(String Browser) throws Exception{
		if (Browser.equalsIgnoreCase("FF")){
			String path = "E:\\Mars workspace\\geckodriver.exe";
			//System.setProperty("webdriver.firefox.marionette",path );
			System.setProperty("webdriver.gecko.driver",path ); 
			//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			//capabilities.setCapability("marionette", true);
			WebDriver driver = new FirefoxDriver();
			driver.get("http://www.facebook.com");
	 
			Thread.sleep(5000);
					
		}
		else if(Browser.equalsIgnoreCase("IE")){
			String path = "E:\\Mars workspace\\IEDriverServer_Win32_3.3.0\\IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver",path ); 
			//System.setProperty("webdriver.ie.driver", "./server/IEDriverServer.exe");
			 
			WebDriver driver=new InternetExplorerDriver();
			 
			driver.manage().window().maximize();
			 
			driver.get("http://www.facebook.com");
			 
			driver.quit();
		
			}
		else if(Browser.equalsIgnoreCase("CH")){
			String path = "E:\\Mars workspace\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",path ); 
			//System.setProperty("webdriver.ie.driver", "./server/IEDriverServer.exe");
			 
			WebDriver driver=new ChromeDriver();
			 
			driver.manage().window().maximize();
			 
			driver.get("http://www.facebook.com");
			 
			driver.quit();

	} 
}
}
