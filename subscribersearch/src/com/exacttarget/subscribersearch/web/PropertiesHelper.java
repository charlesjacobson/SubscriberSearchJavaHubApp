package com.exacttarget.subscribersearch.web;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHelper {
	
	private static final String APP_PROPERTIES_PATH = "/app.properties";
	
	private static Properties APP_PROPS; 
	
	static {
		
		try {
			APP_PROPS = new Properties();			
			APP_PROPS.load(PropertiesHelper.class.getResourceAsStream(APP_PROPERTIES_PATH));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String getAppProperty(String key) {
		return APP_PROPS.getProperty(key);
	}

}
