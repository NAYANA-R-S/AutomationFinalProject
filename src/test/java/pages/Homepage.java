package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	WebDriver driver;
	
	By productselect = By.xpath("(//div[@class=\"inventory_item_name\"])[1]");
	By addtocartbutton = By.id("add-to-cart-sauce-labs-backpack");
	By cartlink = By.xpath("//a[@class=\"shopping_cart_link\"]");
	By checkoutbutton = By.id("checkout");
	
	By firstnamefield = By.id("first-name");
	By lastnamefield = By.id("last-name");
	By zipfield = By.id("postal-code");
	By continuebutton = By.id("continue");
	By finishbutton = By.id("finish");
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
	}
	public void cart()
	{
		driver.findElement(productselect).click();
		driver.findElement(addtocartbutton).click();
		driver.findElement(cartlink).click();
		driver.findElement(checkoutbutton).click();
	}
	public void checkoutdetails(String firstname, String lastname, String zip)
	{
		driver.findElement(firstnamefield).sendKeys(firstname);
		driver.findElement(lastnamefield).sendKeys(lastname);
		driver.findElement(zipfield).sendKeys(zip);
		driver.findElement(continuebutton).click();
	}
	public void finish()
	{
		driver.findElement(finishbutton).click();
	}
	

	
	
	
	

}
