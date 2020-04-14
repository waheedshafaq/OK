package com.GenericLibrary2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericClass2 {
	
	WebDriver driver;
	
	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/abdulwaheedshafaq/eclipse-workspace/WednesdayTesting/src/test/resources/driver/chromedriver");
		
		driver = new ChromeDriver();	
	}
	
	public void MaximizeBrowser(){
		driver.manage().window().maximize();
	}
public void getURL() {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
}
public void getUserName() {
	driver.findElement(By.xpath("//*[@name='email']")).sendKeys("wahid_shafaq2000@yahoo.com");	
}
public void getPassword() {
	
	driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("Ihateyasmin");
}
public void getLogIn() {
	driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
}
}
