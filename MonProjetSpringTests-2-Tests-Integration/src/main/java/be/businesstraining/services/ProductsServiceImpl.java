package be.businesstraining.services;

import be.businesstraining.domain.Product;
import be.businesstraining.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ProductsServiceImpl implements ProductsService {


	@Autowired
	private ProductsRepository repository;

	@Override
	public BigDecimal calculerMontantFacture() {
		
		// Soit un règle de gestion qui stipule que
		// quand un client commande plus de 3 produits, on lui accorde
		// 10% de remise ...
		
		 BigDecimal total = repository.findAll().
				               stream().
				               map(Product::getUnitPrice).
				               reduce(BigDecimal.ZERO, BigDecimal::add);
		
		return ((repository.findAll()).size() >=3) ?
				total.multiply(BigDecimal.valueOf(0.9)) :
				total;
	}

	public ProductsRepository getRepository() {
		return repository;
	}

	public void setRepository(ProductsRepository repository) {
		this.repository = repository;
	}

}
