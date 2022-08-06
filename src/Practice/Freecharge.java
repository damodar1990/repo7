package Practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Freecharge {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto Gss Plus");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
		capabilities.setCapability(MobileCapabilityType.UDID, "ZY3229RF6M");
		//capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
		
		
		capabilities.setCapability("appPackage","com.freecharge.android.debug195.07-qa");
		capabilities.setCapability("appActivity","com.freecharge.paymentmodule.PaymentActivity");
		
	
		
		
		
		AndroidDriver mobileDriver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		// TODO Auto-generated method stub

	}

}
