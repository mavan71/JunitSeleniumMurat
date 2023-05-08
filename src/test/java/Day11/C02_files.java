package Day11;

import org.junit.Test;

public class C02_files {

    @Test
    public void files(){
        //dosya ayırıcı: Windows için "\" mac için "/"
        String fileSeparator = System.getProperty("file.separator");
        System.out.println("fileSeparator = " + fileSeparator);
        //çalışma ortamı (projenin content root u)
        String project=System.getProperty("user.dir");
        System.out.println("project = " + project);
        //home Path
        String home =System.getProperty("user.home");
        System.out.println("home = " + home);


    }
}
