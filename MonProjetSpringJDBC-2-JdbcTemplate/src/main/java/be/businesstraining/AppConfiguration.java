package be.businesstraining;

import be.businesstraining.domain.Compte;
import be.businesstraining.repository.ComptesDao;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;

@Configuration
@ComponentScan
@PropertySource("classpath:database.properties")
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
    @Primary
    public DataSource buildHikariDataSource(){
        HikariDataSource ds = new HikariDataSource();
        ds.setDriverClassName(env.getProperty("jdbc.driverClassName"));
        ds.setJdbcUrl(env.getProperty("jdbc.url"));
        ds.setUsername(env.getProperty("jdbc.username"));
        ds.setPassword(env.getProperty("jdbc.password"));

        ds.setMinimumIdle(2);
        ds.setMaximumPoolSize(5);

        return ds;
    }

//    @Bean
//    public JdbcTemplate buildJdbcTemplate(){
//        return  new JdbcTemplate(buildHikariDataSource());
//    }

    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfiguration.class);
        context.registerShutdownHook();
//        DataSource dataSource = context.getBean(DataSource.class);
//        try (Connection connection = dataSource.getConnection()) {
//            System.out.println(">>>>> Connexion établie avec succès !");
//            System.out.println("Data Source: "+dataSource.getClass().getName());
//        } catch (SQLException e) {
//            System.out.println("<<<<< LOG : PROBLEME DE CONNEXION: "+e);
//        }
        ComptesDao dao = context.getBean(ComptesDao.class);
       // dao.create(new Compte("Z100", "Ceki - Log4j,SLF4J Creator", BigDecimal.TEN ));
        System.out.println(dao.findById("C1000"));

        System.out.println(" ==== FIN Du PROGRAMME ======");


    }
}
