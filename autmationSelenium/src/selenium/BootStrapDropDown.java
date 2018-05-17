package selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class BootStrapDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path );
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("http://www.goibibo.com");
		 driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		 driver.switchTo().frame("authiframe");
		 driver.findElement(By.xpath("//input[@id='authMobile']")).sendKeys("9765797974");
	}

}
