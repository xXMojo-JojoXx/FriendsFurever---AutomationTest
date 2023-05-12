package Mojo_Jojo_Test_Project;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


class ContactUs_JunitTest {
	
	WebDriver driver;
	
	@BeforeEach
	void setUp()  {
		
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\gonzi\\\\Desktop\\\\Selenium\\\\chromedriver.exe");

	// Create a webdriver object - open the browser
	 driver = new ChromeDriver();

	// Go to the required URL
	driver.get("file:///C:/Users/gonzi/Desktop/%D7%A7%D7%95%D7%A8%D7%A1%20QA/%D7%97%D7%9C%D7%A7%202%20-%20%D7%9E%D7%95%D7%91%D7%99%D7%99%D7%9C%20%D7%95%D7%90%D7%99%D7%A0%D7%98%D7%A8%D7%A0%D7%98/WEB%20&%20MOBILE/Project/Contact%20Us.html");

	driver.manage().window().maximize();

	// Define a timeout: In case an element is not found in the program,
	// wait up to 10 seconds.
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	void test_defaults_CU() {
		Contact_Us_Page Contact_Us_Page = new Contact_Us_Page(driver);
		//default of first and last name
		assertEquals("",Contact_Us_Page.firstNameValue());
		assertEquals("",Contact_Us_Page.lastNameValue());
		//default of Looking To Adopt drop down
		assertEquals("Any",Contact_Us_Page.LookingToAdoptValue());
		//default of phone number
		assertEquals("",Contact_Us_Page.PhoneNumberValue());
		//default of Email
		assertEquals("",Contact_Us_Page.emailValue());
		//default of Message text area
		assertEquals("",Contact_Us_Page.messageValue());
		//default of the "Agree" check box
		assertFalse(Contact_Us_Page.checkAgreeValue());
		
	}
	
	@Test
	void test_enterValues_CU() {
		Contact_Us_Page Contact_Us_Page = new Contact_Us_Page(driver);
		
		//entering first and last name
		Contact_Us_Page.typeFirstName("Leonid");
		
		Contact_Us_Page.typeLastName("Braslavski");
		
		// choosing a dog to adopt from the drop down "Looking To Adopt"
		Contact_Us_Page.chooseDogtoAdopt("Max");
		//entering phone and e-mail
		Contact_Us_Page.typePhoneNumber("0548178785");
		Contact_Us_Page.typeEmail("leo@leo.co.il");
		
		//Select the "Agree" Check box
		Contact_Us_Page.checkAgree();
		
		//Click on Send
		Contact_Us_Page.clickSend();
		
		//after clicking on send, it will move to a thank you page
		//checking that the "thank you" content is correct on the thank you page
		assertEquals("Thank you!", Contact_Us_Page.checkThankYou());
		System.out.println("The selected content is: "+ Contact_Us_Page.checkThankYou());
	}
	
	@Test
	void test_amountOfCheckBoxes_CU() {
		Contact_Us_Page Contact_Us_Page = new Contact_Us_Page(driver);
		assertEquals(1, Contact_Us_Page.amountOfCheckBoxes());
		
	}
	
	@Test
	void test_defaults_D() {
		// Go to the required URL
		driver.get("file:///C:/Users/gonzi/Desktop/%D7%A7%D7%95%D7%A8%D7%A1%20QA/%D7%97%D7%9C%D7%A7%202%20-%20%D7%9E%D7%95%D7%91%D7%99%D7%99%D7%9C%20%D7%95%D7%90%D7%99%D7%A0%D7%98%D7%A8%D7%A0%D7%98/WEB%20&%20MOBILE/Project/Donations.html");
		Donations_Page Donations_Page = new Donations_Page(driver);
		//default of first and last name
		assertEquals("",Donations_Page.fNameValue());
		assertEquals("",Donations_Page.lNameValue());
		//default of phone number and Email
		assertEquals("",Donations_Page.phone_NumberValue());
		assertEquals("",Donations_Page.e_MailValue());
		//default of the radio buttons (amount of donation and type of card)
		assertFalse(Donations_Page.twenty_radioBtnValue());
		assertFalse(Donations_Page.fifty_radioBtnValue());
		assertFalse(Donations_Page.hundred_radioBtnValue());
		assertTrue(Donations_Page.visa_radioBtnValue());
		assertFalse(Donations_Page.mastercard_radioBtnValue());
		assertFalse(Donations_Page.amex_radioBtnValue());
		
	}
	
	@Test
	void test_enterValues_D() {
		// Go to the required URL
		driver.get("file:///C:/Users/gonzi/Desktop/%D7%A7%D7%95%D7%A8%D7%A1%20QA/%D7%97%D7%9C%D7%A7%202%20-%20%D7%9E%D7%95%D7%91%D7%99%D7%99%D7%9C%20%D7%95%D7%90%D7%99%D7%A0%D7%98%D7%A8%D7%A0%D7%98/WEB%20&%20MOBILE/Project/Donations.html");
		Donations_Page Donations_Page = new Donations_Page(driver);
		
		//entering first and last name, phone number and e-mail
		Donations_Page.type_fName("Leonid");
		Donations_Page.type_lName("Braslavski");
		Donations_Page.type_phone_Number("0548178785");
		Donations_Page.type_e_mail("leo@leo.co.il");
		//Choose and click  50$
		Donations_Page.click_fifty_radioBtn();
		//choose and click visa 
		Donations_Page.click_visa_radioBtn();
		//enter card details (name, exp date and cvv)
		Donations_Page.typeCardName("Leonid Braslavski");
		Donations_Page.typeCardNumber("1111-2222-3333-4444");
		Donations_Page.typeExpMonth("September");
		Donations_Page.typeExpYear("2023");
		Donations_Page.typeCvv("123");
		//click "Donate"
		Donations_Page.clickDonate();
	}
	
	@Test
	void test_amountOfRadioBtns_D() {
		// Go to the required URL
		driver.get("file:///C:/Users/gonzi/Desktop/%D7%A7%D7%95%D7%A8%D7%A1%20QA/%D7%97%D7%9C%D7%A7%202%20-%20%D7%9E%D7%95%D7%91%D7%99%D7%99%D7%9C%20%D7%95%D7%90%D7%99%D7%A0%D7%98%D7%A8%D7%A0%D7%98/WEB%20&%20MOBILE/Project/Donations.html");
		Donations_Page Donations_Page = new Donations_Page(driver);
		assertEquals(6, Donations_Page.amountOfradioBtns());
	}
	
	@AfterEach
	void tearDown() {
		driver.close();
	}

}
