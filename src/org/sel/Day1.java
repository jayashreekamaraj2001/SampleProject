package org.sel;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
	
	public void java() {
		System.out.println("java");
	}
	public void css() {
		System.out.println("css");

	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.omrbranch.com/");
		@Nullable
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
	       @Nullable
		String title = driver.getTitle();
	       System.out.println(title);
		
	}

}
