package Practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Practice3 
{
	static
	AndroidDriver mobileDriver=null;

	
		public void add(String i,String j)
		{
		
	    mobileDriver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.example.vini.addingofnumbers:id/editText1']")).sendKeys(i);
	    mobileDriver.findElement(By.id("com.example.vini.addingofnumbers:id/editText2")).sendKeys(j);
	    mobileDriver.findElement(By.id("com.example.vini.addingofnumbers:id/button1")).click();
		}
		
		public void sub(String i,String j)
		{
			
	   mobileDriver.findElement(By.id("com.example.vini.addingofnumbers:id/editText1")).clear();
	   mobileDriver.findElement(By.id("com.example.vini.addingofnumbers:id/editText2")).clear();
	   mobileDriver.findElement(By.id("com.example.vini.addingofnumbers:id/editText1")).sendKeys(i);  
	   mobileDriver.findElement(By.id("com.example.vini.addingofnumbers:id/editText2")).sendKeys(j);    
	   mobileDriver.findElement(By.id("com.example.vini.addingofnumbers:id/button2")).click();
	   }
	    
		public void mul(String i,String j)
		{ 
		mobileDriver.findElement(By.id("com.example.vini.addingofnumbers:id/editText1")).clear();
		mobileDriver.findElement(By.id("com.example.vini.addingofnumbers:id/editText2")).clear();
	    mobileDriver.findElement(By.id("com.example.vini.addingofnumbers:id/editText1")).sendKeys(i);
	    mobileDriver.findElement(By.id("com.example.vini.addingofnumbers:id/editText2")).sendKeys(j);		    
		mobileDriver.findElement(By.id("com.example.vini.addingofnumbers:id/button3")).click();
			
		}
		
		public void div(String i,String j)
		{
		mobileDriver.findElement(By.id("com.example.vini.addingofnumbers:id/editText1")).clear();
	    mobileDriver.findElement(By.id("com.example.vini.addingofnumbers:id/editText2")).clear();
		mobileDriver.findElement(By.id("com.example.vini.addingofnumbers:id/editText1")).sendKeys(i);	    
		mobileDriver.findElement(By.id("com.example.vini.addingofnumbers:id/editText2")).sendKeys(j);	
		
		mobileDriver.findElement(By.id("com.example.vini.addingofnumbers:id/button4")).click();
		}
		
		public String GetResult()
		{
			String value=mobileDriver.findElement(By.id("com.example.vini.addingofnumbers:id/textView")).getText();
			return value;
		
		}
	
		
	    public static void main(String[] args) throws MalformedURLException {
			// TODO Auto-generated method stub
			
			DesiredCapabilities capabilities=new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto Gss Plus");
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
			capabilities.setCapability(MobileCapabilityType.UDID, "ZY3229RF6M");
			capabilities.setCapability("appPackage","com.example.vini.addingofnumbers");
			capabilities.setCapability("appActivity","com.example.vini.addingofnumbers.MainActivity");
			
		
			mobileDriver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
			mobileDriver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
			
			Practice3 Obj=new Practice3();
			Obj.add("2","3");
			System.out.println(Obj.GetResult());
			Obj.sub("4","2");
			System.out.println(Obj.GetResult());
			Obj.mul("3", "4");
			System.out.println(Obj.GetResult());
			Obj.div("10", "5");
			System.out.println(Obj.GetResult());
			System.out.println("Executed successfully");
			    	
			
	}

}
