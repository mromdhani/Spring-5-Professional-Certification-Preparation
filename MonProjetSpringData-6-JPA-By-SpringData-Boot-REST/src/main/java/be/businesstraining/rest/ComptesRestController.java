package be.businesstraining.rest;

import be.businesstraining.domain.Compte;
import be.businesstraining.repositories.IComptesRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ComptesRestController {

    private IComptesRepository repository;

    public ComptesRestController(IComptesRepository repository) {
        this.repository = repository;
    }
    @GetMapping("/all")
    public List<Compte> tousLesComptes(){
        return repository.findAll();
    }
    @PostMapping("/add")
    public Compte addCompte(@RequestBody Compte compte){
        return repository.save(compte);
    }
}
