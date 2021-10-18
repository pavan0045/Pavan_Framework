package demo;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Log4jclass {
	 static Logger log =LogManager.getLogger(Log4jclass.class);
	public static void main(String[] args) {
		System.out.println("Hey hii");
		log.info("This is info massgae");
		log.error("This is an Error message");
	    log.warn("Warnig messgae");
		log.fatal("Fatal messgae");
		
		
	}

}
