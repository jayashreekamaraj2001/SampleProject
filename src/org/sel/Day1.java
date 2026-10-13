package org.sel;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
	
	public void java() {
		System.out.println("java");
	}
	public void css() {
		System.out.println("css");

	}
	public void JS() {
		System.out.println("JavaScript");

	}
	
	public void html() {
		System.out.println("HTML");
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.omrbranch.com/");
		
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("jayashreekamaraj2001@gmail.com");
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	//	js.executeScript("arguments[0].scrollIntoView(false);", element);
		
		@Nullable
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
	       @Nullable
		String title = driver.getTitle();
	       System.out.println(title);
	       
	       Day1 a = new Day1();
	       a.html();
	       a.JS();
	       
		
	}

}
