package be.businesstraining.repository;

import be.businesstraining.domain.Compte;

import java.util.List;

public interface IComptesRepository {
    // CRUD go here
    void create (Compte compte);
    Compte findById(String id);
    List<Compte> findAll();
    Compte update (Compte compte);
    void delete (String numero);
}
