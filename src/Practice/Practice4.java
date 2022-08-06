package Practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Practice4 

{
	

	public static void main(String[] args) throws MalformedURLException {
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
		
		String Orientation=mobileDriver.getOrientation().name();
		System.out.println("Current Orientaation is:"+Orientation);
		
		mobileDriver.rotate(ScreenOrientation.LANDSCAPE);
		
		String Orientation1=mobileDriver.getOrientation().name();
		System.out.println("Current Orientaation is:"+Orientation1);
		
		mobileDriver.rotate(ScreenOrientation.PORTRAIT);
		
		String Orientation2=mobileDriver.getOrientation().name();
		System.out.println("Current Orientaation is:"+Orientation2);
		
		
		mobileDriver.resetApp();
		
		
		//mobileDriver.closeApp();
		
		//mobileDriver.removeApp("com.example.vini.addingofnumbers");
		//mobileDriver.installApp(Orientation2)-app source should be provided
		//mobileDriver.startActivity(null)package name and activity name should be provided.---
		
		
		
		//System.out.println(source);
		
		String currentPackageName=mobileDriver.getCurrentPackage();
		System.out.println("Package name is:"+currentPackageName);
		
		String currentActivityName=mobileDriver.currentActivity();
		System.out.println("current activity is:"+currentActivityName);

	}

}
