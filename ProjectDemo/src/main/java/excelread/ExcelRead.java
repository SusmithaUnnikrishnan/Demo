package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	
	public static String readStringData(int row,int col) throws IOException
	{
		f=new FileInputStream("C:\\Users\\SUSMITHA\\Desktop\\Student.xlsx");
		w=new XSSFWorkbook(f);
		sh=w.getSheet("sheet1");
		XSSFRow r=sh.getRow(1);
		XSSFCell c=r.getCell(1);
		return c.getStringCellValue();	
	}
}
