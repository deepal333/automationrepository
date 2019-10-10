package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class SetCellData 
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file= new FileInputStream("G:\\automationrepository\\BasicCoreJava\\src\\filehandling\\Testdata.xls");
		
		HSSFWorkbook wb= new HSSFWorkbook(file);
		
		HSSFSheet sheet=wb.getSheet("Testdata");
		
		HSSFRow row=sheet.getRow(0);
		
		HSSFCell cell=row.getCell(0);

		cell.setCellValue("Teju");
		
		FileOutputStream fileOut = new FileOutputStream("G:\\automationrepository\\BasicCoreJava\\src\\filehandling\\Testdata.xls");
		
		wb.write(fileOut);
	}

}
