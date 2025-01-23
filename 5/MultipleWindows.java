import java.util.Set;
import java.util.*;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Point;
public class MultipleWindows
{
    //Do not change the class name
    //Use these declarations to store respective values
    static String parentWinHandle;
    static String childWinHandle;
    Set<String> winHandles;
    static WebDriver driver;
	public WebDriver createDriver() //Do not change the method signature
	{
	    /* Replace this comment by the code statement to create driver, assign it to 'static' variable and return the driver */
	    DriverSetup ds=new DriverSetup();
	    driver=ds.getWebDriver();
	    return driver;
	}
    public String getParentWindow() /*throws Exception*/ { //Do not change the method signature
        // Get  Parent Window Handle as string and return it
        driver.get("https://webapps.tekstac.com/MultipleWindow/");
        String str1=driver.getWindowHandle();
        return str1;
    }
    public String  getChildWindow() /*throws Exception*/
    {   //Do not change the method signature
        // Click the href link. Find the child window's handle and return it.
        //Hint: WAIT for child page to load and find the child window handle.
        WebElement ele=driver.findElement(By.xpath("//html/body/p/a"));
        ele.click();
        try{
        Thread.sleep(5000);}
        catch(Exception e){}

        winHandles=driver.getWindowHandles();

        String pwindow=" ";
        int cnt=0;
        for(String wid : winHandles)
        {
            if(wid.equals(pwindow))
            cnt++;
            else
            driver.switchTo().window(wid);
        }
        String str2=driver.getWindowHandle();
       return str2;
    }
    public static void main(String[] args)
    {
        MultipleWindows win=new MultipleWindows();
	    WebDriver dri=win.createDriver();
	    String res1=win.getParentWindow();
	    String res2=win.getChildWindow();
    }
}