package test3.in;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetAllTheData {

	public static void main(String[] args) throws  IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\chand\\SELENIUM\\Book1.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		DataFormatter format=new DataFormatter();
		for(int i=0;i<=sh.getLastRowNum();i++)
		{
			Row r=sh.getRow(i);
			for(int j=0;j<r.getLastCellNum();j++);
			{
				String value=format.formatCellValue(r.getCell(i));
				System.out.print(value);
			}
			System.out.println();
		}
		
	}
}
