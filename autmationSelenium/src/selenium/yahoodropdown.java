package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class yahoodropdown {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "E:\\Mars workspace\\IEDriverServer_Win32_3.3.0\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver",path );
		InternetExplorerDriver driver = new InternetExplorerDriver();
		 driver.get("http://www.msn.com/en-in/?ocid=iehp&pc=EUPP_");
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 //driver.findElementByName("q").sendKeys("News"+Keys.ENTER);
		 //driver.findElementById("settings");
		 driver.findElement(By.xpath("//*[@id='sb_form_go']")).click();
		// driver.findElementById("usermenu-feedback").click();
		 driver.close();
		 
	}

}

