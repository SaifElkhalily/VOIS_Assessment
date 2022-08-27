package tests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import main.HomePage;
import main.MyAccountPage;
import main.SignInPage;
import main.SignUpPage;

public class SignUpTest {
	@BeforeTest
	public void setUp() {
		BaseTest bt = new BaseTest();
		bt.setUp();
	}
	
	@Test
	public void testSignUp(){
		HomePage hp = new HomePage();
		SignInPage si = new SignInPage();
		SignUpPage su = new SignUpPage();
		MyAccountPage acc = new MyAccountPage();
		BaseTest.getWebDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		hp.clickOnSignIn();
		si.fillRegistrationEmailField();
		si.clickOnCreatAccButton();
		su.chooseTitle();
		su.fillFirstName();
		su.fillLastName();
		su.fillPassword();
		su.selectDOB();
		su.checkNewsletter_OffersBox();
		su.fillCompany();
		su.fillAddress1();
		su.fillCity();
		su.selectState();
		su.fillPostalCode();
		su.fillMobilePhone();
		su.clickOnRegisterButton();
		
		assertEquals(acc.signInAlertMssg(), "Welcome to your account. Here you can manage all of your personal information and orders.");
	}
	
	@AfterTest
	public void tearDown() {
		BaseTest.getWebDriver().quit();
	}

}
