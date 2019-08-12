package com.vytrack.utilities;

import java.io.*;
import java.util.Properties;

public class ConfigurationReader {
	private static Properties configFile;
	
	static {
		String path ="Configuration.properties";
		try {
			FileInputStream inputStream = new FileInputStream(path);
			configFile = new Properties();
			configFile.load(inputStream);
			inputStream.close();
			
		} catch (IOException e) {
			System.out.println("Path not found");
			e.printStackTrace();
		}
		
		
		
	}
	public static String get(String key){
		return configFile.getProperty(key);
	}
	
}
