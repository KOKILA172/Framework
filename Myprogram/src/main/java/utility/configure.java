package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class configure  {
	
	
	Properties pro;
	public void configure()
	{
		File src=new File("D:\\Mindtree\\Myprogram\\congif.properties");
		try {
			FileInputStream fis= new FileInputStream(src);
			pro=new Properties();
			
			pro.load(fis);
		} catch (Exception e) {
			
			System.out.println(" Not able to load config file"+e.getMessage());
			
		}
		
	}

	
	

	public String getbrowser()
	{
		return pro.getProperty("browser");
		
	}
	

	public String getStagingurl()
	{
		return pro.getProperty("url");
		
	}
}
