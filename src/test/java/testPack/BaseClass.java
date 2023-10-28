package testPack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import testUtility.DemoPropertiesClass;

import testUtility.StaticBrowser;

public class BaseClass 
	{	static WebDriver driver;
	public static ExtentReports report;
	public static ExtentHtmlReporter extents;
	public static ExtentTest logger;
	@Parameters({"browser"})
	
	@BeforeTest
	public void setUp(String browser)throws IOException
	{
		driver = StaticBrowser.launchBrowser(browser, DemoPropertiesClass.readPropertyData("url"));
		
		report = new ExtentReports();
		
		extents = new ExtentHtmlReporter("test-output//Report/"+System.currentTimeMillis()+".html");
		
		report.attachReporter(extents);
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
}