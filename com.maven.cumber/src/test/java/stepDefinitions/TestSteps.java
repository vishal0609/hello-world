package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import dataFactory.ConfigDataProvider;

public class TestSteps {
	
	WebDriver driver;
	@Given("^All setup is ther$")
	public void all_setup_is_ther() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", ConfigDataProvider.getValue("chromepath"));
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	}

	@Then("^GET google page$")
	public void get_google_page() throws Throwable {
	    driver.get(ConfigDataProvider.getValue("url"));
}

}