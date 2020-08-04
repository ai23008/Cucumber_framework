package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddCustomePage {
	public WebDriver ldriver;

	public AddCustomePage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}

	By lnkCustomer_menu = By.xpath("//span[text()='Customers']");
	By lnkCustomer_menuItem = By.xpath("(//span[text()='Customers'])[2]");
	By buttonAddnew = By.xpath("//a[@class='btn bg-blue']");
	By textEmail = By.xpath("//input[@id='Email']");
	By textPassword = By.xpath("//input[@id='Password']");
	By textFirstName = By.xpath("//input[@id='FirstName']");
	By textLastName = By.xpath("//input[@id='LastName']");
	By textDOB = By.xpath("//input[@id='DateOfBirth']");
	By textCompany = By.xpath("//input[@id='Company']");
	By rdMaleGender = By.xpath("//input[@id='Gender_Male']");
	By rdFemaleGender = By.xpath("//input[@id='Gender_Female']");
	By textNewsLetter = By.xpath("(//div[@class='k-multiselect-wrap k-floatwrap'])[1]");
	By textCustomerRole = By.xpath("(//div[@class='k-multiselect-wrap k-floatwrap'])[2]");
	By textAdminComment = By.xpath("//textarea[@id='AdminComment']");
	By buttonSave = By.xpath("//button[@class='btn bg-blue']");
	By listItemAdministrators = By.xpath("//li[text()='Administrators']");
	By listItemGuest = By.xpath("//li[text()='Guests']");
	By listItemRegistered = By.xpath("//li[text()='Registered']");
	By listItemVendors = By.xpath("//li[text()='Vendors']");
	
	
	public void clickOnCustomerMenu() {
		ldriver.findElement(lnkCustomer_menu).click();
	}
	public void clickOnCustomerMenuItem() {
		ldriver.findElement(lnkCustomer_menuItem).click();
	}
	public void setEmailid(String email) {
		ldriver.findElement(textEmail).sendKeys(email);
		
	}
	
	public void setPassword(String pass) {
		ldriver.findElement(textPassword).sendKeys(pass);
	}
	
	public void setCustomerRole(String role) {
		
	}
	
	
	
	
	
	
	
	
	

}
