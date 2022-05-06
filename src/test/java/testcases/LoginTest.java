package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseTest;

public class LoginTest extends BaseTest {

	//@Parameters({"url", "email", "password" })
	@Test
	public void launchWebapp() {

		driver.get("https://google.com");
	}

	@Test
	public void signin() {

		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("email");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("password"); 
		driver.findElement(By.linkText("submit")).click();
//testing
	}

}
