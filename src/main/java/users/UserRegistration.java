package users;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import tours.Registration;

public class UserRegistration {

	WebDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeTest
	public void setup() {

		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test
	public void verifyRegistration()

	{

		Registration reg = new Registration(driver);
		reg.clickRegister();
		reg.enteruserName("Ravi");
		reg.enterLastName("Teja");
		reg.enterPhone("1234567892");
		reg.Email("abc@gmail.com");
		reg.enterAddress("Hyderabad");
		reg.enterCity("Hyderabad");
		reg.enterState("Telangana");
		reg.enterPostalCode("500090");
		reg.enterCountry();
		reg.enterEmail("Ravi@gmail.com");
		reg.enterPassword("Ravi");
		reg.enterConfirmpassword("Ravi");
		reg.clickonSubmit();
		driver.quit();

	}
}
