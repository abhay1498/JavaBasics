package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

public class Test3 {
	public WebDriver driver=null;


	@Test
	public void moba() throws IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ak143\\Downloads\\chromedriver.exe");

		Properties p=new Properties();
		FileInputStream fs=new FileInputStream("C:\\Users\\ak143\\eclipse-workspace\\TestNGTut\\test-output\\global.properties");
		p.load(fs);
		if(p.getProperty("browser").equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(p.getProperty("browser").equals("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.get(p.getProperty("url"));
	}
	
}
