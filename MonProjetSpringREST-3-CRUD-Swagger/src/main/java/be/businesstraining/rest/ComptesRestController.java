package be.businesstraining.rest;

import be.businesstraining.domain.Compte;
import be.businesstraining.repository.IComptesRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/comptes")
public class ComptesRestController {
	
	// Actions
	 private IComptesRepository repository;
	 
	 public ComptesRestController(IComptesRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping
	public List<Compte> tousLesComptes() {
		return repository.findAll();
	}
	
	@GetMapping(path= "/{id}" )
	public  ResponseEntity<Compte> findById(@PathVariable("id") String id) {
		Optional<Compte> resultat =  repository.findById(id);
		if (resultat.isPresent())
			return new ResponseEntity<>(resultat.get(), HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@PostMapping
	public  ResponseEntity<Compte> create( @RequestBody Compte c){
		
		if (!repository.findById(c.getNumero()).isPresent())
		{
			repository.save(c);
			return new ResponseEntity<Compte>(c, HttpStatus.CREATED);
		} else
			return new ResponseEntity<Compte>(HttpStatus.NOT_ACCEPTABLE);
	
	}	
	@PutMapping
	public  ResponseEntity<Compte> update(@RequestBody Compte c){
		 
		 try {
				repository.save(c);
				return new ResponseEntity<Compte>(c, HttpStatus.ACCEPTED);
			} catch (Exception e) {
				return new ResponseEntity<Compte>(HttpStatus.NOT_ACCEPTABLE);
			}
		
	}
	@DeleteMapping(path= "/{id}" )
	public  ResponseEntity<Compte> deleteById(@PathVariable("id") String id) {
		Optional<Compte> resultat =  repository.findById(id);
		if (resultat.isPresent()) {
			 repository.delete(resultat.get());
			 return new ResponseEntity<>(HttpStatus.ACCEPTED);
		}
			
		else
			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
	}


}
