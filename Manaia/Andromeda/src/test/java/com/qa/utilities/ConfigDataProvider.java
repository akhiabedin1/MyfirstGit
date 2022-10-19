package com.qa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	Properties prop; 
	
	public ConfigDataProvider () {

		
		 File src = new File ("./Config/config.properties"); 
		 
		 try {
			FileInputStream fis = new FileInputStream (src); 
			 prop = new Properties(); 
			 prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
			System.out.println("Unable to read config file");
}

	}
}