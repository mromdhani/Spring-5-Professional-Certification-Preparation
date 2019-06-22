package be.businesstraining.juli;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Example_1_Basic_Juli_Logger {

	private final static Logger logger = Logger
			.getLogger(Example_1_Basic_Juli_Logger.class.getName());

	public static void main(String[] args) {
		
		logger.setLevel(Level.WARNING);
			
		logger.log(Level.SEVERE, "Something to log as a Servere information");
		logger.log(Level.WARNING, "Something to log as a Warning");
		logger.log(Level.INFO, "Something to log as an Info");
		logger.info("Ceci est une info");
			
		/* HERE IS THE LIST OF LOG Levels of Java UTIL logging
			OFF
			SEVERE
			WARNING
			INFO
			CONFIG
			FINE
			FINER
			FINEST
			ALL
		*/
		
	}
}
