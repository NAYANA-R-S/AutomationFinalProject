package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	WebDriver driver;
	
	By usernamefield = By.id("user-name");
	By passwordfield = By.id("password");
	By loginbutton = By.id("login-button");
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
	}

	public void setValues(String username, String password)
	{
		driver.findElement(usernamefield).sendKeys(username);
		driver.findElement(passwordfield).sendKeys(password);
	}
	public void login()
	{
		driver.findElement(loginbutton).click();
	}

}
