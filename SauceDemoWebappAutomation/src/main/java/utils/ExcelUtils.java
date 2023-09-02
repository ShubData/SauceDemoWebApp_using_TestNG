package utils;

import java.io.FileInputStream;
import java.util.Iterator;



import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelUtils {
public static Object [][] readExcel(String excelPath, String sheetName) {
	String excel_Path = excelPath;
	Object [][]obj = null;
	Workbook wb = null;
	try {
		wb = new XSSFWorkbook(new FileInputStream(excel_Path));
		Sheet sh  = wb.getSheet(sheetName);
		int totalSheetRows = sh.getLastRowNum();
		for (int i = 0; i <= totalSheetRows; i++) {
			Row row = sh.getRow(i);
			int totalSheetCol = row.getLastCellNum();
		
		
		obj = new Object[totalSheetRows+1][totalSheetCol];
		for (int j = 0; j < totalSheetCol; j++) {
			Cell cell = row.getCell(j);
			//System.out.println(cell.getStringCellValue());
			obj[i][j]=cell.getStringCellValue();
		}
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
			wb.close(); 
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
	return obj;
	
}
}
