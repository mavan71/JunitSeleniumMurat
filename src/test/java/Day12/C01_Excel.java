package Day12;
import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_Excel {

    //read

    @Test
    public void readExcel() throws IOException {
        //okunacak excel dosyasının path i
        String path=System.getProperty("user.dir")+"\\src\\test\\resources\\excelData.xlsx";
        //path kullanarak oluşturulan file input stream objesi
        FileInputStream fis=new FileInputStream(path);
        //file input stream ile oluşturulan workbook objesi kullanarak oluşturulan file input stream objesi
        Workbook wb= WorkbookFactory.create(fis);

        //sonunda okuma işlemlerine başlıyoruz

        //Workbook Sheet  Row   cell

        //workbook.getSheet("informationData); sheet ismi ile sheet alır
        //workbook.getSheetAt(0);index ile sheet oluşturur

        wb.getSheetAt(0);
        Sheet sheet=wb.getSheetAt(0);
        Row row4=sheet.getRow(3);// 4. row u bize verir
        Cell cell4_6=row4.getCell(5);
        String cellValue=cell4_6.toString();
        System.out.println("cell4_6.toString() = " + cell4_6.toString());
        System.out.println("cellValue = " + cellValue);
        Cell cell4_3= row4.getCell(2);
        System.out.println("cell4_3.toString() = " + cell4_3.toString());
        System.out.println("cell4_3 = " + cell4_3);
        wb.close();
        fis.close();


    }



}
