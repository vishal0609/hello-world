package testNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
	
	@Test(dataProvider="testdata")
	void TestFacebook(String uname, String passwd) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("http://www.yahoo.com");
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign in")));
		element.click();
		
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-username")));
		element.sendKeys(uname);
		driver.findElement(By.id("login-signin")).submit();
		
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-passwd")));
		element.sendKeys(passwd);
		driver.findElement(By.id("login-signin")).submit();
		
	}
	
	@DataProvider
	public Object[][]testdata(){
		Object [][] ret = new Object [2][2];
		ret[0][0]= "vishurocks43@yahoo.com";
		ret[0][1]="password";
		ret[1][0]= "vishurocks4393@yahoo.com";
		ret[1][1]="password2";
		return ret;	
	}
}
