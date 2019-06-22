package be.businesstraining;


import be.businesstraining.domain.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
       try(ConfigurableApplicationContext ctxt =
       new AnnotationConfigApplicationContext(MainConfiguration.class)){
           Product product = ctxt.getBean(Product.class);
           System.out.println(product);
       }
    }
}
