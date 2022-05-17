package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldata {

	XSSFWorkbook wb;
	public Exceldata()  {
		
		File src =new File("D:\\Mindtree\\Myprogram\\Excel\\Testdata.xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			
			wb=new XSSFWorkbook(fis);
		} 
		 catch (Exception e) {
			 
			 System.out.println("Unable to read excel file" + e.getMessage());
		
		}
		
	}
	
	
	
	public String getStringData(String first,int row,int coloumn)
	{
	return wb.getSheet("first").getRow(0).getCell(0).getStringCellValue();
	}
	
	
	public double getNumericData(String sheetName,int row,int coloumn)
	
	{
		return wb.getSheet(null).getRow(0).getCell(0).getNumericCellValue();
	}
}












