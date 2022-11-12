package TestPackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import CodePackage.FBHome;
import CodePackage.LoginPage;

public class TestClass {
	
	@Test
	public void login() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ak143\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("https://www.facebook.com/");
	
	LoginPage lp=new LoginPage(driver);
	lp.Email("9915577938");
	lp.Password("Password00.");
	lp.click();
	driver.wait(5000);
	
	FBHome fb=new FBHome(driver);
	fb.Menu();
	
	}
	

}
