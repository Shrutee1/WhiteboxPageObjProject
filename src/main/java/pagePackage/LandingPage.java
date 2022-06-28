package pagePackage;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseClass;

public class LandingPage extends BaseClass{


	
	@FindBy(xpath="//a[text()='Home']")
	WebElement Home;
	
	@FindBy(xpath="//a[text()='Schedule']")
	WebElement Schedule;
	
	public LandingPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}

	public String VerifyLandingTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public boolean verifyHomebtn() {
		boolean Hom = Home.isDisplayed();
		return Hom;
	}
	
	public boolean verifySchedulebtn() {
		boolean sch= Schedule.isDisplayed();
		return sch;
	}
}
