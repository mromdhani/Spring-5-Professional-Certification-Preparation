package be.businesstraining;

import be.businesstraining.domain.Compte;
import be.businesstraining.repository.IComptesDao;
import be.businesstraining.services.IComptesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.math.BigDecimal;

@Configuration
@ComponentScan
@PropertySource("classpath:database.properties")
@EnableTransactionManagement
public class AppConfiguration
{
    @Autowired
    private Environment env;

    @Bean
    public DataSource buildDataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName(env.getProperty("jdbc.driverClassName"));
        ds.setUrl(env.getProperty("jdbc.url"));
        ds.setUsername(env.getProperty("jdbc.username"));
        ds.setPassword(env.getProperty("jdbc.password"));
        return ds;
    }

    @Bean
    public PlatformTransactionManager transactionManager(DataSource ds){

        return new DataSourceTransactionManager(ds);
    }


    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfiguration.class);
        context.registerShutdownHook();

        IComptesService service = context.getBean(IComptesService.class);

        Compte c1 = new Compte("NEW_300", "NEW_300", new BigDecimal("123.456"));
        Compte c2 = new Compte("NEW_200", "NEW_200", new BigDecimal("123.456"));

      try {
            service.createTwoAccounts(c1, c2);
       } catch (Exception e) {
           System.out.println("Ouf ... nous venons de loin ! Message: "+ e.getMessage());
        }


        System.out.println(" ==== FIN Du PROGRAMME ======");


    }
}
