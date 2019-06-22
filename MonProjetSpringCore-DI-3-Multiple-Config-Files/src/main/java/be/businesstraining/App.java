package be.businesstraining;

import be.businesstraining.repository.IRepository;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        try (ConfigurableApplicationContext ctxt=
              new AnnotationConfigApplicationContext(MainConfiguration.class)) {

            ctxt.getBean(IRepository.class).findAll();
            System.out.println("Datasource JDBC : "+ctxt.getBean(IRepository.class).revealDatasource());

        }
    }
}
