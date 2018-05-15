package testNgDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestScript4 {
	WebDriver driver;
	@Test(enabled = false)
	public void testRun() throws AWTException, InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		/*
		driver.get("http://store.demoqa.com/");
		 
        WebElement element = driver.findElement(By.linkText("Product Category"));
 
        Actions action = new Actions(driver);
 
        action.moveToElement(element).build().perform();
 
        driver.findElement(By.linkText("iPads")).click();*/
		
		driver.get("http://www.flipkart.com/");
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		
		 WebElement element = driver.findElement(By.linkText("Sports, Books & More"));
		 
	     Actions action = new Actions(driver);
	 
	     action.moveToElement(element).perform();
	     
	     //Thread.sleep(5000); 
	     
	     WebDriverWait wait = new WebDriverWait(driver, 10);
	     WebElement subElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Cricket")));
	     
	     
	    // Assert.assertTrue((driver.findElement(By.linkText("Cricket")).isDisplayed()));
	    // WebElement subElement = driver.findElement(By.linkText("Cricket"));
	     action.moveToElement(subElement);
	     action.click();
	     //action.contextClick();
	     action.perform();
		

	}
	
	@Test(enabled = false)
	
	public void runtest() throws AWTException {
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		driver.get("http://www.flipkart.com/");
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		
		WebElement element = driver.findElement(By.xpath("//img[contains(@src,'https://rukminim1.flixcart.com/flap/50/50/image/4722da.jpg?q=50')]"));
				
				
		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		je.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	
	
	@Test
	
	public void testPratice() {
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("https://www.ultimateqa.com/automation/");
		WebElement element = driver.findElement(By.xpath("//*[@class='thrv_wrapper thrv_icon tcb-icon-display tve_evt_manager_listen tve_et_click tve_ea_thrive_leads_form_close']"));
		element.click();
		//*[@class='thrv_wrapper thrv_icon tcb-icon-display tve_evt_manager_listen tve_et_click tve_ea_thrive_leads_form_close']
	}
	@BeforeTest
	public void beforeTest() {
		String path = "E:\\Mars workspace\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path );
		//System.setProperty("webdriver.ie.driver", "./server/IEDriverServer.exe");
		 
		driver=new ChromeDriver();
		 
		driver.manage().window().maximize();
		
		 

	}
	@AfterTest
	public void afterTest() {
		//driver.close();
	}
}
