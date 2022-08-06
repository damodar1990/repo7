package Practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class ScrollText {

	
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
				
				
				
				capabilities.setCapability("appPackage","com.mobeta.android.demodslv");
				capabilities.setCapability("appActivity","com.mobeta.android.demodslv.Launcher");
			
				
				
				
				 mobileDriver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
				 mobileDriver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
				 
				 ScrollUtils.ScrollToText(mobileDriver,"Multiple-choice mode").click();
				 mobileDriver.pressKeyCode(4);
				 //mobileDriver.pressKeyCode(AndroidKeyCode.KEYCODE_A,AndroidKeyCode.META_SHIFT_ON);
				 ScrollUtils.ScrollToText(mobileDriver, "Background handle").click();
				 mobileDriver.pressKeyCode(4);
				 mobileDriver.pressKeyCode(AndroidKeyCode.KEYCODE_A,AndroidKeyCode.META_SHIFT_ON);
				 ((PressesKey) mobileDriver).pressKey(new KeyEvent(AndroidKey.A));
				 mobileDriver.pressKeyCode(AndroidKeyCode.KEYCODE_A,AndroidKeyCode.META_SHIFT_ON);
			     mobileDriver.pressKeyCode(AndroidKeyCode.KEYCODE_A,AndroidKeyCode.META_SHIFT_ON);
			     ((PressesKey) mobileDriver).pressKey(new KeyEvent(AndroidKey.B));
			     ((PressesKey) mobileDriver).pressKey(new KeyEvent(AndroidKey.A));
	
			     mobileDriver.pressKeyCode(AndroidKeyCode.KEYCODE_A,AndroidKeyCode.META_SHIFT_ON);
			     
				

				
				 
				
				 
				 
		         
				

}
}