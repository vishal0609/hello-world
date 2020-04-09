package stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Strings;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import dataFactory.ConfigDataProvider;

public class TestSteps {
	
	WebDriver driver;
	@Given("^All setup is ther$")
	public void all_setup_is_ther(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		System.out.println(data.get(0).get(0));
	    System.setProperty("webdriver.chrome.driver", ConfigDataProvider.getValue("chromepath"));
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    System.out.println("Setup Ready");
	}

	@Then("^GET google page$")
	public void get_google_page( DataTable arg2) throws Throwable {
		Map<String, String> data = arg2.asMap(String.class, String.class);
		int i=0;
		
		Set<String> set = data.keySet();
		for (String key :set) {
			i=i++;
	    driver.get(ConfigDataProvider.getValue("url"));
	    System.out.println("opening page"+data.get(key));
		}
}

}