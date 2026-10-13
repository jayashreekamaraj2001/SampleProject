package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques6 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://www.google.com");
		
		WebElement element = driver.findElement(By.id("APjFqb"));
		element.sendKeys("Greens Tech Chennai OMR Branch");
	}

}
