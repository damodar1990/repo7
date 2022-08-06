package Practice;




import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;

public class ScrollUtils {

	public static void swipping_Left_To_Right(AndroidDriver driver,int startx,int endx) 
	
	{
		Dimension dis=driver.manage().window().getSize();
		int yaxis=dis.height/2;
		TouchAction act=new TouchAction(driver);
		act.longPress(ElementOption.point(startx, yaxis)).moveTo(ElementOption.point(endx, yaxis)).release().perform();
		

	}
	
	public static void swipping_Right_to_left(AndroidDriver driver,int startx,int endx)
	{
		Dimension dim=driver.manage().window().getSize();
		int yaxis=dim.height/2;
		TouchAction act=new TouchAction(driver);
		act.longPress(ElementOption.point(endx, yaxis)).moveTo(ElementOption.point(startx, yaxis)).release().perform();
		
	}
	
	public static void scrolling_Top_to_Bottom(AndroidDriver driver,int starty,int endy)
	{
		Dimension dim=driver.manage().window().getSize();
		int xaxis=dim.width/2;
		TouchAction act=new TouchAction(driver);
		act.longPress(ElementOption.point(xaxis,starty)).moveTo(ElementOption.point(xaxis,endy)).release().perform();
		

}
	public static void scrolling_Bottom_to_Top(AndroidDriver driver,int starty,int endy)
	{
		Dimension dim=driver.manage().window().getSize();
		int xaxis=dim.width/2;
		TouchAction act=new TouchAction(driver);
		act.longPress(ElementOption.point(xaxis,endy)).moveTo(ElementOption.point(xaxis,starty)).release().perform();
		
	}
	public static WebElement ScrollToText(AndroidDriver driver,String text)
	{
		return driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\""+text+"\").instance(0))");
				
				
	}
}
