package excelutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EmpExcelDateReaderService {

	

	public static void readFromExcel(String file) throws IOException {
		
		
		
		XSSFWorkbook myExcelBook = new XSSFWorkbook(new FileInputStream(file));
		XSSFSheet myExcelSheet = myExcelBook.getSheet("Sheet1");
		
		System.out.println(myExcelSheet.getPhysicalNumberOfRows());
		
		int rowNo=0;
		XSSFRow row = myExcelSheet.getRow(rowNo);	
		
		
			if (row.getCell(0).getCellType() == HSSFCell.CELL_TYPE_STRING) {
				String name = row.getCell(0).getStringCellValue();
				System.out.println("NAME : " + name);
			}
	
		myExcelBook.close();
		
	}

}
