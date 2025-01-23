import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class NameLocator {      //DO NOT change the class name

    public static String baseUrl="http://webapps.tekstac.com/Handling_Regular_Expression/";
    public static WebDriver driver;
	public WebDriver createDriver()
	{//Create driver. Assign it to static variable 'driver' and return it
	DriverSetup ds=new DriverSetup();
	driver=ds.getWebDriver();
	return driver;
	}
	public void navigate(WebDriver driver)
	{    //Navigate to the baseUrl
	driver.get(baseUrl);
	}
   	public void setFormValues(WebDriver driver)
	{
	  driver.findElement(By.xpath("//*[@id='userId']")).sendKeys("Shamili");
	  driver.findElement(By.xpath("//*[@id='track']")).click();
	  //set the value for 'Shipment for user' and submit form
	}
    public WebElement getNameResultElement(WebDriver driver) {
        //Find the element of 'Shamili' and return it
        WebElement ele=driver.findElement(By.xpath("//td[contains(text(),'Shamili')]"));
        return ele;
    }
    public WebElement getShipmentResultElement(WebDriver driver)
    {
         //Find the element of 'SHIP1236' and return it
         WebElement ele1=driver.findElement(By.xpath("//*[@id='shipment']"));
         return ele1;
    }
    public WebElement getEmailResultElement(WebDriver driver)
    {
        WebElement ele2=driver.findElement(By.xpath("//div[@id='e- mail']"));
        return ele2;
        //Find the element of 'shamili93@gamil.com' and return it
    }
    public boolean validateEmail(String eMailID) {
       //Validate email using regex.
       String regex="\\b[A-Z0-9a-z]+@[a-z]+\\.[a-z]{2,4}\\b";
       Pattern pat =Pattern.compile(regex);
       Matcher mat=pat.matcher(eMailID);
       if(mat.matches())
       return true;
       else
       return false;

    }
    public boolean validateShipmentId(String shipmentId) {
        //Validate shipmentId using regex
        String regex="[A-Z0-9]{8}";
        Pattern pat=Pattern.compile(regex);
        Matcher mat=pat.matcher(shipmentId);
        if(mat.matches())
        return true;
        else
        return false;
        }
    public static void main(String[] args)
	{
	    NameLocator reg=new NameLocator();
	     //Add required code here
	     WebDriver dri=reg.createDriver();
	     reg.navigate(dri);
	     reg.setFormValues(dri);
	     WebElement elem=reg.getNameResultElement(dri);
	     WebElement elem1=reg.getShipmentResultElement(dri);
	     WebElement elem2=reg.getEmailResultElement(dri);
	     String shipid="SHIP1236";
	     String mail="shamili93@gamil.com";
	     boolean val1=reg.validateShipmentId(shipid);
	     boolean val2=reg.validateEmail(mail);
	}
}