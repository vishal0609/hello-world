package cgs;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path= "C:\\CGS Utility\\source.xlsx";
		Excel excel = new Excel(path);
		int rowcount = excel.rowCount();
		
		for (int i=1;i<rowcount;i++){
			String cust_num= excel.getData(i, 0);
			System.out.println("'"+cust_num);
			excel.putData("'"+cust_num, "Active", i);
		}
		excel.closeWorkbook();
	}

}
