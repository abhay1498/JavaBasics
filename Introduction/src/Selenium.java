import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Invoke .exe file
		//2. Create Driver Object for Chrome
		//3. Implement methods of WebDriver
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ak143\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://google.com");
		//WebElement e=driver.findElement(By.cssSelector("input[title='Search']"));
		WebElement e=driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input"));
		//driver.findElement(By.id("pass")).sendKeys(".");
		//driver.findElement(By.cssSelector("input[class='gNO89b']")).click();
		//System.out.println(driver.findElement(By.className("_9ay7")).getText());
		e.sendKeys("Selenium");
		e.sendKeys(Keys.RETURN);
		
			
		
		
		
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*String page_title= driver.getTitle();
		String test_title="Google";
		if(test_title.equalsIgnoreCase(page_title))		
		{
			System.out.println("Test Case Passed");
		}
		else
			System.out.println("Case Failed");*/
		
		
		
	}

}
