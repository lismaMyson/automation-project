package pagepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orderpage {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/section[1]/div[2]/div/section/div[1]/div/div[1]/nav/ul/li[3]/button")
	WebElement home;
	
	@FindBy(xpath = "//*[@id=\"main-content\"]/section[5]/div/div/div[2]/div/div[1]/div[1]/div[1]/div/div[3]/a/div/div/img")
	WebElement selectitem;
	
	@FindBy(xpath = "//*[@id=\"main-content\"]/section[5]/div/div/div[2]/div/div[1]/div[1]/div[2]/div/div[3]/a/div/div/img")
	WebElement item2;
	
	@FindBy(xpath = "//*[@id=\"main-content\"]/div[1]/div/div/div[1]/div/div[2]/div/div[1]/div[4]/button")
	WebElement addcart1;
	
	@FindBy(xpath = "//*[@id=\"main-content\"]/div[1]/div/div/div[1]/div/div[2]/div/div[1]/div[4]/button")
	WebElement addcart2;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/section[1]/div[2]/div/section/div[2]/div/div/div[2]/div[2]/div[4]/button")
	WebElement checkout;
	
	@FindBy(xpath = "//*[@id=\"checkout-app\"]/div/div/div/div/ol/li[1]/div[1]/div/div[2]/div/div[2]/button")
	WebElement signoutcart;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/section[1]/div[2]/div/section/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/div[1]/button")
	WebElement deleteitem;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/section[1]/div[2]/div/section/div[2]/div/div/div[1]/button")
	WebElement exit;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/section[1]/div[2]/div/section/div[1]/div/div[4]/nav/ul/li[1]/a")
	WebElement technology;
	
	@FindBy(xpath = "//*[@id=\"main-content\"]/div[4]/div/div/div/div/div[2]/div[2]/button[2]")
	WebElement arrow1;
	
	@FindBy(xpath = "//*[@id=\"main-content\"]/div[4]/div/div/div/div/div[2]/div[2]/button[1]")
	WebElement arrow2;

	
	
	public Orderpage(WebDriver driver) {//constructor
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void homepage() {
		home.click();
		selectitem.click();
		addcart1.click();
		driver.navigate().back();
		item2.click();
		addcart2.click();
		deleteitem.click();
		exit.click();
		home.click();
		technology.click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		arrow1.click();
		arrow2.click();
		
	}


}
