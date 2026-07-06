package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		
		WebElement element = driver.findElement(By.id("first_name"));
		element.sendKeys("GreensTech");
		
		WebElement element2 = driver.findElement(By.id("last_name"));
		element2.sendKeys("OMR");
		
		WebElement element3 = driver.findElement(By.xpath("//textarea[@class='form-control address']"));
		element3.sendKeys("ICICI Bank Upstairs,Balamurugan Garden,Plot No.19,Landmark;opposite to sangeetha hotel,okkiam,Chennai,TamilNadu 600097");
		
		WebElement element4 = driver.findElement(By.id("email"));
		element4.sendKeys("greenstechchennaiomr@gmail.com");
		
		WebElement element5 = driver.findElement(By.id("phone"));
		element5.sendKeys("9944152058");
		
		WebElement element6 = driver.findElement(By.id("password"));
		element6.sendKeys("Greens@123");
		
		WebElement element7 = driver.findElement(By.id("confirm-password"));
		element7.sendKeys("Greens@123");
	}

}
