package Mojo_Jojo_Test_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

	public class Contact_Us_Page {
	
	WebDriver driver;
	
	// Create a webdriver object via constructor
	Contact_Us_Page (WebDriver driver) {
		this.driver = driver;
	}
	
	//elements for first and last name
	WebElement firstName() {
		return driver.findElement(By.cssSelector("input[name='f_name']"));
	}
	
	WebElement LastName() {
		return driver.findElement(By.cssSelector("input[name='l_name']"));
	}
	
	// element for choosing a dog to adopt from the drop down "Looking To Adopt"
	WebElement adoptDrop() {
		return driver.findElement(By.name("Dogs to Adopt"));
	}
	
	//elements for phone number, e-mail and message text area
	WebElement PhoneNumber() {
		return driver.findElement(By.name("phone"));
	}
	
	WebElement Email() {
		return driver.findElement(By.name("email"));
	}
	
	WebElement Message() {
		return driver.findElement(By.name("Message"));
	}
	
	// element for the "Agree" check box
	WebElement Agree() {
		return driver.findElement(By.id("checkbox"));
	}
	
	// element for the "send" button
	WebElement Send() {
		return driver.findElement(By.id("send_btn"));
	}
	
	//element for the "thank you" page that opens after clicking "send"
	WebElement thankYou() {
		return driver.findElement(By.cssSelector("h1"));
	}
	
	////looking for the amount of check boxes
	int amountOfCheckBoxes() {
		return driver.findElements(By.cssSelector("input[type='checkbox']")).size();
	}
	
	

	
	////// Entering Values //////
	
	// typing the first and last name
	void typeFirstName(String name) {
		firstName().sendKeys(name);
	}
	
	void typeLastName(String name) {
		LastName().sendKeys(name);
	}
	
	//choosing a dog to adopt from the drop down selection
	void chooseDogtoAdopt (String dta) {
		Select dogDropDown = new Select(adoptDrop());
		dogDropDown.selectByVisibleText(dta);
		
	}
	
	// typing phone number and email
	void typePhoneNumber(String number) {
		PhoneNumber().sendKeys(number);
	}

	void typeEmail(String Email) {
		Email().sendKeys(Email);
	}
	
	// click to select the "Agree" check box and "Send" button
	void checkAgree() {
		Agree().click();
	}
	
	void clickSend() {
		Send().click();
	}

	////// Values for Defaults //////
	
	// first and last name default 
	String firstNameValue() {
		return firstName().getAttribute("value");
	}
	
	String lastNameValue() {
		return LastName().getAttribute("value");
	}
	
	// default value of the drop down selection ("Looking To Adopt")
	String LookingToAdoptValue() {
		return adoptDrop().getAttribute("value");
	}
	
	// phone number, email and message text area default
	String PhoneNumberValue() {
		return PhoneNumber().getAttribute("value");
	}
	
	String emailValue() {
		return Email().getAttribute("value");
	}
	
	String messageValue() {
		return Message().getAttribute("value");
	}
	
	//checking the "Agree" check box (not selected as default)
	boolean checkAgreeValue() {
		return Agree().isSelected();
		
	}
	
	//checking that the "thank you" content is correct on the thank you page
	String checkThankYou() {
		return thankYou().getText();
		}
	
}
