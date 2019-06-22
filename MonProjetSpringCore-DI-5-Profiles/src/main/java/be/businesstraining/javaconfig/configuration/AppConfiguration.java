package be.businesstraining.javaconfig.configuration;

import be.businesstraining.services.DevelopmentDatabaseEngine;
import be.businesstraining.services.IDatabaseEngine;
import be.businesstraining.services.ProductionDatabaseEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan(basePackages = {"be.businesstraining"})
public class AppConfiguration {

    @Profile("dev")
    @Bean
    public IDatabaseEngine getDevEngine()  {

        return new DevelopmentDatabaseEngine();
    }
    @Profile("prod")
    @Bean
    public IDatabaseEngine getProductionEngine()  {

        return new ProductionDatabaseEngine();
    }
}
