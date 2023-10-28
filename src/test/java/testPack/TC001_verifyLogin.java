package testPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomPack.LoginPOM;

public class TC001_verifyLogin extends BaseClass
{
	LoginPOM log;
	
	@BeforeClass
	public void beforeClass()
	{
		log = new LoginPOM(driver);
	}
	@BeforeMethod()
	public void beforeMethod()
	{
		
	}
	
	@Test(dataProvider = "demoAbData",dataProviderClass = testPack.DataProviderClass.class)
	public void verifyLogin(String un, String pd) throws InterruptedException
	{
		//logger = report.createTest("TC001_verifyingLogin");
		
		//SoftAssert s =new SoftAssert();
		
		log.sendUserName(un);
		
		log.sendPwd(pd);
		Thread.sleep(1000);
		
		log.clickLogIn();
		
		//String actualURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		//String expectedURL = driver.getCurrentUrl();
		
		
	//	Thread.sleep(1000);
		
//		s.assertEquals(actualURL, expectedURL);
		//logger.pass("TC001_verified");
		
//		s.assertAll();
	}
	
	@AfterClass
	public void afterClass()
	{
		driver.close();
	}
	
	
}
