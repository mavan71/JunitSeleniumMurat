package Day13;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class C02_Log4j {

    public static void main(String[] args) {

        //Logger with default log4j configuration
        // default log level is error

        Logger logger = LogManager.getLogger(C02_Log4j.class.getName());


        logger.trace("This is atrace Message"); //trace
        logger.debug("This is Debug Message");//debug
        logger.info("This is info Message"); //info
        logger.warn("This is warn Message");//warn
        logger.error("This is error Message");//error
        logger.fatal("This is fatal Message");//fatal




    }



}
