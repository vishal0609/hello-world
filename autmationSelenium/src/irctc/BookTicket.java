package irctc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class BookTicket{
	@Test
	@Parameters({"User","Password"})
	public void book(String User ,String Password){
		String path = "E:\\Mars workspace\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path );  
		WebDriver driver = new ChromeDriver();
		System.out.println(User+" "+Password);
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElement(By.id("usernameId")).sendKeys(User);
		driver.findElement(By.name("j_password")).sendKeys(Password);
		driver.findElement(By.id("loginbutton")).click();
		
	}
}
