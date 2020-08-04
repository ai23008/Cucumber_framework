package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver ldriver;
	public LoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(id ="Email")
	WebElement textEmail;
	@FindBy(id ="Password")
	WebElement textPassword;
	@FindBy(xpath = "//input[@value='Log in']")
	WebElement btnLogin;
	
	@FindBy(linkText = "Logout")
	WebElement btnLogout;
	
	public void setUserName(String uname) {
		textEmail.clear();
		textEmail.sendKeys(uname);
	}
	
	public void setPassword(String pass) {
		textPassword.clear();
		textPassword.sendKeys(pass);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
  
	public void clickLogout() {
		btnLogout.click();
	}
}
