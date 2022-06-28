package pagePackage;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseClass;

public class HomePage extends BaseClass {


	@FindBy(xpath="//img[@id='logo']")
	WebElement wbqalogo;
	@FindBy(xpath="//button[@id='headerfblogin']")
	WebElement freestudent;
	@FindBy(xpath="//a[@id='wblhead']")
	WebElement wbl;
	@FindBy(linkText="Login")
	WebElement login;
	
//Initializing the page object
public HomePage() throws IOException{
	PageFactory.initElements(driver, this);

}	
	
//Action
public String VerifyTitle() {
	String title =driver.getTitle();	
return title;		
}

public boolean Verifylogo() {
	boolean logo =wbqalogo.isDisplayed();
	return logo;
}

public boolean verifyfreestudent() {
	boolean student = freestudent.isDisplayed();
	return student;
}

public LoginPage verifylogin() throws IOException {
login.click();
return new LoginPage();
	
}

}





