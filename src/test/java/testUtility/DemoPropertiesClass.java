package testUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DemoPropertiesClass 
{
	public static String readPropertyData(String key) throws IOException
	{
		FileInputStream myFile = new FileInputStream("C:\\Users\\aslam\\eclipse-workspace\\DemoAB\\testData.properties");
		
		Properties prop = new Properties();
		prop.load(myFile);
		
		String value = prop.getProperty(key);
		
		System.out.println(value);
		
		return value;
		
	}
}
