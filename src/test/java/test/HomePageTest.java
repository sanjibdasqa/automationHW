package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test(enabled = false, priority = 1)
	public void clickLoginButtonTest() throws InterruptedException {
		homePage.clickLoginButton();
	}

	@Test(enabled = false, priority = 2)
	public void clickUserNameTest() throws InterruptedException {
		homePage.clickLoginButton();
		homePage.clickUserName();
	}

	@Test(enabled = true, priority = 3)
	public void clickLearningTest() throws InterruptedException {

		homePage.clickLearning();
	}

	@Test(enabled = false, priority = 4)
	public void clickPasswordTest() throws InterruptedException {
		homePage.clickLoginButton();
		homePage.clickPassword();
	}

	@Test(enabled = false, priority = 5)
	public void clickForgotUserName() throws InterruptedException {
		homePage.clickLoginButton();
		driver.findElement(By.cssSelector("a.ngp-link-rightrail.ng-binding")).click();
		Thread.sleep(3000);
	}

}
