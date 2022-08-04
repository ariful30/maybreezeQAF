package com.careerhack.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver;
		 
		 WebDriverManager.chromiumdriver().setup();
			
			driver = new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/dropdown");
			
			driver.manage().window().maximize();

			WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']")); 
			Select s = new Select (dropdown);  
			
			s.selectByIndex(1); 
			Thread.sleep(3000); 
			s.selectByVisibleText("Option 2");
			Thread.sleep(3000); 
			s.selectByValue("1"); 
			
			
			
			
			
			//select  by index number
			//select by visible text 
			//select by value
			
			
	}

}
