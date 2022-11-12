import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchronization {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ak143\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com/hotels/");
		driver.findElement(By.cssSelector("[id='city']")).click();
		WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		driver.findElement(By.xpath("//*[@aria-controls=\"react-autowhatever-1\"]")).sendKeys("bali");
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()[contain	s(.,'Bali, Indonesia')]]")));


		
		
		driver.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-0']")).click();


		driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--start DayPicker-Day--selected']")).click();
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@aria-label='Fri Aug 26 2022']")));

		driver.findElement(By.xpath("//div[@aria-label='Fri Aug 26 2022']")).click();
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-cy='submitGuest']")));

		driver.findElement(By.xpath("//button[@data-cy='submitGuest']")).click();
		driver.findElement(By.id("hsw_search_button")).click();
		

		
		
		
		
		
	}
	

}
