package be.businesstraining.controller;

import be.businesstraining.domain.Compte;
import be.businesstraining.repository.IComptesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/comptes")
public class ComptesRestController {

	@Autowired
	private IComptesRepository repository;

	@GetMapping
	public List<Compte> tousLesComptes() {
		return  (List<Compte>) repository.findAll();

	}

}
