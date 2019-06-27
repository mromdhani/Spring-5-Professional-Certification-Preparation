package be.businesstraining.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name="Comptes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Compte {
	
	@Id
	private String numero;
	private String proprietaire;
	private BigDecimal solde;

}
