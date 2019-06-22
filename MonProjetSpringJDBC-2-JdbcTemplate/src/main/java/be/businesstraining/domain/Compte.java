package be.businesstraining.domain;

import java.math.BigDecimal;

public class Compte {

    private String numero;
    private String proprietaire;
    private BigDecimal solde;

    public Compte() {
    }

    public Compte(String numero, String proprietaire, BigDecimal solde) {
        this.numero = numero;
        this.proprietaire = proprietaire;
        this.solde = solde;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }

    public BigDecimal getSolde() {
        return solde;
    }

    public void setSolde(BigDecimal solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numero='" + numero + '\'' +
                ", proprietaire='" + proprietaire + '\'' +
                ", solde=" + solde +
                '}';
    }
}
