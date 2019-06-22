package be.businesstraining.infrastructure;

import javax.sql.DataSource;

public interface IDatasourceService {

    DataSource getDataSource();
}
