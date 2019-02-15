package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class htmlunit {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pavithra\\Desktop\\selenium\\chromedriver.exe");
	
	WebDriver driver=new HtmlUnitDriver();
	
	driver.get("https://www.freecrm.com/");
	System.out.println("Before"+ driver.getCurrentUrl());
	driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("pinkyp");
	driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Test@123");
	driver.findElement(By.className("btn btn-small")).submit();
	System.out.println("After"+ driver.getCurrentUrl());
	}

}
