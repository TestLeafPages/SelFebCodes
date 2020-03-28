package week6.day1.readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public String[][] readExcel() throws IOException {
		
		// Open the WorkBook
		XSSFWorkbook wBook = new XSSFWorkbook("./data1/TC001_CreateLead.xlsx");
		
		// enter Get Sheet
		XSSFSheet sheet = wBook.getSheet("Sheet1");
		
		// Row Count
		int rowCount = sheet.getLastRowNum();
		System.out.println("row count: "+rowCount);
		
		// Cell(Column) Count
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);	
		
		String[][] data = new String[rowCount][columnCount];
		
		//for Row Iterator
		for (int i = 1; i <= rowCount; i++) {
			
			// Enter the Row
			XSSFRow firstRow = sheet.getRow(i);
			
			//for cell iterator
			for (int j = 0; j < columnCount; j++) {
				
				// Enter the column
				XSSFCell cell = firstRow.getCell(j);
				// Action:- Read
				String value = cell.getStringCellValue();
				System.out.println(value);
				
				data[i-1][j] = value;
				
			}
			
		}
		
		return data;
		
		
	}

}
