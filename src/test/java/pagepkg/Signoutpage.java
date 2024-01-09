package pagepkg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signoutpage {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/section[1]/div[2]/div/section/div[1]/div/div[4]/nav/ul/li[3]/a")
	WebElement signout;
	
	public Signoutpage(WebDriver driver) {//constructor
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void signout() {
		signout.click();
	}
	public void screenshot() throws IOException {
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(screenshot, new File("F:\\larqscreenshot.png"));
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("./screenshot/signoutpage.png"));
		
	}
}
