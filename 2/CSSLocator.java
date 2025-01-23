import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
public class CSSLocator     //DO NOT change the class name
{
    static WebDriver driver;
	public WebDriver createDriver()  //DO NOT change the method signature
	{//Implement code to create Driver from DriverSetup and return it
	   DriverSetup ds=new DriverSetup();
	   driver=ds.getWebDriver();
	   return driver;
	}
	public WebElement getCSSLocator(WebDriver driver)  //DO NOT change the method signature
	{/*Replace this comment by the code statement to get the Web element of username*/
	 /*Find and return the element */
      //WebElement elements=driver.findElement(By.cssSelector("//input[@id='username' and @name='usrnm']"));
     WebElement elements=driver.findElement(By.cssSelector("input#username"));
       return elements;
	}
	public String getName(WebElement ele)  //DO NOT change the method signature
	{//Get the attribute value from the element and return it
	   String result=driver.findElement(By.cssSelector("#username")).getAttribute("placeholder");
	    return result;
	}
    public static void main(String[] args){
	    CSSLocator pl=new CSSLocator();
	    //Add required code
	    driver=pl.createDriver();
	    WebElement element=pl.getCSSLocator(driver);
	    System.out.println(pl.getName(element));
	}
}