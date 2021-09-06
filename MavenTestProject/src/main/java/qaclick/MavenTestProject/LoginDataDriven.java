package qaclick.MavenTestProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import resources.Base;

public class LoginDataDriven extends Base {
	
	XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCell cell;
    int sh;

	@Test
	public void getExcelData() throws Exception  
	{
		
		driver = initializeBrowser();
		
		Thread.sleep(5000);
		
		File scr = new File("D:\\MyWork\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(scr);
		
		workbook = new XSSFWorkbook(fis);
		
		sh = workbook.getNumberOfSheets();
	    //sheet = workbook.getSheet("Sheet 1");
//		sheet = workbook.getSheetAt(0);
//	    System.out.println();
//		
//		for(int i=1; i<=sheet.getLastRowNum();i++) 
//		{
//			LoginPage login = new LoginPage(driver);
//			login.SignIN().click();
//			cell = sheet.getRow(i).getCell(0);
//			cell.setCellType(CellType.STRING);;
//			login.checkEmail().sendKeys(cell.getStringCellValue());
//			login.Submit().click();
//		}
		
			
		
	}
		
}
