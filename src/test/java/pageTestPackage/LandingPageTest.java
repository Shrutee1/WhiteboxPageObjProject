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

public class LandingPageTest extends BaseClass{

	HomePage home;
	LoginPage login;
	LandingPage land;
	
	public LandingPageTest() throws IOException {
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
public void verifyLandingTitle() {
	String actual =land.VerifyLandingTitle();
	String expected ="QA/QE/SDET Training.";
	Assert.assertEquals(expected, actual);
}

@Test (priority =2)
public void verifyHomeBtn() {
	Boolean hom =land.verifyHomebtn();
	Assert.assertTrue(hom);
	
}
@Test(priority =3)
public void verifySchBtn() {
	land.verifySchedulebtn();
	Assert.assertTrue(true);
}

@AfterMethod
public void TearDown() {
	driver.quit();
}


}
