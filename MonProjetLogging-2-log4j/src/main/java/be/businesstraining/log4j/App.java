package be.businesstraining.log4j;


import org.apache.log4j.Logger;

import be.businesstraining.log4j.domain.Calculette;


public class App 
{
	private static Logger logger = Logger.getLogger(App.class.getName());  
	
   	public static void main( String[] args )
    {
    	
//     Log4j logging levels    
//    	TRACE,
//    	DEBUG,
//    	INFO,
//    	WARN,
//    	ERROR and
//    	FATAL    	
    	  	
      //  logger.log(Level.INFO,  "Mon message LOG : Hello World!" );
    	 logger.info("Mon message LOG : Hello World from LOG4J!" );
    	 
    	 try {
    		 
			int res = Calculette.diviser(11, 0);
			
		} catch (Exception e) {
			logger.error("Attention, il y a eu l'exception :"+ e);
			// Resolve it !
			int res = Calculette.diviser(11, 1);			
			
		}
  
    }
}
