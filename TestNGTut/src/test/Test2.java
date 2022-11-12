package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Test2 {

	@Test(groups= {"smoke"})
	public void PCfps(){
		System.out.println("csgo");
	}
	@Parameters({"URL"})
	@Test
	public void PCcod(String urlname) {
		System.out.println("cod");
		System.out.println(urlname);
	}
	@Test
	public void BFMethod() {
		System.out.println("I'm the before method");
	}
	@Test(groups={"smoke"})
	public void Xboxhunt() {
		System.out.println("Hunt-showdown");
	}
	@Test
	public void maintest() throws IOException
	{
		Properties pro=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\ak143\\eclipse-workspace\\TestNGTut\\test-output\\global.properties");
		pro.load(fis);
		System.out.println(pro.getProperty("url"));
		
	}
	
}
