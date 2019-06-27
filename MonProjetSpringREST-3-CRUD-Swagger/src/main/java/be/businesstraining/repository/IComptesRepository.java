package be.businesstraining.repository;

import be.businesstraining.domain.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IComptesRepository 
          extends JpaRepository<Compte, String>{

}
