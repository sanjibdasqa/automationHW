package pages;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[@class='cmp-button__text'])[1]")
    WebElement loginButton;

	public void clickLoginButton() throws InterruptedException {
		loginButton.click();
		Thread.sleep(3000);
	}

	@FindBy(xpath = "//input[@name='psudoUsername']")
	WebElement UserName;

	public void clickUserName() throws InterruptedException {
		UserName.click();
		Thread.sleep(3000);
	}

	@FindBy(how = How.XPATH, using = "(//a[@class='cmp-primary-header__menu-link'])[1]")
	WebElement learning;

	public void clickLearning() throws InterruptedException {
		learning.click();
		Thread.sleep(3000);
	}

	@FindBy(xpath = "//input[@id='formElement_1']")
	WebElement password;

	public void clickPassword() throws InterruptedException {
		password.click();
		Thread.sleep(3000);
	}

}
