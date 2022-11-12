package CodePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

		// TODO Auto-generated method stub
		WebDriver driver;
		public LoginPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(id="email")
			WebElement email;
		
		@FindBy(id="pass")
		WebElement password;
		
		@FindBy(name="login")
		WebElement login;
		
		
		public void Email(String username) {
			email.sendKeys(username);
			
		}
		public void Password(String pass)
		{
			password.sendKeys(pass);
		}
		public void click() {
			login.click();
		}

	}


