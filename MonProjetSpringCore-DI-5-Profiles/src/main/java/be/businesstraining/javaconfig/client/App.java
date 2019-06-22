package be.businesstraining.javaconfig.client;

import be.businesstraining.javaconfig.configuration.AppConfiguration;
import be.businesstraining.services.IDatabaseEngine;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
    //   applicationContext.getEnvironment().setActiveProfiles("dev");
//
        applicationContext.register(AppConfiguration.class);
        applicationContext.refresh();

        IDatabaseEngine engine = applicationContext.getBean(IDatabaseEngine.class);
        System.out.println(engine.getClass().getName()); // this will print be.businesstraining.domain.ProductionDatabaseEngine
        applicationContext.close();
    }
}
