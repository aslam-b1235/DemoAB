package testPack;

import org.testng.annotations.DataProvider;

public class DataProviderClass 
{
	@DataProvider(name = "demoAbData")
	public String[][] userCredentials()
	{
		String data[][]= {{"ADMIN","ADMIN123"},{"Admin","ADMIN123"},{"Admin","admin123"}};
		return data;
	}
}
