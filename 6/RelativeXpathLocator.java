import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
public class RelativeXpathLocator    //DO NOT Change the class Name
{
    static WebDriver driver;
	public WebDriver createDriver()    //DO NOT change the method signature
	{
	   DriverSetup ds=new DriverSetup();
	   driver=ds.getWebDriver();
	   return driver;
	}
	public WebElement getRelativeXpathLocator(WebDriver driver)//DO NOT change the method signature
	{
	   /*to get the Web element */ /*Find and return the element */
	   WebElement element=driver.findElement(By.xpath("//td[contains(text(),'SivaKumar')]"));
	   return element;
	}
	public String getName(WebElement element)//DO NOT change the method signature
	{
	    //Get the attribute value from the element and return it
	    String res=driver.findElement(By.xpath("//td[contains(text(),'SivaKumar')]")).getText();
	    return res;
	}

    public static void main(String[] args){
	    RelativeXpathLocator pl=new RelativeXpathLocator();
	   WebDriver dr=pl.createDriver();
	   WebElement ele=pl.getRelativeXpathLocator(dr);
	   System.out.println(pl.getName(ele));
	}
}