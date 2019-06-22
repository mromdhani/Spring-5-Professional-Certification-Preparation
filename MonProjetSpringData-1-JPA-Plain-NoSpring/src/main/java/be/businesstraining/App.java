package be.businesstraining;

import be.businesstraining.domain.Compte;
import be.businesstraining.repository.ComptesRepositoryImpl;
import be.businesstraining.repository.IComptesRepository;

import java.math.BigDecimal;

public class App
{
    public static void main( String[] args )
    {
        IComptesRepository repository = new ComptesRepositoryImpl();
        repository.create(new Compte("JPA_Plain_2000", "Some BankAccount", BigDecimal.TEN));
        repository.findAll().forEach(System.out::println);
    }
}
