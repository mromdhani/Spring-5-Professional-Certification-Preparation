package be.businesstraining.repository;

import be.businesstraining.domain.Compte;
import be.businesstraining.utilities.JPAUtil;

import javax.persistence.*;
import java.util.List;

public class ComptesRepositoryImpl implements  IComptesRepository {

    private EntityManagerFactory emf = JPAUtil.getEntityManagerFactory();

    @Override
    public void create(Compte compte) {
        EntityManager em = emf.createEntityManager();
        final EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(compte);
            em.getTransaction().commit();
        } catch (Exception e) {
            if ((transaction != null) && (transaction.isActive())){
                transaction.rollback();
                System.out.println("LOG : Rollback de de create "+ compte+ " - Pour cause: "+e.getMessage());
            }
        } finally {
            if (em != null)
                em.close();
        }


    }

    @Override
    public Compte findById(String id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Compte.class, id);
        } finally {
            em.close();
        }
    }

    @Override
    public List<Compte> findAll() {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<Compte> comptes = em.createQuery("from  Compte c",Compte.class);
            return comptes.getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public Compte update(Compte compte) {
        return null;
    }

    @Override
    public void delete(String numero) {

    }
}
