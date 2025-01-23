import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class CustomizedXpath 
{
	static int textBoxcount,labelsCount,buttonCount;  // Store the total count of textbox, label and button in these variables
	static WebDriver driver;
	List<WebElement>  textBox,labelsrow,button;
	By countXpath,labelXpath1,labelXpath2,labelXpath3,buttonXpath;
	WebElement row2xpathelement1,row2xpathelement2;
	String labelTexts,buttonText;
	
	public WebDriver setDriver(){ 
		/*Invoke the Webdriver*/
		/*store in in static variable 'driver' and return it*/
	    DriverSetup ds=new DriverSetup();
	    driver=ds.getDriver();
	    return driver; 
	}
	public void printCount( )
	{
		/*Identify the  text fields by customized xpath
		     print how many text boxes in the page using List  */
		//Select 'all text boxes and store that in  a list ( Use customized xpath locator to identify the elements )
		//Assign your locator to countXpath variable and use that to locate the element
		textBox=driver.findElements(By.xpath("//input[@type='text']"));
		
		//Get the count of elements and store the textboxes count in a variable 'textBoxcount'
		textBoxcount=textBox.size();
		System.out.println(textBoxcount);

		//print 'textBoxcount' that stored the value(count of text boxes)
	}
	public void printLabels()
	{
		//Identify the text field labels by customized xpath
		List<WebElement> labels=driver.findElements(By.xpath("//html/body/div/table/tbody/tr[2]/td"));
//	List<WebElement> labels=driver.findElements(By.xpath("//*xpath"));
		//print how many labels in the page
		labelsCount=labels.size();
		System.out.println(labels.size());
		//Assign your locator to labelXpath1 variable and use that to locate the labels of row 1
	   // labelXpath1=driver.findElement(By.xpath("//html/body/div[2]/table/tbody/tr"));
	    labelXpath1=By.xpath("//html/body/div[2]/table/tbody/tr");
	    driver.findElement(labelXpath1);
    
		//Assign your locator to labelXpath2 variable and use that to locate the first label of row 2
		labelXpath2=By.xpath("//html/body/div[3]/table/tbody/tr/td[1]");
		driver.findElement(labelXpath2);
		
		//Assign your locator to labelXpath3 variable and use that to locate the second label of row 2
	    labelXpath3=By.xpath("//html/body/div[3]/table/tbody/tr/td[3]");
	    driver.findElement(labelXpath3);

		//Add row 2 web elements in list labelsrow
		labelsrow=driver.findElements(By.xpath("//*[@id='result']"));
		//store the Labels count in a variable 'labelsCount'
		//labelsCount=labelsrow.size();
		//put a loop to print all the label text of web elements stored in labelsrow
		for(WebElement ele:labelsrow)
		{
		    System.out.println(ele.getText());
		}
	
	    //print 'labelsCount' that stored the value (count of Labels)  
	System.out.println(labelsCount);

	}
	public void buttonCount(){
		/*Find the element by  customized xpath and print how many buttons in the page */
		//Assign your locator to buttonXpath variable and use that to locate the element
		button=driver.findElements(By.xpath("//button[@type='button']"));
		//store the buttons count in a variable 'buttonCount'
        buttonCount=button.size();
        //put a loop to print all the button text of web elements stored in button
		for(WebElement str : button)
		{
		    System.out.println(str.getText());
		}
		//print 'buttonCount' that stored value (count of buttons) 
	    System.out.println(buttonCount);

	}
	public void closeBrowser()
	{
	    driver.close();
	}
	public static void main(String[] args)
	{
		CustomizedXpath ps=new CustomizedXpath();
		WebDriver dri=ps.setDriver();
	    ps.printCount();
	    ps.printLabels();
	    ps.buttonCount();
	    ps.closeBrowser();
	}
}