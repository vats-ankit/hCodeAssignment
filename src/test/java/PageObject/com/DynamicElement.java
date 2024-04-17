package PageObject.com;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicElement 
{
	WebDriver Currentdriver;
	public DynamicElement(WebDriver Remotedriver) 
	{
		Currentdriver=Remotedriver;
		PageFactory.initElements( Remotedriver,this);
	}
	@FindBy(id="item-4") WebElement button;
	@FindBy(xpath="//button[text()='Click Me']") WebElement Dynamicbutton;
	public void button() 
	{
		
		button.click();
	}
	public void Dynamicbutton() 
	{
		
		JavascriptExecutor js=(JavascriptExecutor)Currentdriver;
		js.executeScript("arguments[0].click();",Dynamicbutton);
	}

}
