package be.businesstraining.juli;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Example_2_Advanced_Juli_Logger {

	private final static Logger logger = Logger
			.getLogger(Example_2_Advanced_Juli_Logger.class.getName());

	private static FileHandler fh = null;

	public static void init() {
		try {
			fh = new FileHandler("loggerExample.log", false);

		} catch (Exception e) {
			e.printStackTrace();
		}

	//	fh.setFormatter(new SimpleFormatter());
		logger.addHandler(fh);
		logger.setLevel(Level.FINE);
	}

	public static void main(String[] args) {
		
		init();

		logger.log(Level.INFO, "message 1");
		logger.log(Level.SEVERE, "message 2");
		logger.log(Level.WARNING, "message 3");
		System.out.println("Fin du programme ...");

	}

}
