import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
public class AbsoluteXpathLocator  //DO NOT Change the class Name
{
    static WebDriver driver;
	public WebDriver createDriver()
	{
	   DriverSetup ds=new DriverSetup();
	   driver=ds.getWebDriver();
	   return driver;
	}
	public WebElement getAbsoluteXpathLocator(WebDriver driver)//DO NOT change the method signature
	{
	   /*get the Web element of logo */ /*Find and return the element */
	  WebElement element=driver.findElement(By.xpath("//html[1]/body[1]/form[1]/div[1]/img[1]"));
       return element;
	}
	public String getName(WebElement element)    //DO NOT change the method signature
	{
	    //Get the attribute value from the element and return it
	    String res=driver.findElement(By.xpath("//html[1]/body[1]/form[1]/div[1]/img[1]")).getAttribute("src");
	    return res;
	}

    public static void main(String[] args){
	    AbsoluteXpathLocator pl=new AbsoluteXpathLocator();
	   WebDriver dr=pl.createDriver();
	   WebElement ele=pl.getAbsoluteXpathLocator(dr);
	   System.out.println(pl.getName(ele));
	}
}