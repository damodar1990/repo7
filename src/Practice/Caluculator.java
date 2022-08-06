package Practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Caluculator {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto Gss Plus");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
		capabilities.setCapability(MobileCapabilityType.UDID, "ZY3229RF6M");
		//capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
		
		
		capabilities.setCapability("appPackage","com.google.android.calculator");
		capabilities.setCapability("appActivity","com.android.calculator2.Calculator");
		
	
		
		
		
		AndroidDriver mobileDriver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		/*mobileDriver.findElement(By.id("com.google.android.calculator:id/digit_4")).click();
		
		mobileDriver.findElement(By.id("com.google.android.calculator:id/digit_2")).click();
		
		mobileDriver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
		
		mobileDriver.findElement(By.id("com.google.android.calculator:id/digit_6")).click();
		
		mobileDriver.findElement(By.id("com.google.android.calculator:id/eq")).click();
		
		//mobileDriver.findElement(By.id("com.google.android.calculator:id/digit_6")).click();
		
		mobileDriver.findElement(By.xpath("//android.widget.Button[@text=9]")).click();
		
		mobileDriver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Delete\"]")).click();
		
		mobileDriver.findElement(By.xpath("//android.widget.Button[@text=9 and @resource-id='com.google.android.calculator:id/digit_9']")).click();
		System.out.println("Application Started");
		
		mobileDriver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Delete\"]")).click();*/
		mobileDriver.findElement(By.id("com.google.android.calculator:id/digit_4")).click();
		
		mobileDriver.findElement(By.xpath("//android.widget.Button[@text=9 and @resource-id='com.google.android.calculator:id/digit_9']")).click();
		
		mobileDriver.findElement(By.xpath("//android.widget.Button[@text='×'and @resource-id='com.google.android.calculator:id/op_mul']")).click();
		
		mobileDriver.findElement(By.xpath("//android.widget.Button[@text=6 and @resource-id='com.google.android.calculator:id/digit_6']")).click();
		
		mobileDriver.findElement(By.id("com.google.android.calculator:id/eq")).click();
		
		String value=mobileDriver.findElement(By.id("com.google.android.calculator:id/result")).getText();
		
		System.out.println(value);
		
		
		
		
	}

}
