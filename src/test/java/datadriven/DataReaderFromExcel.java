package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataReaderFromExcel {

	public static void main(String[] args) throws IOException {

		String excelFilePath = ".\\Datafiles\\workbook.xlsx";
		FileInputStream fin = new FileInputStream(excelFilePath);

		XSSFWorkbook workbook = new XSSFWorkbook(fin);
		XSSFSheet sheet = workbook.getSheetAt(0); // XSSFSheet sheet = workbook.getSheet("sheetname");

		// we can iterate by two ways first using for loop, second iterator
		// by for loop
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();

		for (int r = 0; r <= rows; r++) {
			XSSFRow row = sheet.getRow(r);

			for (int c = 0; c <= cols; c++) {
				XSSFCell cell = row.getCell(c);

				switch (cell.getCellType()) {
				case STRING:
					System.out.println(cell.getStringCellValue());
					break;

				case NUMERIC:
					System.out.println(cell.getNumericCellValue());
					break;
					
				case _NONE:
					System.out.println("now value");
					break;
				default:
					System.out.println("def value");
					break;

//				case BOOLEAN:
//					System.out.println(cell.getBooleanCellValue());
//					break;
				}

				System.out.print("  |  ");

			}
			//workbook.close();
			System.out.println();

		}
	}
}
