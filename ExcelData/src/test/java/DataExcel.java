import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Common Temp 
		FileInputStream fs=new FileInputStream("C:\\Users\\ak143\\Downloads\\excel.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fs);
		int count=workbook.getNumberOfSheets();
		for(int i=0;i<count;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("Test"))
			{
				XSSFSheet sheet=workbook.getSheetAt(i);
				//Common temp
				Iterator<Row> it=sheet.rowIterator();
				Row row=it.next();
				Iterator<Cell> cell=row.cellIterator();
				
				
				while(cell.hasNext())
				{
					
					Cell value=cell.next();
					
					
					if(value.getStringCellValue().equalsIgnoreCase("Sigma")) {
						
						int rowindex=value.getRowIndex();
						
						
					}	
					
					
				}
				
			
			
		}
		
		

	}

	}}
