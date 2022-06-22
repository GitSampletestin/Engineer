package firstlec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {

	public static String getData(String sheetname, int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream ("C:\\Users\\swapn\\Downloads\\sam.xlsx");
       String user = WorkbookFactory.create(file).getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
        return user;
        
	}

}
