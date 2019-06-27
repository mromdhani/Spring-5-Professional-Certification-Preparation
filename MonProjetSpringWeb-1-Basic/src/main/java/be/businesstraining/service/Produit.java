package be.businesstraining.service;

public class Produit {
	
	private String libelle;
	private double prix;

	public Produit() {
	}

	public Produit(String libelle, double prix) {
		super();
		this.libelle = libelle;
		this.prix = prix;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

}
