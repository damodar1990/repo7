package Practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Practice8 {

	
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
					 
					// mobileDriver.findElement(By.id("io.selendroid.testapp:id/buttonStartWebview")).click();
					 
					 List<WebElement> li=mobileDriver.findElements(By.className("android.widget.Button"));
					 System.out.println("number of buttons:"+li.size());
					 
					 for(WebElement buttons:li)
					 {
						 System.out.println(buttons.getText());
					
					 }
					 
					 System.out.println("---------------------");
					 
					 List<WebElement> li1=mobileDriver.findElements(By.className("android.widget.EditText"));
					 System.out.println("Number of Edit text:"+li1.size());
					 
					 for(WebElement EditText:li1)
					 {
						 System.out.println(EditText.getText());
					 }
					 
					 System.out.println("----------------------------");
					 
					 List<WebElement> li2=mobileDriver.findElements(By.className("android.widget.ImageButton"));
					 System.out.println("Number of Edit text:"+li2.size());
					 
					 {
						 
						 for(WebElement ImageButton:li2)
					     System.out.println(ImageButton.getText());
						 
					 }
                         System.out.println("----------------------------");
					 
					 List<WebElement> li3=mobileDriver.findElements(By.className("android.widget.CheckBox"));
					 System.out.println("Number of Edit text:"+li3.size());
					 
					 {
						 for(WebElement ImageButton:li3)
					     System.out.println(ImageButton.getText());
						 
					 }
					 
					 
					 }
					 
		
	}


