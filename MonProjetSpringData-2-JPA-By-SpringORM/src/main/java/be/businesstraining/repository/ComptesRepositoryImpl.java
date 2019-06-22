package be.businesstraining.repository;

import be.businesstraining.domain.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.List;

@Repository
public class ComptesRepositoryImpl implements IComptesRepository {

    @PersistenceContext
    protected EntityManager em;

    @Transactional
    @Override
    public void create(Compte compte) {
        try {
            em.persist(compte);
        } catch (PersistenceException pe) {
            System.out.println("LOG : Exception dans create : "+pe);
        }
    }
    @Transactional(readOnly = true)
    @Override
    public Compte findById(String id) {

        return em.find(Compte.class, id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Compte> findAll() {
       TypedQuery<Compte> comptes = em.createQuery("from Compte c", Compte.class);
        return comptes.getResultList();
    }
    @Override
    public Compte update(Compte compte) {
        return null;
    }

    @Override
    public void delete(String numero) {
    }
}
