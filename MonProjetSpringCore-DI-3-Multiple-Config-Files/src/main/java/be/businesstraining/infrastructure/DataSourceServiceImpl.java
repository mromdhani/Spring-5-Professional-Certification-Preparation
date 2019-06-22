package be.businesstraining.infrastructure;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

public class DataSourceServiceImpl  implements  IDatasourceService{
    @Override
    public DataSource getDataSource() {
        return new DriverManagerDataSource();
    }
}
