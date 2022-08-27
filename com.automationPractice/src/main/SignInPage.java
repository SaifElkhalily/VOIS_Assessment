package main;

import org.openqa.selenium.By;

import tests.BaseTest;

public class SignInPage {
	
	//SignIn
	public void fillEmailField() {
		BaseTest.getWebDriver().findElement(By.id("email")).sendKeys("dummy01@hotmail.com"); // This is already an existing email and password .. They could be changed easily for the new email and password of the new created account
	}  
	public void fillPasswordField() {
		BaseTest.getWebDriver().findElement(By.id("passwd")).sendKeys("12345s");
	}
	public void clickOnSignInButton() {
		BaseTest.getWebDriver().findElement(By.id("SubmitLogin")).click();
	}
	
	//SignUp
	public void fillRegistrationEmailField () {
		BaseTest.getWebDriver().findElement(By.id("email_create")).sendKeys("dummy04@hotmail.com"); //>>Use different email every time you run the sign up test for the test to be successful
	}
	public void clickOnCreatAccButton() {
		BaseTest.getWebDriver().findElement(By.id("SubmitCreate")).click();
	}

}
