package VerifyCommunityName;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import VerifyCommunityName.BaseFiles.DriverT;
import VerifyCommunityName.BaseFiles.GetURLs;
import VerifyCommunityName.BaseFiles.VarPaths;

public class VerifyCommunityNameLogin implements VarPaths{
	WebDriver driver;
	WebDriverWait wait;
	DriverT CallDriver = new DriverT();  // initializes the driver initialization function
	GetURLs urls = new GetURLs();   // initializes the function that gets the URLs from JSON
	WebElement el;

	@Test
	public void ValidateMotherLang() throws IOException, ParseException {
		String[] urlList = urls.SetURLs();
		
		for(int i = 0; i<urlList.length; i++) {
			try {
			driver = CallDriver.OpenDriver(urlList[i]); //opens the Firefox browser with the URL sent
			wait = new WebDriverWait(driver, 10);
		el = wait.until(ExpectedConditions.visibilityOfElementLocated(LetsBeginBtn)); // fills in the registration panel 1
		el.click();
		el = wait.until(ExpectedConditions.visibilityOfElementLocated(EmailIDInput));
		el.sendKeys("abc12@xyz.com");
		el = wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordInput));
		el.sendKeys("Password");
		el = wait.until(ExpectedConditions.visibilityOfElementLocated(ProfileCreatorDdn));
		el.click();	
		el = wait.until(ExpectedConditions.visibilityOfElementLocated(DaughterDdn));
		el.click();
		el = wait.until(ExpectedConditions.visibilityOfElementLocated(NextBtn));
		el.click();
		el = wait.until(ExpectedConditions.visibilityOfElementLocated(MotherTongue)); // gets the mother tongue value from the next panel
		if (driver.getTitle().contains(el.getText())) // validates the mother tongue value with the community domain from the page title
			{
			Assert.assertTrue(true);
			System.out.println("Community name and the default selected Mother tongue is the same");
			}
		else {
			Assert.assertTrue(false);
			System.out.println("Community name and the default selected Mother tongue is not the same");
		}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
			driver.close(); // closes the web browser
		}	
	}
}
