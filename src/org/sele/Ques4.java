package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques4 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		WebElement element = driver.findElement(By.name("email"));
		element.sendKeys("velmurugansirgtomr");
		
		WebElement element2 = driver.findElement(By.name("pass"));
		element2.sendKeys("Greens@123");
		
	}

}
