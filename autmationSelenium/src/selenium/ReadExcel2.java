package selenium;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {
	public static void main(String args[]) throws Exception{
		File src = new File("C:\\Users\\Vishal\\Desktop\\testdata.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		int rowcount = sheet1.getLastRowNum();
		
		System.out.println("No of rows:"+rowcount+1);
		
		for (int i =0; i<=rowcount;i++)
		{
		
		String data = sheet1.getRow(i).getCell(0).getRawValue();
		
		
		System.out.println("DAta from excel: "+String.valueOf(data));
		}
		
		wb.close();
		
	}
}
