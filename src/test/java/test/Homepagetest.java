package test;

import org.testng.annotations.Test;

import pages.Homepage;
import pages.Loginpage;

public class Homepagetest extends Baseclass {
	@Test
	public void testing()
	{
		Loginpage lp = new Loginpage(driver);
		lp.setValues("standard_user", "secret_sauce");
		lp.login();
		Homepage hp = new Homepage(driver);
		hp.cart();
		hp.checkoutdetails("Nayana", "R S", "1234");
		hp.finish();
	}

}
