package be.businesstraining.xmlconfig.services.client;

import be.businesstraining.services.IDatabaseEngine;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext();
     //   applicationContext.getEnvironment().setActiveProfiles("prod");

        applicationContext.setConfigLocation("classpath:applicationContext.xml");
        applicationContext.refresh();

        IDatabaseEngine engine = applicationContext.getBean(IDatabaseEngine.class);
        System.out.println(engine.getClass().getName()); // this will print be.businesstraining.domain.ProductionDatabaseEngine
        applicationContext.close();

    }
}
