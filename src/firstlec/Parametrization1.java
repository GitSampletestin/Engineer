package firstlec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization1 {
public static void main (String[]args) throws EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream ("C:\\Users\\swapn\\Downloads\\sam.xlsx");
	String value = WorkbookFactory.create(file).getSheet("pra").getRow(1).getCell(1).getStringCellValue();
	System.out.println(value);
}
}
