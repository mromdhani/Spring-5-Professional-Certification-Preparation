package be.businesstraining;

import be.businesstraining.repository.ComptesRepository;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {

        // Start the factory
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
                "beans.xml");

        // Get the bean
        ComptesRepository repo = context.getBean(ComptesRepository.class);

        repo.avoirLesSoldesSuperieursA(new BigDecimal("0")).forEach(System.out::println);  // Java 8 !!!

        context.close();

        System.out.println("Fin du programme !");

    }
}
