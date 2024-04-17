package PageObject.com;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxClass 
{
	WebDriver Currentdriver;
	public TextBoxClass(WebDriver Remotedriver) 
	{
		Currentdriver=Remotedriver;
		PageFactory.initElements( Remotedriver,this);
	}
	@FindBy(id="item-0") WebElement ck;
	@FindBy(id="userName") WebElement username;
	@FindBy(id="userEmail") WebElement userEmail;
	@FindBy(id="currentAddress") WebElement currentAddress;
	@FindBy(id="permanentAddress") WebElement permanentAddress;
	@FindBy(xpath = "//button[@id='submit']") WebElement submit;
	
	public void ck()
	{
		ck.click();
	}
	public void username(String s2)
	{
		username.sendKeys(s2);
	}
	public void userEmail(String s3)
	{
		userEmail.sendKeys(s3);
	}
	public void currentAddress(String s4)
	{
		currentAddress.sendKeys(s4);
	}
	public void permanentAddress(String s5)
	{
		permanentAddress.sendKeys(s5);
	}
	
	public void submit()
	{
		//submit.click();
		JavascriptExecutor js = (JavascriptExecutor)Currentdriver;
		js.executeScript("arguments[0].click();", submit);
	}

}
