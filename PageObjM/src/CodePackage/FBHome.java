package CodePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBHome {
	
	WebDriver driver;
	public FBHome(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath="//*[@aria-label=\"Menu\"]")
	WebElement Menu;
	
	public void Menu()
	{
		Menu.click();
	}
	
	

}
