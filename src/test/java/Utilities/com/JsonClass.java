package Utilities.com;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.DataProvider;
import org.json.simple.JSONArray;












public class JsonClass 
{
	@DataProvider(name="DataPrX")
	public String[] jsonreader() throws Exception
	{
		JSONParser jp=new JSONParser();
		FileReader r=new FileReader("C:\\Users\\user\\Documents\\ProjectTouchCode\\Json\\JsonData.json");
		Object obj=jp.parse(r);
		JSONObject jb=(JSONObject) obj;
		JSONArray jar=(JSONArray)jb.get("user");
		String[] ar=new String[jar.size()];
		for(int i=0;i<jar.size();i++)
		{
			JSONObject jb1=(JSONObject)jar.get(i);
			String s1=(String)jb1.get("Full_Name");
			String s2=(String)jb1.get("Email");
			ar[i]=s1 +","+s2;
		}
		return ar;
		
	}

}
