package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Signinpage {
	WebDriver driver;

	
	@FindBy(xpath = "//*[@id=\"__next\"]/section[1]/div[2]/div/section/div[1]/div/div[4]/nav/ul/li[3]/a")
	WebElement user;
	
	@FindBy(xpath = "//*[@id=\"main-content\"]/div[3]/div/div/div[2]/div/div[2]/a/button")
	WebElement createaccount;
	
	@FindBy(xpath = "//*[@id=\"email\"]")
	WebElement email;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\"passwordConfirm\"]")
	WebElement confirmpass;
	
	@FindBy(xpath = "//*[@id=\"country\"]")
	WebElement country;
	
	@FindBy(xpath = "//*[@id=\"firstName\"]")
	WebElement firstname;
	
	@FindBy(xpath = "//*[@id=\"lastName\"]")
	WebElement lastname;
	
	@FindBy(xpath = "//*[@id=\"addressLineOne\"]")
	WebElement addressline1;
	
	@FindBy(xpath = "//*[@id=\"addressLineTwo\"]")
	WebElement addressline2;
	
	@FindBy(xpath = "//*[@id=\"company\"]")
	WebElement company;
	
	@FindBy(xpath = "//*[@id=\"suburbCity\"]")
	WebElement city;
	
	@FindBy(xpath = "//*[@id=\"stateProvince\"]")
	WebElement state;
	
	@FindBy(xpath = "//*[@id=\"zipPostcode\"]")
	WebElement zipcode;
	
	@FindBy(xpath = "//*[@id=\"phoneNumber\"]")
	WebElement phnumber;
	
	@FindBy(xpath = "//*[@id=\"main-content\"]/div[2]/div/div/div[15]/div/button")
	WebElement createaccbutton;
	
	@FindBy(xpath = "//*[@id=\"login_email\"]")
	WebElement emailaddress;
	
	@FindBy(xpath = "//*[@id=\"login_pass\"]")
	WebElement signinpass;
	
	@FindBy(xpath = "//*[@id=\"main-content\"]/div[3]/div/div/div[1]/form/div[3]/button")
	WebElement signin;

	
	public Signinpage(WebDriver driver) {//constructor
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void signup() {
		user.click();
		createaccount.click();
	}
	public void newaccount() {
		email.sendKeys("lis@mail.com");
		password.sendKeys("Lis@9102000");
		confirmpass.sendKeys("Lis@9102000");
		Select coun=new Select(country);
		coun.selectByValue("India");
		firstname.sendKeys("lisma");
		lastname.sendKeys("myson");
		addressline1.sendKeys("thekkuden house");
		city.sendKeys("thrissur");
		state.sendKeys("kerala");
		zipcode.sendKeys("680711");
		phnumber.sendKeys("1235678908");
		createaccbutton.click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-250)");
		driver.navigate().back();
	
		
	}
	public void setvaues(String emailf,String passf) {
		emailaddress.clear();
		emailaddress.sendKeys(emailf);
		signinpass.clear();
		signinpass.sendKeys(passf);
		
		}
	public void signin() {
		signin.click();
	}
	
}
