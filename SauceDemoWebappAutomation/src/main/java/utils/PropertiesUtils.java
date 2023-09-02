package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtils {

	public static Properties readProperties(String path) {
		Properties prop = new Properties();
		try {

			prop.load(new FileInputStream(new File(path)));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return prop;
	}

	public static Properties getGlobalProperties() {
		return readProperties(System.getProperty("user.dir") + "\\config\\global.properties");
	}
	
	
	public static Properties getEnvProperties() {
		Properties global = getGlobalProperties();
		String activeEnv = global.getProperty("env");
		return readProperties(System.getProperty("user.dir") + "\\config\\env\\"+activeEnv+".properties");
		
	}

}
