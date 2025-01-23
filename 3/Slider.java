import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import java.io.File;
import java.io.IOException;
public class Slider
{  
    //DO NOT Change the class Name
	static String baseUrl="http://webapps.tekstac.com/OnlineShopping/fashion.html"; 
	public static WebDriver driver;
	public static String productInfo;
    public static String quantityInfo;
    public static String priceInfo;
	public WebDriver createDriver()
	{       
	   //DO NOT change the method signature
	   // Implement code to create Driver from DriverSetup and return it
	   // Get the Web Driver and assign it to the driver variable
	   // navigate to the baseUrl
       // return driver
       DriverSetup ds=new DriverSetup();
       driver=ds.getWebDriver();
       driver.get(baseUrl);
       return driver;
	}
	public void implDragnDrop()
	{   
	    //DO NOT change the method signature
        // Locate the source web element that needs to be dragged.
        // Locate the target web element that needs to be dropped.      
        // Creating object of Actions class to build composite actions
        // Performing the drag and drop action
		WebElement source=driver.findElement(By.id("draggable1"));
		WebElement target=driver.findElement(By.id("droppable"));
		Actions Aobj=new Actions(driver);
		Aobj.dragAndDrop(source,target).build().perform();
	}
	
	public void implMoveSlider()
	{   
	    //DO NOT change the method signature
	    // Creating object of Actions class to build composite actions
	    Actions Aobjj=new Actions(driver);
        // Locate the slider web element
        WebElement slider=driver.findElement(By.id("myRange"));
        Aobjj.dragAndDropBy(slider,-10,0).build().perform();
        // Move the slider to '5'
        // For Example
            // You can use the below methods to move the slider
            // * moveToElement(WebElement target)
            // * dragAndDropBy(WebElement source, int xOffset, int yOffset)
            // xOffset value is chosen as given below
                // a. If the 'kg' value is 5 the xOffset is "-10"
                // b. If the 'kg' value is 4 the xOffset is "-20"
                // c. If the 'kg' value is 3 the xOffset is "-40"
                // d. If the 'kg' value is 6 the xOffset is "10"
                // e. If the 'kg' value is 7 the xOffset is "20"
            // yOffset value is default ‘0’
	}
	public String getProductDetail()
	{ 
	    //DO NOT change the method signature
        // Locate the text displaying the product name. 
        // Assign the displaying text to the static variable 'productInfo'
        // Return the text using getText() method.
        productInfo=driver.findElement(By.xpath("//span[@id='product']")).getText();
        return productInfo;
    }
    
    public String getQuantityDetail()
    { 
        //DO NOT change the method signature
        // Locate the text displaying the product quantity(No). 
        // Assign the displaying text to the static variable 'quantityInfo'
        // Return the text using getText() method.
        quantityInfo=driver.findElement(By.xpath("//span[@id='No']")).getText();
        return quantityInfo;
    }
    public String getPriceDetail()
    {  
        //DO NOT change the method signature
        // Locate the text displaying the product price. 
        // Assign the displaying text to the static variable 'priceInfo'
        // Return the text using getText() method.
        priceInfo=driver.findElement(By.xpath("//span[@id='price']")).getText();
        return priceInfo;
    }
	public static void main(String[] args)
	{
	    Slider ex =new Slider();
	    WebDriver dri=ex.createDriver();
	    ex.implDragnDrop();
	    ex.implMoveSlider();
	    String str1=ex.getProductDetail();
	    String str2=ex.getQuantityDetail();
	    String str3=ex.getPriceDetail();
	    //Close the driver
	}
}