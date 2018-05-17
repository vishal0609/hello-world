package selenium;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenShotUsingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path );
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("http://www.flipkart.com");
		 File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 System.out.println("Screenshot taken");
		 try {
			 FileUtils.copyFile(scr,new File ("Screenshot.png"));
		 }catch(IOException e) {
			 System.out.println(e.getMessage());
		 }
	}

}
