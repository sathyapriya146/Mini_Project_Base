package com.logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Log {
	//Factory Design Pattern
  static Logger log =  Logger.getLogger(Basic_Log.class);
  
  public static void main(String[] args) {
	  
	BasicConfigurator.configure();
	
	log.debug("Debug");
	
	log.info("Information");
	
	log.warn("warn");
	
	log.error("Error");
	
	log.fatal("Fatal");
	
	
	
}
  
}
