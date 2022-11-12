import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RadioBtn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ak143\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@data-testid='one-way-radio-button']")).click();
		
		driver.findElement(By.xpath("//*[@data-testid='to-testID-origin']")).click();
		driver.findElement(By.xpath("//*[@data-testid='to-testID-origin']/div[1]/div[1]")).sendKeys("blr");;
		 
		Thread.sleep(3000);
		
		WebElement to= driver.findElement(By.xpath("//*[@data-testid='to-testID-destination']"));
		to.click();
		to.sendKeys("blr");
		
		
	}
}
