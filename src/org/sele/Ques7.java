package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques7 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.icicibank.com");
		
		WebElement element = driver.findElement(By.xpath("//div[@class='input-content']"));
		element.sendKeys("Education Loan");
	}

}
