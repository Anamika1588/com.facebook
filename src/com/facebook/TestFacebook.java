package com.facebook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFacebook {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	
	    
        Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("/Users/raian/eclipse-workspace/FacebookTesting/src/com/facebook/config.properties");
		
		prop.load(ip);
		
		String uRL = prop.getProperty("URL");
		String xpemail = prop.getProperty("xpath_of_email_id");
		String xppass = prop.getProperty("xpath_of_password");
		String User_name = prop.getProperty("username");
		String Pwd = prop.getProperty("password");
		String xLOGin = prop.getProperty("xpath_of_login");
		
	
		driver.get(uRL);
		
		driver.findElement(By.xpath(xpemail)).sendKeys(User_name);
		
		driver.findElement(By.xpath(xppass)).sendKeys(Pwd);
		
		
		driver.findElement(By.xpath(xLOGin)).click();
		
		
		
		System.out.println("pass"); 
		
		driver.quit();
		

	}

}
