package testNgDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TestScript3 implements ITestListener{
	@Test
	public void testMethod(){
		String path = "E:\\Mars workspace\\IEDriverServer_Win32_3.3.0\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver",path );
		InternetExplorerDriver driver = new InternetExplorerDriver();
		 driver.get("http://www.facebook.com");
		 //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test started"+result.toString());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test succeded"+result.toString());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test failed"+result.toString());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
}
