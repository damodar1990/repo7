package Practice;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class Practice6 
{
	static AndroidDriver mobileDriver=null;
	static AppiumDriverLocalService service=null;
	

	public static void main(String[] args) throws MalformedURLException 
	{
		service=AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
				.withAppiumJS(new File("C:\\Users\\Shubha\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withArgument(GeneralServerFlag.LOCAL_TIMEZONE)
				.withLogFile(new File(System.getProperty("user.dir")+"\\src\\Logs\\Appiumlogs.txt")));
		
		//service.start();
		
			
			DesiredCapabilities capabilities=new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto Gss Plus");
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
			capabilities.setCapability(MobileCapabilityType.UDID, "ZY3229RF6M");
			//capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
			
			
			capabilities.setCapability("appPackage","com.example.vini.addingofnumbers");
			capabilities.setCapability("appActivity","com.example.vini.addingofnumbers.MainActivity");
		
			
			
			
			 mobileDriver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
			 
			// service.stop();
			
	}

}
