package be.businesstraining;

import be.businesstraining.domain.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Customer obj = (Customer) context.getBean("customerBean");
        System.out.println(obj);
    }
}
