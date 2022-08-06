package Practice;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class Practice7 
{
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
				
				
				
				capabilities.setCapability("appPackage","io.selendroid.testapp");
				capabilities.setCapability("appActivity","io.selendroid.testapp.HomeScreenActivity");
			
				
				
				
				 mobileDriver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
				 
				// service.stop()
				// 

				 
				 Thread.sleep(10000);
				// mobileDriver.findElement(By.id("io.selendroid.testapp:id/goBack")).click();
				// mobileDriver.findElement(By.xpath("//android.widget.Button[@text='Go to home screen' and @resource-id='io.selendroid.testapp:id/goBack']")).click();
				// mobileDriver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				// mobileDriver.pressKeyCode(4);
				// mobileDriver.closeApp();
				//((PressesKey) mobileDriver).pressKey(new KeyEvent(AndroidKey.BACK));
				//((PressesKey) mobileDriver).pressKey(new KeyEvent(AndroidKey.HOME));
				
				
				Thread.sleep(10000);
				
				/*mobileDriver.findElement(By.id("io.selendroid.testapp:id/my_text_field")).click();
				Thread.sleep(10000);
				
;
				//mobileDriver.findElement(By.id("io.selendroid.testapp:id/my_text_field")).sendKeys("a");
				((PressesKey) mobileDriver).pressKey(new KeyEvent(AndroidKey.ENTER));
				//mobileDriver.findElement(By.id("io.selendroid.testapp:id/my_text_field")).sendKeys("A");
				//((PressesKey) mobileDriver).pressKey(new KeyEvent(AndroidKey.CLEAR));
				((PressesKey) mobileDriver).pressKey(new KeyEvent(AndroidKey.B));
				mobileDriver.pressKeyCode(AndroidKeyCode.KEYCODE_A, AndroidKeyCode.META_SHIFT_ON);*/
				
				
				
				
				
				
				/*Actions action=new Actions(mobileDriver);
				action.sendKeys("ABVC").perform();
				mobileDriver.hideKeyboard();*/
				
				//mobileDriver.findElement(By.id("io.selendroid.testapp:id/visibleButtonTest")).click();
			//	mobileDriver.findElement(MobileBy.id("io.selendroid.testapp:id/visibleButtonTest")).click();-using MobileBy
				
				//mobileDriver.findElement(MobileBy.AccessibilityId("visibleButtonTestCD")).click();-using accesibility id
				
				
				
				
				
				//mobileDriver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.Button\").text(\"Display text view\")").click();-using UISelector
				//checking and unchecking box using id and UiSelector
				mobileDriver.findElement(By.id("io.selendroid.testapp:id/input_adds_check_box")).click();
				Thread.sleep(10000);
				mobileDriver.findElement(By.id("io.selendroid.testapp:id/input_adds_check_box")).click();
				
				
				//mobileDriver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.CheckBox\").text(\"I accept adds\").checked(true)").click();
				//mobileDriver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.CheckBox\").text(\"I accept adds\").checked(false)").click();
				
		     //
				
	
	}
	
	
	

}
