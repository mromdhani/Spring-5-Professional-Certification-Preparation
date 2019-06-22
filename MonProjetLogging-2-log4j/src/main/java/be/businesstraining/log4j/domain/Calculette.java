package be.businesstraining.log4j.domain;

import org.apache.log4j.Logger;

public class Calculette {
	
	public static int diviser(int a, int b){
		Logger logger = Logger.getLogger(Calculette.class.getName());
		logger.info("Je suis dans la méthode diviser - arguments : "+a + " et "+b);
		return a/b;
	}

}
