package com.practice;

import java.io.IOException;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deadlinks {
	
	public static void main(String args[]) throws MalformedURLException, IOException {
		String Key="webdriver.chrome.driver";
		String value="C:\\Users\\pavithra\\Desktop\\selenium\\chromedriver.exe";
	        System.setProperty(Key, value); 
	        ChromeDriver d= new ChromeDriver();
	        d.get("https://classic.crmpro.com/login.cfm");
	        d.findElement(By.name("username")).sendKeys("m123nandu@gmail.com");
	        d.findElement(By.name("password")).sendKeys("Test@123");
	        d.findElement(By.xpath("//input[@type='submit']")).submit();
	        d.findElement(By.name("username")).sendKeys("pinkyp");
	        d.findElement(By.name("password")).sendKeys("Test@123");
	        d.findElement(By.xpath("//input[@type='submit']")).submit();
	        d.switchTo().frame("mainpanel");
	        
	        List <WebElement> Linklist= d.findElements(By.tagName("a"));
	        Linklist.addAll(d.findElements(By.tagName("img")));
	        System.out.println("size of active and inactive links"+ Linklist.size());
	        List <WebElement> activelist= new ArrayList<WebElement>();
	        for(int i=0; i<Linklist.size(); i++) {
	        	if(Linklist.get(i).getAttribute("href")!=null) {
	        		activelist.add(Linklist.get(i));
	        		
	        	}
	        }
	        
	        System.out.println("size of active links"+ activelist.size());
	        for(int j=0;j<activelist.size();j++) {
	        	HttpURLConnection connection= (HttpURLConnection)new URL(activelist.get(j).getAttribute("href")).openConnection();
	        	connection.connect();
	        	String response=connection.getResponseMessage();
	        	connection.disconnect();
	        	System.out.println(activelist.get(j).getAttribute("href")+"----->"+response);
	        			
	        }
	}

}
