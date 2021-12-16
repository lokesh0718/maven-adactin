package data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.binary.XSSFBCommentsTable;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Particular_data {

	public static void particular_read_data() throws IOException {

		File f = new File("C:\\Users\\Lokesh M\\eclipse-workspace\\Maven_adactin\\read_data\\Book1_demo.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(0);

		Row getrow = sheetAt.getRow(2);

		Cell getcell = getrow.getCell(0);

		CellType cellType = getcell.getCellType();

		if (cellType.equals(CellType.STRING)) {

			String Value = getcell.getStringCellValue();

			System.out.println(Value);

		} else if (cellType.equals(CellType.NUMERIC)) {

			double numericCellValue = getcell.getNumericCellValue();

			System.out.println(numericCellValue);

		}

		System.out.println("particular read data completed");

		System.out.println("*******************************************************");

	}

	public static void all_data() throws Throwable {
		File f = new File("C:\\Users\\Lokesh M\\eclipse-workspace\\Maven_adactin\\read_data\\Book1_demo.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(0);

		int NumberOfRows = sheetAt.getPhysicalNumberOfRows();

		for (int i = 0; i < NumberOfRows; i++) {

			Row row = sheetAt.getRow(i);

			int NumberOfCells = row.getPhysicalNumberOfCells();

			for (int j = 0; j < NumberOfCells; j++) {
				Cell cell = row.getCell(j);

				CellType cellType = cell.getCellType();

				if (cellType.equals(CellType.STRING)) {

					String Value = cell.getStringCellValue();

					System.out.println(Value);

				} else if (cellType.equals(CellType.NUMERIC)) {

					double numericCellValue = cell.getNumericCellValue();

					int value1 = (int) numericCellValue;

					System.out.println(value1);
				}

			}

		}

		System.out.println("all data taken");
		System.out.println("******************************************************");
	}

	public static void particular_row_data() throws IOException {

		File f = new File(
				"C:\\\\Users\\\\Lokesh M\\\\eclipse-workspace\\\\Maven_adactin\\\\read_data\\\\Book1_demo.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		Row r = s.getRow(1);
		for (int i = 0; i < r.getPhysicalNumberOfCells(); i++) {

			Cell c = r.getCell(i);

			CellType ct = c.getCellType();

			if (ct.equals(CellType.STRING)) {

				String v1 = c.getStringCellValue();
				System.out.println(v1);

			} else if (ct.equals(CellType.NUMERIC)) {

				double v2 = c.getNumericCellValue();
				int v3 = (int) v2;
				System.out.println(v3);

			}

		}
		System.out.println("*********************************");
	}

	public static void particular_cell_data() throws IOException {
		File f = new File(
				"C:\\\\Users\\\\Lokesh M\\\\eclipse-workspace\\\\Maven_adactin\\\\read_data\\\\Book1_demo.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		Row r = s.getRow(3);

		for (int i = 0; i < r.getPhysicalNumberOfCells(); i++) {

			Cell c = r.getCell(i);

			CellType ct = c.getCellType();

			if (ct.equals(CellType.STRING)) {

				String v = c.getStringCellValue();
				System.err.println(v);
			}

			else if (ct.equals(CellType.NUMERIC)) {

				double v2 = c.getNumericCellValue();
				int v3 = (int) v2;
				System.out.println(v3);
			}

		}

	}

	public static void main(String[] args) throws Throwable {

		try {
			int z=6;
			System.out.println(z/0);
		}catch(Throwable e) {
			
			System.err.println("Arithmetic Exception");
			
		}
		System.err.println("Hi hello");
		System.err.println("Hhello");
		particular_read_data();
		all_data();
		particular_row_data();
        particular_cell_data();
	}

}
