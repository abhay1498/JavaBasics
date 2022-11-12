import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ak143\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/38397/rsa-vs-ind-1st-test-india-tour-of-south-africa-2021-22");
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		List<WebElement> runs=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"));
		int sum=0;
		int extras=Integer.parseInt(driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());

		for(int i=0;i<runs.size()-2;i++)
		{
			int total=Integer.parseInt(runs.get(i).getText());
			
			
			//sum=sum+Integer.parseInt(runs.get(i).getText());
			sum=sum+total;

			
		}
		int totalval=sum+extras;
		
		System.out.println(totalval);
		

		//System.out.println(sum);
	}

}
