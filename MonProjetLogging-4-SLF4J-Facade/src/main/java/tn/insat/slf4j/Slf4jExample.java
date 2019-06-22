package tn.insat.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jExample 
{
    public static void main( String[] args )
    {
    	Logger logger = LoggerFactory.getLogger(Slf4jExample.class);

    	final String message = "Hello logging!";
    	logger.trace(message);
    	logger.debug(message);
    	logger.info(message);
    	logger.warn(message);
    	logger.error(message);

    	}
    }
