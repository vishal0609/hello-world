package cgs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	String src;
	FileInputStream fis;
	FileInputStream fin1;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFWorkbook wbout;
	XSSFSheet sheetout;
	
	public Excel(String src) throws IOException{
		File path = new File(src);
		File path2 = new File("C:\\CGS Utility\\target.xlsx");
		fis = new FileInputStream(path);
		//fin1 = new FileInputStream(path2);
		fos= new FileOutputStream(path2);
		wb= new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(0);
		wbout= new XSSFWorkbook();
		sheetout = wbout.createSheet("OLB");
	}
	public int rowCount(){
		return sheet.getLastRowNum()+1;
	}
	public String getData(int row,int col){
	return sheet.getRow(row).getCell(col).getStringCellValue();
	}
	public void putData(String custnum,String status,int row){
		System.out.println("Inside Excel");
		System.out.println(custnum+ " "+status+" "+row);
		Cell cell1 = sheetout.createRow(row).createCell(0);
		cell1.setCellValue(custnum);
		
		Cell cell2=sheetout.getRow(row).createCell(1);
		cell2.setCellValue(status);
	}
	public void closeWorkbook() throws IOException{
		wb.close();
		fis.close();
		wbout.write(fos);
		wbout.close();
		fos.close();
		//fin1.close();
	}
}
