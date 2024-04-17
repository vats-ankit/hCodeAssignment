package TestCase.com;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.com.DynamicElement;
import PageObject.com.FileUploadClass;
import PageObject.com.TextBoxClass;
import PageObject.com.WebTableClass;
import Utilities.com.DataDriverTesting;

public class TestCase extends BaseClass
{
	@Test(priority = 0,dataProvider = "DataPro")//TextBox
	void testBox(String username,String Email, String CurrentA,String PermantA)
	{
		driver.get(url);
		TextBoxClass tb=new TextBoxClass(driver);
		tb.ck();
		tb.username(username);
		tb.userEmail(Email);
		tb.currentAddress(CurrentA);
		tb.permanentAddress(PermantA);
		tb.submit();
	}
	@DataProvider(name="DataPro")
	public String [][] searchData() throws Exception
	{
		String filename="TestData/TestData.xlsx";//
		int row=DataDriverTesting.getRowCount(filename,"Sheet1");
		int col=DataDriverTesting.getCellCount(filename,"Sheet1");
		String s1[][]=new String[row-1][col];//
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				s1[i-1][j]=DataDriverTesting.getCellValue(filename,"Sheet1",i,j);
			}
		}
		return s1;
		
	}
	
	@Test(priority = 1)//WebTable
	void webTable() throws Exception
	{
		
		WebTableClass tc=new WebTableClass(driver);
		tc.button();
		tc.tableData();
	}
	@Test(priority = 2)
	void dyanmicElement()
	{
		DynamicElement de=new DynamicElement(driver);
		de.button();
		de.button();
	}
	@Test(priority = 3)//FileUpload
	void fileUpload() throws Exception 
	{
		FileUploadClass uc=new FileUploadClass(driver);
		uc.button();
		String filePath = System.getProperty("user.dir");
		uc.uploadfile(filePath+"\\TestData\\SampleText.txt");
	}
	

}
