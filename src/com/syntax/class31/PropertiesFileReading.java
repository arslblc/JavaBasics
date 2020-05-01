package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {

	public static void main(String[] args) throws IOException {
		//to read the file
		//we need file
		
		
		String filePath="/Users/lillygreen/eclipse-workspace/JavaBasics/configs/Example.properties";
		
		//bring object of fileInput Stream
		FileInputStream fileInput=new FileInputStream(filePath);
		
		//to handle data from properties files we need property class
		
		Properties prop=new Properties();
		prop.load(fileInput);
		String name=prop.getProperty("name");
		System.out.println(name);	
		String LastName=prop.getProperty("LastName");
		System.out.println(LastName);
		
		Set<Object> keys=prop.keySet();
		for(Object k:keys) {
			System.out.println(k);
		}
		
				
		
		
		
		
		

	}

}
