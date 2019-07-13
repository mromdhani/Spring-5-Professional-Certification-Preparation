package be.businesstraining.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="Products")
public class Product {
	@Id
	private String id;
	private String name;	
	private BigDecimal unitPrice;

	
}
