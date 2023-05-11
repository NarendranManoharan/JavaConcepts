package LoggerExample;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class XMLConfigExample {

	static Logger logger=Logger.getLogger(XMLConfigExample.class);
	public static void main(String[] args) {
		
		DOMConfigurator.configure("log4j.xml");
		logger.debug("This is for debug");
		logger.info("This is info message");
		logger.warn("This is warning message");
		logger.error("This is error message");
		logger.fatal("This is fatal message");

	}

}
