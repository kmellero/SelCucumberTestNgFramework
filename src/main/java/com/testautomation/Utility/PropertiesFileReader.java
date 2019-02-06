package com.testautomation.Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFileReader {

	 public Properties getProperty() {
		 
		 Properties properties = new Properties();
		 try {
	//		 properties.load(new FileInputStream("C:\\Users\\kajetanmellerowicz\\eclipse-workspace\\SelCucumberTestNgFramework\\src\\main\\resources\\browser-config.properties"));   //"C:\\Users\\Hp\\eclipse-workspace\\SeleniumCucumberBDDFramework\\resources\\browser-config.properties"));
			 properties.load(new FileInputStream("src\\main\\resources\\browser-config.properties"));
		 } catch (Exception e) {
			System.out.println("Exception: " + e);
		}
		 return properties;
	 }
}
