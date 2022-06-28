    package pageTestPackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseClass;
import pagePackage.HomePage;
import pagePackage.LoginPage;


public class HomePageTest extends BaseClass{
	 HomePage home;
    LoginPage login;
    
	public HomePageTest() throws IOException  {
		super();
		
	}
	
	@BeforeMethod
public void Setup() throws IOException   {
	initialization();
	home= new HomePage();

}
	@Test(priority=1)
	public void TestTitle() {
	String actualtitle = home.VerifyTitle();
	Assert.assertEquals(actualtitle, "QA/QE/SDET Training.");
	
	
} 
	@Test(priority=3)
	public void verifywbllogoTest() {
		boolean logo=	home.Verifylogo();
		Assert.assertTrue(logo);
	
	}
	@Test(priority=2)
	public void verifyfreestudentTest() {
		
		boolean verifyfreestudent =home.verifyfreestudent();
		Assert.assertTrue(verifyfreestudent);
	}
	@Test(priority=4)
	public void verifyloginTest() throws IOException {
		home.verifylogin();
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
}