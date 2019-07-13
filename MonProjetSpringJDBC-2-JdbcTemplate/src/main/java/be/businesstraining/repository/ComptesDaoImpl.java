package be.businesstraining.repository;

import be.businesstraining.domain.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ComptesDaoImpl extends  JdbcDaoSupport
                             implements  ComptesDao{

    // @Autowired  The decoration is not necessary as of Spring 4.3+
    public ComptesDaoImpl(DataSource dataSource) {
        setDataSource(dataSource);
    }
    @Override
    public void create(Compte compte) {
        String sql = "INSERT INTO COMPTES (Numero, Proprietaire, Solde) VALUES (?, ?, ?)";

        getJdbcTemplate().update(
                sql,
                new Object[] { compte.getNumero(),
                        compte.getProprietaire(),
                        compte.getSolde()
                });
    }

    @Override
    public Compte findById(String id) {
        String  sql = "SELECT * FROM COMPTES WHERE NUMERO = ?";
        return getJdbcTemplate().queryForObject(sql,
                new Object[]{id},
                    //                (resultSet, i) -> new Compte(
//                              resultSet.getString("Numero"),
//                              resultSet.getString("Proprietaire"),
//                              resultSet.getBigDecimal("Solde"))
//                (resultSet, i) -> new Compte(
//                    resultSet.getString("Numero") ,
//                    resultSet.getString("Proprietaire") ,
//                    resultSet.getBigDecimal("Solde")
//                )
                new BeanPropertyRowMapper<>(Compte.class)
        );
    }

    @Override
    public List<Compte> findAll() {
        return null;
    }

    @Override
    public Compte update(Compte compte) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
