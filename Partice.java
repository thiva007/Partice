package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Partice {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys("welcome");
		WebElement findElement2 = driver.findElement(By.id("pass"));
		findElement2.sendKeys("test");
		driver.findElement(By.name("login")).click();

	}

}
