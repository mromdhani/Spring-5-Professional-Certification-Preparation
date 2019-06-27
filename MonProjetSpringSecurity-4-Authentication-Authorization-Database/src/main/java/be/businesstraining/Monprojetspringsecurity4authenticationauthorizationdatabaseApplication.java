package be.businesstraining;

import be.businesstraining.domain.Role;
import be.businesstraining.domain.User;
import be.businesstraining.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Arrays;
import java.util.HashSet;

@SpringBootApplication
public class Monprojetspringsecurity4authenticationauthorizationdatabaseApplication {


    public static void main(String[] args) {
        SpringApplication.run(Monprojetspringsecurity4authenticationauthorizationdatabaseApplication.class, args);
    }

    @Bean
	BCryptPasswordEncoder encoder() {
    	return 	new BCryptPasswordEncoder();
	}


//	@Bean
//    CommandLineRunner runIt(UserRepository userRepo) {
//		return args -> {
//
//			User user1 = new User("user", encoder().encode("password"), true, null);
//			Role role1 = new Role("USER", new HashSet<>(Arrays.asList(user1)));
//			user1.setRoles(new HashSet<>(Arrays.asList(role1)));
//
//			User user2 = new User("admin", encoder().encode("password"), true, null);
//			Role role2 = new Role("ADMIN", new HashSet<>(Arrays.asList(user2)));
//			user2.setRoles(new HashSet<>(Arrays.asList(role2)));
//
//			userRepo.save(user1);
//			userRepo.save(user2);
//
//			System.out.println("Fin du programme ...");
//
//		};
//	}


}
