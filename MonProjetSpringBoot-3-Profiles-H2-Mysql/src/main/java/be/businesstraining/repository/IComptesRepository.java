package be.businesstraining.repository;

import java.math.BigDecimal;
import java.util.List;

import be.businesstraining.domain.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface IComptesRepository extends JpaRepository<Compte, String> {
 
}
