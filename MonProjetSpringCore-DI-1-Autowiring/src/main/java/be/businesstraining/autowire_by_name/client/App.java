package be.businesstraining.autowire_by_name.client;

import be.businesstraining.autowire_by_name.domain.Customer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        try (ConfigurableApplicationContext ctxt = new ClassPathXmlApplicationContext("beans.xml")){
            System.out.println(ctxt.getBean(Customer.class));
        }
    }
}
