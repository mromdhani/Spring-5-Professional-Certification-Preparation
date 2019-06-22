package be.businesstraining.repository;

import javax.sql.DataSource;

public interface IRepository {
    void findAll();
    DataSource  revealDatasource();
}
