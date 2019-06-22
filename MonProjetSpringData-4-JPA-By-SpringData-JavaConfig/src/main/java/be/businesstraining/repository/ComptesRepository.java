package be.businesstraining.repository;

import be.businesstraining.domain.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;


public interface ComptesRepository extends JpaRepository<Compte, String> {

	// Tapez CTRL O et regardez ce que vous avez sous la main ! Waou ...

    //  public List<Compte> findBySoldeIsGreaterThan(BigDecimal mini);

	 @Query(" from Compte c where c.solde >= :mini")
	 public List<Compte> avoirLesSoldesSuperieursA(@Param("mini") BigDecimal mini);

}
