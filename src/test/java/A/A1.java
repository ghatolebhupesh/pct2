package A;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A1 {
	
	
	
   public static void main(String[] args) throws Throwable {
File src = new File (".\\dataSource\\TestStatus.xlsx");

FileInputStream ipt = new FileInputStream(src);

XSSFWorkbook wb= new XSSFWorkbook (ipt); 

XSSFSheet sheet = wb.getSheetAt(0);


String B= sheet.getRow(4).getCell(1).getStringCellValue();
	
System.out.println(B);
	
		
		
		
		
		
		
	}
	
	
}

