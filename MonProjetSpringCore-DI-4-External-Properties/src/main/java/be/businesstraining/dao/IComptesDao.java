package be.businesstraining.dao;


import be.businesstraining.domain.Compte;

public interface IComptesDao {
	
	public void create(Compte c);
	public Compte findById(String id);
	

}