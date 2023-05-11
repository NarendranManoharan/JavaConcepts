package LoggerExample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class PropertiesConfigExample {

	static Logger logger=Logger.getLogger(PropertiesConfigExample.class);
	public static void main(String[] args) {
		
        PropertyConfigurator.configure("Log4j.properties");
		logger.debug("This is for debug");
		logger.info("This is info message");
		logger.warn("This is warning message");
		logger.error("This is error message");
		logger.fatal("This is fatal message");

	}

}
