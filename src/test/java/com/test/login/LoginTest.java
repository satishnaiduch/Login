package com.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

	 @Test
	    public void loginTest() {
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--headless");
		 options.addArguments("--no-sandbox");
		 options.addArguments("--disable-dev-shm-usage");

		 WebDriver driver = new ChromeDriver(options);
	        //WebDriver driver = new ChromeDriver();

	        driver.get("https://the-internet.herokuapp.com/login");

	        driver.findElement(By.id("username")).sendKeys("tomsmith");
	        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	        driver.findElement(By.cssSelector("button[type='submit']")).click();

	        driver.quit();
	    }

}
