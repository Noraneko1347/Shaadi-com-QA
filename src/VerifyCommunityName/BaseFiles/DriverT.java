package VerifyCommunityName.BaseFiles;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DriverT {
	WebDriver driver;
	public WebDriver OpenDriver(String url) {
		String path = System.getProperty("user.dir"); // get driver path from home dir
		System.setProperty("webdriver.gecko.driver",path + "\\Driver and Jars\\geckodriver_027.exe");
		File pathBinary = new File("C:\\Users\\analisa.lewis\\AppData\\Local\\Mozilla Firefox\\firefox.exe"); // system path of Firefox.exe
		FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);   
		DesiredCapabilities desired = DesiredCapabilities.firefox();
		FirefoxOptions options = new FirefoxOptions();
		desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
		driver = new FirefoxDriver(options);
		driver.get(url);
		return driver;
	}
}
