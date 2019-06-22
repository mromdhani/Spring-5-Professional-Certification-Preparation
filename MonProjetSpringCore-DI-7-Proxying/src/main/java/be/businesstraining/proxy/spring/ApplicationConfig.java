package be.businesstraining.proxy.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ApplicationConfig {

    @Bean
    SpringBean springBean(){
        System.out.println("Creating Spring Bean in "+ getClass().getSimpleName());
        return  new SpringBean();
    }
}
