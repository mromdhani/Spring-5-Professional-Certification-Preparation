package be.businesstraining;

import be.businesstraining.infrastructure.InfrastructureConfiguration;
import be.businesstraining.repository.RepositoryConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({InfrastructureConfiguration.class,
        RepositoryConfiguration.class})
public class MainConfiguration {

}
