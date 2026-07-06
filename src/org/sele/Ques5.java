package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques5 {
	public static void main(String[] args) {
		WebDriver a = new ChromeDriver();
		a.get("https://netbanking.hdfcbank.com/netbanking/.");        //To find inspect another way is ctrl+shift+i --->if right click is not working
		
		WebElement element = a.findElement(By.id("username"));
		element.sendKeys("greensomrbranch");
		
		
	}

}
