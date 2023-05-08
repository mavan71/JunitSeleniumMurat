package Day13;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class C03_Log4j {

    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");
        Logger logger=Logger.getLogger(C03_Log4j.class);

        logger.trace("This is atrace Message"); //trace
        logger.debug("This is Debug Message");//debug
        logger.info("This is info Message"); //info
        logger.warn("This is warn Message");//warn
        logger.error("This is error Message");//error
        logger.fatal("This is fatal Message");//fatal



    }



}
