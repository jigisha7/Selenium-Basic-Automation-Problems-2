import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
public class NameLocator      //DO NOT Change the class name
{
    //Use the declared variables for stroing required values
	static String fName;
	static WebDriver driver;
	public WebDriver setupDriver()           //DO NOT Change the method Signature
	{
	    /* Replace this comment by the code statement to create and return the driver */
	    /* Naviaget to the url 'http://webapps.tekstac.com/AddressBook/'  */
	    DriverSetup ds=new DriverSetup();
	    driver=ds.getWebDriver();
	    driver.get("http://webapps.tekstac.com/AddressBook/");
	    return driver;
	}
	public String getNameLocator()              //DO NOT Change the method Signature
	{
	   /*Using the driver, Find the element ancestor and its text and assign the text to 'fName' */
       /*Close the driver*/
fName=driver.findElement(By.xpath("//td[contains(text(),'NickName')]/ancestor::div[1]")).getText();
      return fName;
	}
	
	public static void main(String[] args)
	{
	    NameLocator nm=new NameLocator();
	    WebDriver dri=nm.setupDriver();
	    String result=nm.getNameLocator();
	}
}