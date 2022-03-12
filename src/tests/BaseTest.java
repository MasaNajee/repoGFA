package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


import configurations.Hooks;

public class BaseTest {

	public static AndroidDriver<MobileElement> driver;

	
	public BaseTest() {
		
		PageFactory.initElements(new AppiumFieldDecorator(BaseTest.driver), this);
	}
	
	@BeforeClass
	public static void startDevice() {
		driver = new Hooks().driverSetUp(driver);
	}
	
	
	public static void waitVisibilityOf(MobileElement element){
		WebDriverWait webDriverWait = new WebDriverWait(driver, 70);
		webDriverWait.until(ExpectedConditions.visibilityOf(element));
	}
}
