package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class User {
	
	  public void list() {
		  System.out.println("List");
	  }
	  public void jS() {
		  System.out.println("JavaScript");
	  }
       public static void main(String[] args) {
    	   WebDriver a = new ChromeDriver();
    	   a.get("https://www.omrbranch.com/");
    	   a.manage().window().maximize();
    	   
    	   WebElement element = a.findElement(By.name("email"));
    	   element.sendKeys("greenstechchennaiomr@gmail.com");
    	   
    	   WebElement element2 = a.findElement(By.id("pass"));
    	   element2.sendKeys("Greens@123");
	
}

}
