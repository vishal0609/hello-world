package dataFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
	public static String getValue(String key) {
		Properties prop = new Properties();
		FileInputStream fis;
		String value;;
		try {
			
			fis = new FileInputStream(".//Config//ConfigFile.properties");
			prop.load(fis);
			
		} catch (FileNotFoundException e) {
			System.out.println("Excpetion is "+e.getMessage());
		} catch (IOException e) {
			System.out.println("Excpetion is "+e.getMessage());
		}
		
		value= prop.getProperty(key);
		System.out.println(value);
		return value;
	}
}
