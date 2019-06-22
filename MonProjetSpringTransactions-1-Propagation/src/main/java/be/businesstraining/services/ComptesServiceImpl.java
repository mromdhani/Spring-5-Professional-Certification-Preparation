package be.businesstraining.services;

import be.businesstraining.domain.Compte;
import be.businesstraining.repository.IComptesDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ComptesServiceImpl implements IComptesService {

	private IComptesDao dao;
	
	public ComptesServiceImpl(IComptesDao dao) {
		super();
		this.dao = dao;
	}

   @Transactional
   @Override
	public void createTwoAccounts(Compte c1, Compte c2)  {
		dao.create(c1);
		//try {
		dao.create(c2);
//		} catch (RuntimeException e) {
//			throw new Exception("Back to an UNCHECKED EXCEPTION");
//		}
	}

}
