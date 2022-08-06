package Practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Practice5 {

	public static void main(String[] args) throws MalformedURLException 
	{
		// TODO Auto-generated method stub
		
			
			DesiredCapabilities capabilities=new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto Gss Plus");
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
			capabilities.setCapability(MobileCapabilityType.UDID, "ZY3229RF6M");
			//capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
			
			
			capabilities.setCapability("appPackage","com.example.vini.addingofnumbers");
			capabilities.setCapability("appActivity","com.example.vini.addingofnumbers.MainActivity");
		
			
			
			
			AndroidDriver mobileDriver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
			
			String currentContext=mobileDriver.getContext();
			System.out.println("Current context is:"+currentContext);
			
			String orientationName=mobileDriver.getOrientation().name();
			mobileDriver.rotate(ScreenOrientation.LANDSCAPE);
			mobileDriver.installApp(orientationName);
			mobileDriver.startActivity(new Activity("",""));
			
			mobileDriver.toggleWifi();
			mobileDriver.toggleWifi();
			mobileDriver.toggleData();
			mobileDriver.toggleData();
			mobileDriver.toggleLocationServices();
			mobileDriver.toggleAirplaneMode();
			
			
			

	}

}
