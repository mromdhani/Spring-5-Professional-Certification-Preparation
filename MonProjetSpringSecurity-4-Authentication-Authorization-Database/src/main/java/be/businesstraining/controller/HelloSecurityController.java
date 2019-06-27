package be.businesstraining.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"","/"})
public class HelloSecurityController {
	
	 @RequestMapping({"/home", "/"})
	    public String home(){
	        return "Hello :: This is app home";
	}
	 
	@GetMapping("/admin") 
	//@PreAuthorize("hasAuthority('ADMIN')")
	public String actionSecrete() {
		return "Ceci est un secret, Gardez-le monsieur admin !!!";
	}

	@GetMapping("/user") 
	//@PreAuthorize("hasAuthority('USER')")
	public String actionPublique() {
		return "Ceci est de l'ordre du public pour tous les users !!!";
	}

}
