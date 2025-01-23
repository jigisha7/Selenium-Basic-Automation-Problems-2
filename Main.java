import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class Main 
{
    //Do not change the class name
	public static WebDriver driver;
	public static WebElement element;
	public static String alertMessage; // Store the alert error message in this variable
	public static WebDriver setDriver()
	{
		// Create the driver using 'getDriver' method. Assign it to variable 'driver'
		// Return the variable driver
		DriverSetup ds=new DriverSetup();
		driver=ds.getDriver();
		return driver;
	}
	public static void Name(String Name) throws Exception {
		// Method to locate text box Name by its Relative xpath (id) & pass the parameter as input
		driver.findElement(By.xpath("//*[@id='textname']")).sendKeys(Name);
	}
	public static void fatherName(String fatherName) throws Exception{
		// Method to locate text box FatherName by its Absolute xpath & pass the parameter as input
		driver.findElement(By.xpath("//*[@id='fathername']")).sendKeys(fatherName);
	}
	public static void postalAddress(String Address) throws Exception{
		// Method to locate text box PostalAddress by its cssSelector & pass the parameter as input
		driver.findElement(By.cssSelector("#paddress")).sendKeys(Address);
	}
	public static void personalAddress(String Address) throws Exception{ 
		// Method to locate text box PersonalAddress by its Relative xpath (id) & pass the parameter as input
		driver.findElement(By.xpath("//*[@id='personaladdress']")).sendKeys(Address);
	}
	public static void gender() throws Exception{ 
		// Method to locate radio button "Male" by its Relative xpath (name) & select it
		driver.findElement(By.xpath("//*[@name='sex' and @value='male']")).click();
	}
	public static void selectCity(String cityName) throws Exception{ 
		// Method to locate dropdown City by its name & pass the parameter as input
		// Use Select while locating element & to access the value in it
		WebElement ele=driver.findElement(By.name("City"));
		Select selobj=new Select(ele);
		selobj.selectByVisibleText(cityName);
	}
	public static void selectCourse(String courseName) throws Exception{ 
		// Method to locate dropdown Course by its name & pass the parameter as input
		// Use Select while locating element & to access the value in it
	    WebElement elem=driver.findElement(By.name("Course"));
	    Select selobje=new Select(elem);
	    selobje.selectByVisibleText(courseName);
	}
	public static void selectState(String stateName) throws Exception{ 
		// Method to locate dropdown State by its name & pass the parameter as input
		// Use Select while locating element & to access the value in it
	       WebElement eleme=driver.findElement(By.name("State"));
	       Select selobjec=new Select(eleme);
	       selobjec.selectByVisibleText(stateName);
	}
	public static void pincode(String pincode) throws Exception {  
		// Method to locate text box PinCode by its Absolute xpath & pass the parameter as input
		driver.findElement(By.id("pincode")).sendKeys(pincode);
	}
	public static void emailID(String emailID) throws Exception { 
		// Method to locate text box EmailId by its cssSelector (name) & pass the parameter as input
	    driver.findElement(By.id("emailid")).sendKeys(emailID);	
	}
	public static void dob(String dob) throws Exception { 
		// Method to locate text box DOB by its Relative xpath (id) & pass the parameter as input
	    driver.findElement(By.id("dob")).sendKeys(dob);
	}
	public static void phoneNumber(String phoneNumber) throws Exception { 
		// Method to locate text box MobileNo by its Relative xpath (id) & pass the parameter as input
		driver.findElement(By.id("Mobileno")).sendKeys(phoneNumber);
	}
	public static void clickSubmitButton() throws Exception{ 
		// Method to locate the Submit Form Button by its Absolute xpath & click it
		driver.findElement(By.xpath("//*[@value='Submit Form']")).click();
	}
	public static void displayAlertMessage() throws Exception{ 
		// Store the warning message displayed in alert window in a string 'alertMessage' & print it; 
		// And click Ok
		Alert aobj=driver.switchTo().alert();
		alertMessage=aobj.getText();
		System.out.println(alertMessage);
		aobj.accept();
	}
	public static void successMessage() throws Exception { 
		// Method to locate the message content using its Absolute xpath
		// Capture & print the success message
		//System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Registered Successfully')]")).getText());
		WebElement msg=driver.findElement(By.xpath("/html/body/h2"));
		String text=msg.getText();
		System.out.println(text);
	}
	public static void closeBrowser() { 
		// Method to close the Browser
		driver.close();
	}
	public static void main(String[] args) throws Exception {
		// Invoke all the above methods
		// Pass Valid inputs Name as "John", FatherName as "Zayas", Postal & Personal Address as "11,xyz Street", 
		// City as "MUMBAI", Course as "MBA",  State as "MUMBAI", Pincode as "230532"
		// Email as "jackZayas112@mail.com", DOB as "26/07/1999", 
		// Invalid PhoneNumber as "hgdhgch"
		// Later valid PhoneNumber as "9223432128"
		Main obj=new Main();
		WebDriver dri=obj.setDriver();
		obj.Name("John");
		obj.fatherName("Zayas");
		obj.postalAddress("11,xyz Street");
		obj.personalAddress("11,xyz Street");
		obj.gender(); 
		obj.selectCity("MUMBAI"); 
		obj.selectCourse("MBA");
		obj.selectState("MUMBAI");
		obj.pincode("230532");
		obj.emailID("jackZayas112@mail.com"); 
		obj.dob("26/07/1999");
		obj.phoneNumber("hgdhgch");
		//phoneNumber("9223432128"); 
		obj.clickSubmitButton();
		obj.displayAlertMessage();
		obj.phoneNumber("9223432128");
		obj.successMessage();
		obj.closeBrowser();
		
	}

}
