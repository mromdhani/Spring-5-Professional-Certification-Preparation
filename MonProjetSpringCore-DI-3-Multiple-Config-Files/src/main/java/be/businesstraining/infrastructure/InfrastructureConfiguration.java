package be.businesstraining.infrastructure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class InfrastructureConfiguration  {

    @Bean
    IDatasourceService getService() {
        return new DataSourceServiceImpl();
    }

}
