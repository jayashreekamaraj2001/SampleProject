package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques8 {
	public static void main(String[] args) {
		WebDriver a = new ChromeDriver();
		a.get("https://www.redbus.in");
		
		//check the div folder if there is a hidden element is present or not, then go with xpath
		WebElement element = a.findElement(By.id("srcinput"));
		element.sendKeys("Bangalore");
		
		WebElement element2 = a.findElement(By.id("destinput"));
		element2.sendKeys("Chennai");
	}

}
