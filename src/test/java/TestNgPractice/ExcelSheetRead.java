package TestNgPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetRead {
	public static void main(String[] args) throws IOException {
	
	String path=("C:\\Users\\hp\\eclipse-workspace\\MavenProject\\Excel\\New Microsoft Office Excel Worksheet.xlsx");
	FileInputStream fs=new FileInputStream(path);
	XSSFWorkbook workbook=new XSSFWorkbook(fs);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	XSSFRow row=sheet.getRow(1);
	XSSFCell cell=row.getCell(1);
	System.out.println(cell);
	
	int rowCount=sheet.getLastRowNum()+1;
	System.out.println("Total numbers of row" +rowCount);
	
	int cellcount=sheet.getRow(1).getLastCellNum();
	System.out.println(cellcount);
	
	for(Row row1:sheet) {
		for(Cell cell1:row1) {
			System.out.println(cell1);
		}
	}
	}
}
