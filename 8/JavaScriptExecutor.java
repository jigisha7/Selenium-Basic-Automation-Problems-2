import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class JavaScriptExecutor
{
	public static WebDriver driver;
	public static Object jsfname,jslname, jsuname, jspwd, jsphone, jsemail, jssubmit, jsreset;
	public WebDriver createDriver()
	{
		DriverSetup ds=new DriverSetup();
		driver=ds.getWebDriver();
		return driver;
	}
   public void submitForm(String fname,String lname, String uname, String pwd, String phone, String email)
  {
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    //Using javascript executor, locate the elements of 'firstname','lastname','username','password'
	    //'phonenumber','email' and send the received values.
	    //Submit the form
	    jsfname=jse.executeScript("document.getElementsByName('firstname')[0].value='"+fname+"'");
	    jslname=jse.executeScript("document.getElementsByName('lastname')[0].value='"+lname+"'");
	    jsuname=jse.executeScript("document.getElementsByName('username')[0].value='"+uname+"'");
	    jspwd=jse.executeScript("document.getElementsByName('password')[0].value='"+pwd+"'");
	    jsphone=jse.executeScript("document.getElementsByName('phonenumber')[0].value='"+phone+"'");
	    jsemail=jse.executeScript("document.getElementsByName('email')[0].value='"+email+"'");
	    jssubmit=jse.executeScript("document.getElementById('submit').click()");
  }
  public void reset()
  {
	  JavascriptExecutor jse = ((JavascriptExecutor)driver);
	  //Using javascript executor, locate the element reset and click it.
	  jsreset=jse.executeScript("document.getElementById('reset').click()");
  }
  public static void main(String[] args) {
	    JavaScriptExecutor at=new JavaScriptExecutor();
		WebDriver sri=at.createDriver();
		at.reset();
		//Use this values to submit the form
		at.submitForm("Rahul","Dravid","Rahul","rahul@123","6232126711","rahultest@gmail.com");
	}
}