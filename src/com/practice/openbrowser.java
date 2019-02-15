package com.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class openbrowser {

	public static void main(String[] args) {
		String Key="webdriver.chrome.driver";
		String value="C:\\Users\\pavithra\\Desktop\\selenium\\chromedriver.exe";
	        System.setProperty(Key, value); 
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.freecrm.com/index.cfm?CFID=2247298&CFTOKEN=16439885&jsessionid=9c30970d8f319db871a0595c4b1a50a193c6");
		
		d.findElement(By.name("proceed")).click();
		Alert a=d.switchTo().alert();
		System.out.println(a.getText()                                                                                                                     );
		//a.accept();
		a.dismiss();
		
		//WebElement f=d.findElement(By.xpath("//*[frameborder=\"0\"]"));
		//d.switchTo().frame(1);
		//d.findElement(By.name("EMAIL")).sendKeys("pavithra");;
		//d.findElement(By.id("onesignal-popover-cancel-button")).click();
		//Alert a=d.switchTo().alert();
		//a.dismiss();
		
		// TODO Auto-generated method stub

	}

}
