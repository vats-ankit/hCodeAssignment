package PageObject.com;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableClass 
{
	WebDriver Currentdriver;
	public WebTableClass(WebDriver Remotedriver) 
	{
		Currentdriver=Remotedriver;
		PageFactory.initElements( Remotedriver,this);
	}
	@FindBy(id="item-3") WebElement button;
	@FindBy(xpath="//div[@class='rt-tr -odd']") List<WebElement> l1;
	
	public void button()
	{
		button.click();
	}
	public void tableData()
	{
		for(WebElement l2:l1)
		{
			String s1=l2.getText();
			System.out.println(s1);
		}
	}

}
