package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObject.LoginPage;

public class Steps {
	
	public WebDriver driver;
	public LoginPage lp;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		lp=new LoginPage(driver);
	    
	}

	@When("User Opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	    
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String pass) {
	   lp.setUserName(email);
	   lp.setPassword(pass);
	   
	}

	@When("Click on Login")
	public void click_on_login() {
	   lp.clickLogin();
	}

	@Then("Page Title Should be {string}")
	public void page_title_should_be(String title) {
		
		if(driver.getPageSource().contains("Login was unsuccessful")) {
			driver.close();
			Assert.assertTrue(false);
		}
		else {
			Assert.assertEquals(title, driver.getTitle());
		}
	   
	}

	@When("User Click on Log out Link")
	public void user_click_on_log_out_link() throws InterruptedException {
	 lp.clickLogout();  
	 Thread.sleep(3000);
	}

	@Then("Close browser")
	public void close_browser() {
	   driver.close();
	   
	}


}
