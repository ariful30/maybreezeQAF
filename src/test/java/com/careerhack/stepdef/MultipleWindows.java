package com.careerhack.stepdef;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindows {

	public static void main(String[] args) {
		WebDriver driver;
		 
		 WebDriverManager.chromiumdriver().setup();
			
			driver = new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/windows");
			
			driver.manage().window().maximize();
			
			
			WebElement newwindow = driver.findElement(By.xpath("//a[text()='Click Here']"));
			
			newwindow.click(); 
			newwindow.click();
			newwindow.click();
			
			Set<String> allWindows = driver.getWindowHandles(); 
			System.out.println(allWindows);
	}

}
