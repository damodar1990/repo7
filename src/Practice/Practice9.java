package Practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Practice9 {

	
		static AppiumDriverLocalService service=null;
		static AndroidDriver mobileDriver=null;

		public static void main(String[] args) throws MalformedURLException, InterruptedException
		{
					
					DesiredCapabilities capabilities=new DesiredCapabilities();
					capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
					capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto Gss Plus");
					capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
					capabilities.setCapability(MobileCapabilityType.UDID, "ZY3229RF6M");
					//capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
					
					//capabilities.setCapability("appPackage","io.selendroid.testapp");
					//capabilities.setCapability("appActivity","io.selendroid.testapp.HomeScreenActivity");
				
					
					 mobileDriver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
					 mobileDriver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
					 
					 ScrollUtils.swipping_Left_To_Right(mobileDriver, 0, 988);
					 ScrollUtils.swipping_Right_to_left(mobileDriver, 0, 988);
					 ScrollUtils.scrolling_Top_to_Bottom(mobileDriver, 750, 20);
					 ScrollUtils.scrolling_Bottom_to_Top(mobileDriver, 750, 20);
					 
	}

}
