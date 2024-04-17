package PageObject.com;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploadClass 
{
	WebDriver Currentdriver;
	public FileUploadClass(WebDriver Remotedriver) 
	{
		Currentdriver=Remotedriver;
		PageFactory.initElements( Remotedriver,this);
	}
	@FindBy(id="item-7") WebElement button;
	@FindBy(id="uploadFile") WebElement uploadfile;
	public void button() throws Exception
	{
		
		//button.click();
		JavascriptExecutor js = (JavascriptExecutor)Currentdriver;
		js.executeScript("arguments[0].click();", button);
	}
	public void uploadfile(String s1) throws Exception
	{
		
		uploadfile.sendKeys(s1);
	
		
	}

}
