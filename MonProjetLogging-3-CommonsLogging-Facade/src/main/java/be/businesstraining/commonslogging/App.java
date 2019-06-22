package be.businesstraining.commonslogging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class App 
{
    public static void main( String[] args )
    {
    	Log log = LogFactory.getLog(App.class);
    	
        log.info("===> Ici Commons Logging - Hello World!" );
    }
}
