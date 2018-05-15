package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FaceookLoginRobot {

	public static void main(String[] args) throws AWTException, Exception {
		// TODO Auto-generated method stub
		String path = "E:\\Mars workspace\\IEDriverServer_Win32_3.3.0\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver",path );
		InternetExplorerDriver driver = new InternetExplorerDriver();
		 driver.get("http://www.facebook.com");
		 //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 int count=0;
		 while(driver.findElements(By.id("noid")).size()<=0){
			 if (count>4)
				 break;
			 Thread.sleep(200);
			 count++;
			 
			 continue;
		 }
		 if (driver.findElements(By.id("noid")).size()<=0)
			 System.out.println("Element not present");
		 Sync.isElementPresent(driver, "//*[@id='email']", 10).sendKeys("vishurocks43@yahoo.com");
		 Sync.isElementPresent(driver, "//*[@id='pass']", 10).sendKeys("Vishukriti*4393");
		 Robot rob1 = new Robot();
		 rob1.keyPress(KeyEvent.VK_ENTER);
		 rob1.keyRelease(KeyEvent.VK_ENTER);
	}

}
