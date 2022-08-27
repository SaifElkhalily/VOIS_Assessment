package main;

import org.openqa.selenium.By;

import tests.BaseTest;

public class MyAccountPage {
	
	public String signInAlertMssg() {
		return BaseTest.getWebDriver().findElement(By.className("info-account")).getText();
	}

}
