package LoggerExample;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicConfiguratorExample {
    
     static Logger logger=Logger.getLogger(BasicConfiguratorExample.class); //Factory design pattern
     
	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		logger.debug("This is for debug");
		logger.info("This is info message");
		logger.warn("This is warning message");
		logger.error("This is error message");
		logger.fatal("This is fatal message");
	}

}
