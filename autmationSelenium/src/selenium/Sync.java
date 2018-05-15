package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sync {
	public static WebElement isElementPresent(WebDriver driver,String xpath,int time){
		WebElement ele = null; 
		for (int i=0; i<time/4;i++)
		{
		try{
			ele= driver.findElement(By.xpath(xpath));
			break;
		}catch(Exception e){
			try{
				Thread.sleep(250);
				
			}catch(InterruptedException e1){
				System.out.println("Wating for the eleement to appear");	
			}
		}	
		}
		return ele;
	}
	
}
