package be.businesstraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.persistence.EntityManagerFactory;

@SpringBootApplication
public class Monprojetspringdata8jpaassociationsmanytomanyApplication {


    public static void main(String[] args) {
        SpringApplication.run(Monprojetspringdata8jpaassociationsmanytomanyApplication.class, args);
    }

}
