package filehandling;

import java.io.IOException;

public class TestXlsReaderClass 
{

	public static void main(String[] args) throws IOException 
	{
		Xls_Reader x1= new Xls_Reader("G:\\automationrepository\\BasicCoreJava\\src\\filehandling\\Testdata.xls");
		
		//get row count
		System.out.println(x1.getRowCount("Testdata"));
		
		//get column count
		System.out.println(x1.getColumnCount("Testdata"));
		
		//get cell data
		System.out.println(x1.getCellData("Testdata", 1, 2));
		
		
	}

}
