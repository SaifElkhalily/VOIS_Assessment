package main;

import org.openqa.selenium.By;

import tests.BaseTest;

public class HomePage {
	
	public void clickOnSignIn() {
		BaseTest.getWebDriver().findElement(By.className("login")).click();
	}

}
