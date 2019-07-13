package be.businesstraining.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HelloSecurityController {

	@Autowired
	private OAuth2AuthorizedClientService authorizedClientService;


	@GetMapping("/hello")
	public String someMessage() {
		return "Hello hello ...";
	}

	@GetMapping(value="/user")
	public Principal printWelcome(Principal principal ) {

		//String name = principal.getName(); //get logged in username
		return principal;

	}
	@GetMapping("/token")
	public OAuth2AccessToken getLoginInfo( OAuth2AuthenticationToken authentication) {
		OAuth2AuthorizedClient client = authorizedClientService
				.loadAuthorizedClient(
						authentication.getAuthorizedClientRegistrationId(),
						authentication.getName());

		return client.getAccessToken();
	}
}
