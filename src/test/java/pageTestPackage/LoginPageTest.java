package pageTestPackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseClass;
import pagePackage.HomePage;
import pagePackage.LandingPage;
import pagePackage.LoginPage;

public class LoginPageTest extends BaseClass{

	HomePage home;
	LoginPage login;
	LandingPage land;
	
	public LoginPageTest() throws IOException {
		super();
		
	}
@BeforeMethod
	public void setup() throws IOException {
		initialization();
		home= new HomePage();
		login =new LoginPage();
		land =new LandingPage();
	home.verifylogin();
		
	}
	@Test(priority =1)
	public void verifyLoginTitle() {
		String actual =login.verifyLoginTitle();
		String expected ="QA/QE/SDET Training.";
		Assert.assertEquals(expected, actual);
	}
	
	@Test 
	public void verifyregister() {
		Boolean log=login.verifyregister();
		Assert.assertTrue(log);
		
	}
	
	@Test(priority =2)
	public void loginTest() throws IOException {
		
		land=login.loginmethod(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@AfterMethod()
	public void TearDown() {
			driver.quit();
		}
	
	
}
