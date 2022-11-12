import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StaticDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ak143\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		/*Select s=new Select(driver.findElement(By.xpath("//*[@id=\'post-2646\']/div[2]/div/div/div/p/select")));
		s.selectByValue("ASM");
		s.selectByIndex(7);
		s.selectByVisibleText("Antigua and Barbuda");*/
		
		//FromCity
		
		//Assert.assertFalse(driver.findElement(By.xpath("//input[@id='fromCity']")).isSelected());
		
		driver.findElement(By.cssSelector("[data-cy='oneWayTrip']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		driver.findElement(By.xpath("//*[@placeholder='From']")).sendKeys("mum");
		Thread.sleep(2000);
		driver.findElement(By.id("react-autowhatever-1-section-0-item-2")).click();
		
		//ToCity
		
		//driver.findElement(By.xpath("//input[@id='toCity']")).click();
		driver.findElement(By.xpath("//*[@placeholder='To']")).sendKeys("blr");
		Thread.sleep(2000);
		driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
	
		//driver.findElement(By.xpath("//label[@for='departure']")).sendKeys(Keys.ESCAPE);
		
		driver.findElement(By.cssSelector("[data-cy='travellerText']")).click();
		driver.findElement(By.cssSelector("[data-cy='adults-3']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[data-cy='travellerApplyBtn']")).click();
		driver.findElement(By.xpath("//*[@class='specialFareNew']/li[3]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@data-cy='submit']/a")).click();
		

		
		//CheckBox
		
		//driver.findElement(By.xpath("//ul[@class='specialFareNew']/li[3]")).click();
		
		//driver.findElement(By.xpath("//*[@class='specialFareNew']")).getSize();
		
		
		
	
		
		
		/*driver.findElement(By.xpath("//*[@id=\'react-autowhatever-1-section-0-item-3\']/div/div[1]/p[1]")).click();
		driver.findElement(By.xpath("//input[@id='toCity']")).click();
		//driver.findElement(By.xpath("//*[@aria-controls='react-autowhatever-1']")).sendKeys("GWL");
		driver.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-0']/div/div[1]/p[1]")).click();*/
		
		
		
		
		
		
		
		

	}

	

}
