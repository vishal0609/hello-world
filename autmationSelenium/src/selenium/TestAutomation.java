package selenium;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "E:\\Mars workspace\\IEDriverServer_Win32_3.3.0\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver",path );
		InternetExplorerDriver driver = new InternetExplorerDriver();
		 driver.get("http://www.google.com");
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.findElementByName("q").sendKeys("News"+Keys.ENTER);
		 //driver.findElementByName("btnK").click();
		 driver.close();
		 
	}

}
