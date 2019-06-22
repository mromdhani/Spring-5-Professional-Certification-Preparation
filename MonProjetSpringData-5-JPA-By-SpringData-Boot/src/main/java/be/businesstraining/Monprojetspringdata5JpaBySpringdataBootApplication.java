package be.businesstraining;

import be.businesstraining.repositories.IComptesRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Monprojetspringdata5JpaBySpringdataBootApplication {

    public static void main(String[] args) {
       SpringApplication.run(Monprojetspringdata5JpaBySpringdataBootApplication.class, args);
    }
    @Bean
    CommandLineRunner runIt(IComptesRepository repository) {
        return  (args) -> {
            repository.findAll().forEach(System.out::println);
        };

    }

}
