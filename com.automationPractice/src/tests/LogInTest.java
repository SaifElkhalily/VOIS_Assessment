package tests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import main.HomePage;
import main.MyAccountPage;
import main.SignInPage;

public class LogInTest {
	@BeforeTest
	public void setUp() {
	BaseTest bt = new BaseTest();
	bt.setUp();
	}
	
	@Test
	public void testLogIn(){
		HomePage hp = new HomePage();
		SignInPage si = new SignInPage();
		MyAccountPage acc = new MyAccountPage();
		BaseTest.getWebDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		hp.clickOnSignIn();
		si.fillEmailField();
		si.fillPasswordField();
		si.clickOnSignInButton();
		
		assertEquals(acc.signInAlertMssg(), "Welcome to your account. Here you can manage all of your personal information and orders.");
	}
	
	@AfterTest
	public void tearDown() {
		BaseTest.getWebDriver().quit();
	}

}
