package selenium;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String args[]) throws Exception{
		File src = new File("C:\\Users\\Vishal\\Downloads\\Compressed\\poi-bin-3.15-20160924\\poi-3.15\\exceldata\\testdata.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		String data= sheet1.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println("DAta from excel: "+data );
		
		wb.close();
	}
}
