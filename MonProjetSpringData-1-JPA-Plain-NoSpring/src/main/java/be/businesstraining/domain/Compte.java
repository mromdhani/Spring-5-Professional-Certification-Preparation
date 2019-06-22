/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.businesstraining.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "comptes")
public class Compte implements Serializable  {   
    @Id
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
        return "Compte{" + "numero=" + numero + ", proprietaire=" + proprietaire + ", solde=" + solde + '}';
    }

  
    
    
}
