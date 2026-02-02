package com.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LoginTest {

	 @Test
	    public void loginTest() {
	        // Headless mode for CI/CD
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--headless");
	        options.addArguments("--no-sandbox");
	        options.addArguments("--disable-dev-shm-usage");

	        WebDriver driver = new ChromeDriver(options);

	        driver.get("https://example.com/login");

	        driver.findElement(By.id("username")).sendKeys("testuser");
	        driver.findElement(By.id("password")).sendKeys("test123");
	        driver.findElement(By.id("loginBtn")).click();

	        driver.quit();
	    }
}
