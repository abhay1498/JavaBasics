import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendars {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ak143\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://makemytrip.com");
		
		driver.findElement(By.xpath("//*[@for='departure']")).click();
		Thread.sleep(3000);
		
		while(!driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div")).getText().contains("March 2023"))
		{
			driver.findElement(By.cssSelector(".DayPicker-NavButton.DayPicker-NavButton--next")).click();
			
		}
		Thread.sleep(3000);
		
		int count=driver.findElements(By.xpath("//div[@class='DayPicker-Day']/div/p[1]")).size();
		
		for(int i=0;i<count;i++)
		{
			String date=driver.findElements(By.xpath("//div[@class='DayPicker-Day']/div/p[1]")).get(i).getText();
			if(date.equalsIgnoreCase("30")) {
				driver.findElements(By.xpath("//div[@class='DayPicker-Day']/div/p[1]")).get(i).click();
				break;
				
		}		

	}

}}
