package Automation.SeleniumFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import resources.Base;

public class excelData extends Base {
	
	HSSFWorkbook workbook;
	HSSFSheet sheet;
	HSSFRow row;
	HSSFCell cell;
	WebDriver driver;
	
	
	@Test(enabled = false)
	public void getExcelData() throws IOException
	{
		driver = openBrowser();
		
		WebElement username = driver.findElement(By.id("login_field"));
		WebElement pwd = driver.findElement(By.id("password"));
		
		File file = new File("E:\\Automation\\Work\\Automation\\TestData.xls");
		FileInputStream inputFile = new FileInputStream(file);
		
		workbook = new HSSFWorkbook(inputFile);
		System.out.println(workbook.getSheetName(0)); 
		sheet = workbook.getSheetAt(0);
		
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		for(int i=1; i<sheet.getLastRowNum(); i++)
		{
			row = sheet.getRow(i);
			cell = row.getCell(0);
			cell.setCellType(CellType.STRING);
			username.sendKeys(cell.getStringCellValue());
			
			cell = row.getCell(1);
			cell.setCellType(CellType.STRING);
			pwd.sendKeys(cell.getStringCellValue());
			
			
//			for (int j=0; j< row.getLastCellNum(); j++ )
//			{
//				//System.out.println(row.getCell(j));
//				//System.out.print(row.getCell(j));
//			
//			}
			System.out.println(cell);
		}
		
//		Iterator<Row> rows = sheet.iterator();
//		Row firstRow = rows.next();
//		
//		Iterator<Cell> cell = firstRow.cellIterator();
//		//cell.next();
//		while(cell.hasNext())
//		{
//			System.out.println(cell.next().getStringCellValue());
//		}
//		
		
			
		
	}
	

}
