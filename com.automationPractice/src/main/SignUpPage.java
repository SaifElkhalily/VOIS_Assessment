package main;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import tests.BaseTest;

public class SignUpPage {
	public void chooseTitle () {
		BaseTest.getWebDriver().findElement(By.id("id_gender1")).click();;
	}
	public void fillFirstName () {
		BaseTest.getWebDriver().findElement(By.id("customer_firstname")).sendKeys("Saif");
	}
	public void fillLastName () {
		BaseTest.getWebDriver().findElement(By.id("customer_lastname")).sendKeys("Elkhalily");
	}
	public void fillPassword() {
		BaseTest.getWebDriver().findElement(By.id("passwd")).sendKeys("12345s");
	}
	public void selectDOB () {
		new Select(BaseTest.getWebDriver().findElement(By.id("days"))).selectByIndex(5);
		new Select(BaseTest.getWebDriver().findElement(By.id("months"))).selectByIndex(10);
		new Select(BaseTest.getWebDriver().findElement(By.id("years"))).selectByValue("1994");
	}
	public void checkNewsletter_OffersBox () {
		BaseTest.getWebDriver().findElement(By.id("newsletter")).click();
		BaseTest.getWebDriver().findElement(By.id("optin")).click();
	}
	public void fillCompany () {
		BaseTest.getWebDriver().findElement(By.id("company")).sendKeys("VOIS");
	}
	public void fillAddress1 () {
		BaseTest.getWebDriver().findElement(By.id("address1")).sendKeys("Hamada St");
	}
	public void fillCity () {
		BaseTest.getWebDriver().findElement(By.id("city")).sendKeys("Gotham City");
	}
	public void selectState () {
		new Select(BaseTest.getWebDriver().findElement(By.id("id_state"))).selectByIndex(30);
	}
	public void fillPostalCode() {
		BaseTest.getWebDriver().findElement(By.id("postcode")).sendKeys("11011");
	}
	public void fillMobilePhone() {
		BaseTest.getWebDriver().findElement(By.id("phone_mobile")).sendKeys("01234567890");
	}
	public void clickOnRegisterButton() {
		BaseTest.getWebDriver().findElement(By.id("submitAccount")).click();
	}

}
