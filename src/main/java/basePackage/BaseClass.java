package basePackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilityPackage.Utils;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;

	public BaseClass() throws IOException {
		
		prop =new Properties();
		
		FileInputStream FI= new FileInputStream("../WhiteboxPageObjProject/src/main/java/configPackage/config.properties");
		prop.load(FI);
		
	}
	public static void initialization() {
		
		String browsername= prop.getProperty("browser");
		
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		
		
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "../WhiteboxPageObjProject/Drivers/chromedriver.exe");
			 driver =new ChromeDriver();
		}
		else if (browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "../WhiteboxPageObjProject/Drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Utils.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Utils.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		
	}

	}