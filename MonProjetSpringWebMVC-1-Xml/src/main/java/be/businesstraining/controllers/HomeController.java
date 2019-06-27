package be.businesstraining.controllers;

import be.businesstraining.services.Greetings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class HomeController {

	@Autowired
	private Greetings greetings;

	@RequestMapping(value = {"/hello","/home", "/"},
			method = RequestMethod.GET)
	public ModelAndView hello() {
		ModelAndView modelAndView =new ModelAndView("welcome");
		modelAndView.addObject("message",
				greetings.getMessage());
		return  modelAndView;
	}
	
}
