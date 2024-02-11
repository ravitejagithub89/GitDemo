package tours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	WebDriver driver;

	@FindBy(linkText = "REGISTER")
	WebElement REGISTER;

	@FindBy(name = "firstName")
	WebElement firstname;

	@FindBy(name = "lastName")
	WebElement lastName;

	@FindBy(name = "phone")
	WebElement phone;

	@FindBy(id = "userName")
	WebElement userName;

	@FindBy(name = "address1")
	WebElement address1;

	@FindBy(name = "city")
	WebElement city;

	@FindBy(name = "state")
	WebElement state;

	@FindBy(name = "postalCode")
	WebElement postalCode;

	@FindBy(name = "country")
	WebElement country;

	@FindBy(id = "email")
	WebElement email;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(name = "confirmPassword")
	WebElement confirmPassword;

	@FindBy(name = "submit")
	WebElement submit;

	public Registration(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickRegister() {
		REGISTER.click();
	}

	public void enteruserName(String username) {
		firstname.sendKeys(username);
	}

	public void enterLastName(String lastname) {
		lastName.sendKeys(lastname);
	}

	public void enterPhone(String Phone) {
		phone.sendKeys(Phone);

	}

	public void Email(String Email) {
		userName.sendKeys(Email);

	}

	public void enterAddress(String address) {
		address1.sendKeys(address);
	}

	public void enterState(String State) {
		state.sendKeys(State);
	}

	public void enterCity(String City) {
		city.sendKeys(City);
	}

	public void enterPostalCode(String Postalcode) {
		postalCode.sendKeys(Postalcode);
	}

	public void enterCountry() {
		Select dropdown = new Select(driver.findElement(By.name("country")));

		dropdown.selectByValue("UNITED KINGDOM");
	}

	public void enterEmail(String Email1) {
		email.sendKeys(Email1);
	}

	public void enterPassword(String Password) {
		password.sendKeys(Password);
	}

	public void enterConfirmpassword(String Confirm) {
		confirmPassword.sendKeys(Confirm);
	}

	public void clickonSubmit() {
		submit.click();
	}

}
