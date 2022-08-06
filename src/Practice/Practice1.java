package Practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Practice1 {

	public static void main(String[] args) throws MalformedURLException 
	{
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		
		
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "ZY3229RF6M");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
		
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		capabilities.setCapability("appium:chromeoptins",ImmutableMap.of("w3c",false));
		
		
		
		AndroidDriver mobileDriver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		mobileDriver.get("https://www.actitime.com");
		mobileDriver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		mobileDriver.findElement(By.xpath("//div[@class='header__burger']")).click();
		mobileDriver.findElement(By.xpath("//div[@class='header__burger header__burger--close']")).click();
		
		

	}

}
