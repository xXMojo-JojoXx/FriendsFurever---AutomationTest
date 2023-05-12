package Mojo_Jojo_Test_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Donations_Page {
	
	WebDriver driver;	
	// Create a webdriver object via constructor
		Donations_Page (WebDriver driver) {
			this.driver = driver;
		}
		
		//elements for first and last name
		WebElement fName() {
			return driver.findElement(By.id("fname"));
		}
		
		WebElement lName() {
			return driver.findElement(By.id("lname"));
		}
		//elements for phone and email
		WebElement phone_Number() {
			return driver.findElement(By.name("phone"));
		}
		
		WebElement e_Mail() {
			return driver.findElement(By.id("email"));
		}
		// elements for radio buttons
		WebElement twenty_radioBtn() {
			return driver.findElement(By.cssSelector("input[id='20']"));
		}
		WebElement fifty_radioBtn() {
			return driver.findElement(By.cssSelector("input[id='50']"));
		}
		WebElement hundred_radioBtn() {
			return driver.findElement(By.cssSelector("input[id='100']"));
		}
		// elements for credit card radio buttons
		WebElement visa_radioBtn() {
			return driver.findElement(By.cssSelector("input[id='visa']"));
		}
		WebElement mastercard_radioBtn() {
			return driver.findElement(By.cssSelector("input[id='mastercard']"));
		}
		WebElement amex_radioBtn() {
			return driver.findElement(By.cssSelector("input[id='amex']"));
		}
		// elements for card details
		WebElement cardName() {
			return driver.findElement(By.name("cardname"));
		}
		
		WebElement cardNumber() {
			return driver.findElement(By.name("cardnumber"));
		}
		
		WebElement expMonth() {
			return driver.findElement(By.id("expmonth"));
		}
		
		WebElement expYear() {
			return driver.findElement(By.id("expyear"));
		}
		
		WebElement Cvv() {
			return driver.findElement(By.name("cvv"));
		}
		// element for "donate"(submit) button
		WebElement Donate() {
			return driver.findElement(By.id("Donate"));
		}
		
	////looking for the amount of check boxes
		int amountOfradioBtns() {
			return driver.findElements(By.cssSelector("input[type='radio']")).size();
		}
		
		
		////// Entering Values //////
		
		//entering first and last name
		void type_fName(String name) {
			fName().sendKeys(name);
		}
		
		void type_lName(String name) {
			lName().sendKeys(name);
		}
		// entering phone number and email
		void type_phone_Number(String name) {
			phone_Number().sendKeys(name);
		}
		
		void type_e_mail(String name) {
			e_Mail().sendKeys(name);
		}
		// choosing amount of donation and credit card - radio buttons
		void click_fifty_radioBtn() {
			fifty_radioBtn().click();
		}
		void click_visa_radioBtn() {
			visa_radioBtn().click();
		}
		// entering card details (name, card number, exp date and cvv)
		void typeCardName(String name) {
			cardName().sendKeys(name);
		}
		
		void typeCardNumber(String number) {
			cardNumber().sendKeys(number);
		}
		
		void typeExpMonth(String name) {
			expMonth().sendKeys(name);
		}
		
		void typeExpYear(String number) {
			expYear().sendKeys(number);
		}
		
		void typeCvv(String number) {
			Cvv().sendKeys(number);
		}
		//clicking "donate" (submit)
		void clickDonate() {
			Donate().click();
		}
		
		////// Values for Defaults //////
		
		
		// first and last name default 
		String fNameValue() {
			return fName().getAttribute("value");
		}
		
		String lNameValue() {
			return lName().getAttribute("value");
		}
		
		// phone number and email default
		String phone_NumberValue() {
			return phone_Number().getAttribute("value");
		}
		
		String e_MailValue() {
			return e_Mail().getAttribute("value");
		}
		
		//default of the radio buttons (amount of donation and card selection)
		boolean twenty_radioBtnValue() {
			return twenty_radioBtn().isSelected();
		}
		
		boolean fifty_radioBtnValue() {
			return fifty_radioBtn().isSelected();
		}
		
		boolean hundred_radioBtnValue() {
			return hundred_radioBtn().isSelected();
		}

		boolean visa_radioBtnValue() {
			return visa_radioBtn().isSelected();
		}
		
		boolean mastercard_radioBtnValue() {
			return mastercard_radioBtn().isSelected();
		}
		
		boolean amex_radioBtnValue() {
			return amex_radioBtn().isSelected();
		}
		
}
