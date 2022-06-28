package pagePackage;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(xpath="//input[@id='username']")
	WebElement username;
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	@FindBy(xpath="//button[@id='login']")
	WebElement loginbtn;
	@FindBy(xpath="//button[@id='register']")
	WebElement register;

	
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}

	//Actions
	public String verifyLoginTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public boolean verifyregister() {
		boolean reg = register.isDisplayed();
		return reg;
	}
	
	public LandingPage loginmethod(String un,String pwd) throws IOException {
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		return new LandingPage();
	} 
	
	
}


