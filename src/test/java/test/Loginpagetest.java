package test;

import org.testng.annotations.Test;

import pages.Loginpage;

public class Loginpagetest extends Baseclass{
	@Test
	public void testing()
	{
		Loginpage lp = new Loginpage(driver);
		lp.setValues("standard_user", "secret_sauce");
		lp.login();
		
		
	}

}
