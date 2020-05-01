package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		//write into existing file and add values
		String filePath="/Users/lillygreen/eclipse-workspace/JavaBasics/configs/Example.properties";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Properties prop=new Properties();
		prop.load(fis);
		
		prop.setProperty("Gender", "Male");
		
		FileOutputStream output=new FileOutputStream(filePath);
		prop.store(output,"Added Additional key");
		
		

	}

}
