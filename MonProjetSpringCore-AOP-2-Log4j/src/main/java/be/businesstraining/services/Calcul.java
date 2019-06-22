package be.businesstraining.services;

import org.springframework.stereotype.Service;

@Service
public class Calcul {

    public int additionner(int a, int b) {
       // System.out.println(">>>>> LOG : A l'entrée de la méthode additionner");
        int somme = a+b;
       // System.out.println("<<<<< LOG : A la sortie de la méthode additionner");

        return somme;
    }
    public int multiplier(int a, int b) {
        int produit = a*b;
        return produit;
    }

}
