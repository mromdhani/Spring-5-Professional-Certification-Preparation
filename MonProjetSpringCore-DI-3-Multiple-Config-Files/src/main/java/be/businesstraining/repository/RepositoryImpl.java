package be.businesstraining.repository;

import be.businesstraining.infrastructure.IDatasourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public  class RepositoryImpl  implements  IRepository{

    private IDatasourceService data;

    @Autowired
    public RepositoryImpl(IDatasourceService data) {
        this.data = data;
    }

    @Override
    public void findAll() {
        System.out.println("Ceci est un find all Fake !!!");
    }

    @Override
    public DataSource revealDatasource() {
        return data.getDataSource();
    }
}
