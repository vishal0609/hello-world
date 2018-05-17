package selenium;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


public class ScreenShotEntirePage {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		String path = "chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path );
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("http://www.flipkart.com");
		 Robot rob = new Robot();
		 rob.keyPress(KeyEvent.VK_ESCAPE);
		 rob.keyRelease(KeyEvent.VK_ESCAPE);
		 
		 Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	     
		 System.out.println("Screenshot taken");
		 try {
			 ImageIO.write(fpScreenshot.getImage(),"PNG",new File("FullPageScreenshot.png"));
		 }catch(IOException e) {
			 System.out.println(e.getMessage());
		 }
	}

}
