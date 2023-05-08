package Day12;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class C02_Excel {


    @Test
    public void readExcel() throws IOException {
        String path=System.getProperty("user.dir")+"\\src\\test\\resources\\excelfile.xlsx";
        FileInputStream fis=new FileInputStream(path);
        Workbook wb= WorkbookFactory.create(fis);
        //Öncelikle devamli wb objesi kullanarak sheet row cell locate etmek yerine bir seferliğine tüm datayı
        //Javanın Map objesine taşaoyabiliriz (2 sutun olduğu takdirde)

        Map<String, String> data =new HashMap<>();
        Sheet sheet1=wb.getSheetAt(0);
        //getLastRowNum
        int lastRowIndex=sheet1.getLastRowNum();
        System.out.println("lastRowIndex = " + lastRowIndex);

        int lastRowNumber=sheet1.getPhysicalNumberOfRows();
        System.out.println("lastRowNumber = " + lastRowNumber);

        for (int i = 0; i < lastRowIndex; i++) {

            String country=sheet1.getRow(i).getCell(0).toString();
            String area =sheet1.getRow(i).getCell(1).toString();
            data.put(country,area);



        }
        System.out.println("data = " + data);
        System.out.println(sheet1.getRow(10).getCell(0).toString());

        int satirSayısı=sheet1.getLastRowNum();
        int sutunsayısı =sheet1.getRow(0).getLastCellNum();

        String [][] arr=new String[satirSayısı+1][sutunsayısı+1];
        for (int i = 0; i <= satirSayısı; i++) {
            for (int j = 0; j < sutunsayısı; j++) {
                arr[i][j]=sheet1.getRow(i).getCell(j).toString();
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(arr[4][0]);
    }

}
