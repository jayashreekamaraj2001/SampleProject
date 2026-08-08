package org.sel;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {
	public static void main(String[] args) {
		WebDriver a = new ChromeDriver();
		a.manage().window().maximize();
//		a.get("https://www.traininginomr.co.in/");
//		
//		@Nullable
//		String title = a.getTitle();
//		System.out.println(title);
//		
//		@Nullable
//		String currentUrl = a.getCurrentUrl();
//		System.out.println(currentUrl);
		
		a.get("https://greenstech.in");
		
		@Nullable
		String title = a.getTitle();
		System.out.println(title);
		
		@Nullable
		String currentUrl = a.getCurrentUrl();
		System.out.println(currentUrl);
		
		
	}

}
