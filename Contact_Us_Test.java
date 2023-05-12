package Mojo_Jojo_Test_Project;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Contact_Us_Test {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\gonzi\\\\Desktop\\\\Selenium\\\\chromedriver.exe");

		// Create a webdriver object - open the browser
		WebDriver driver = new ChromeDriver();

		// Go to the required URL
		driver.get("file:///C:/Users/gonzi/Desktop/%D7%A7%D7%95%D7%A8%D7%A1%20QA/%D7%97%D7%9C%D7%A7%202%20-%20%D7%9E%D7%95%D7%91%D7%99%D7%99%D7%9C%20%D7%95%D7%90%D7%99%D7%A0%D7%98%D7%A8%D7%A0%D7%98/WEB%20&%20MOBILE/Project/Contact%20Us.html");

		driver.manage().window().maximize();

		// Define a timeout: In case an element is not found in the program,
		// wait up to 10 seconds.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Contact_Us_Page Contact_Us_Page = new Contact_Us_Page(driver);
		
		/////CHECK DEFAULTS/////
		
		//default of first name 
		if (Contact_Us_Page.firstNameValue().equals(""))
			System.out.println("default of first name is correct");
		else
			System.out.println("default of first number is not correct "+Contact_Us_Page.firstNameValue());
		
		//default of last name 
		if (Contact_Us_Page.lastNameValue().equals(""))
			System.out.println("default of last name is correct");
		else
			System.out.println("default of last name is not correct "+Contact_Us_Page.lastNameValue());
		
		//default of Looking To Adopt drop down
		if (Contact_Us_Page.LookingToAdoptValue().equals("Any"))
			System.out.println("default of Looking To Adopt drop down is correct");
		else
			System.out.println("default of Looking To Adopt drop down is not correct - "+Contact_Us_Page.LookingToAdoptValue());
		
		//default of phone number
		if (Contact_Us_Page.PhoneNumberValue().equals(""))
			System.out.println("default of phone number is correct");
		else
			System.out.println("default of phone number is not correct "+Contact_Us_Page.PhoneNumberValue());
		
		//default of Email
		if (Contact_Us_Page.emailValue().equals(""))
			System.out.println("default of Email is correct");
		else
			System.out.println("default of Email is not correct "+Contact_Us_Page.emailValue());
		
		//default of Message
		if (Contact_Us_Page.messageValue().equals(""))
			System.out.println("default of Message is correct");
		else
			System.out.println("default of Message is not correct "+Contact_Us_Page.messageValue());
		
	
		
		
		
		
		
		/////ENTER VALUES/////
		
		Contact_Us_Page.typeFirstName("Leonid");
		
		Contact_Us_Page.typeLastName("Braslavski");
		
		// choosing a dog to adopt from the drop down "Looking To Adopt"
		Contact_Us_Page.chooseDogtoAdopt("Max");
		
		Contact_Us_Page.typePhoneNumber("0548178785");
		
		Contact_Us_Page.typeEmail("leo@leo.co.il");
		
		//Select the "Agree" Check box
		Contact_Us_Page.checkAgree();
		
		//scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		//Click on Send
		Contact_Us_Page.clickSend();	
		
		
		

	}
	
	

}
