package be.businesstraining.controller;


import be.businesstraining.domain.Role;
import be.businesstraining.domain.User;
import be.businesstraining.domain.UserLogin;
import be.businesstraining.repository.RoleRepository;
import be.businesstraining.repository.UserRepository;
import be.businesstraining.security.MyUserDetailsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashSet;

@RestController
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    private UserRepository userRepository;
    private RoleRepository roleRepository;

    public UserController(UserRepository userRepository,
                          RoleRepository roleRepository){
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @PostMapping("/register")
    public void register(@RequestBody User user) throws  Exception{

        try {
            User resultUser = userRepository.findByUsername(user.getUsername());
            // Tester si le nom d'utilisatur est déjà réservé
            if (resultUser != null) {
                LOGGER.info("The username " + user.getUsername() + " is already taken !");
                throw new Exception("Username already taken");
            } else {
                // - Ajouter l'utilisateur à la BDD
                //Role role1 = new Role("USER", new HashSet<>(Arrays.asList(user)));
                Role role1 =    roleRepository.findByRole("USER");   //new Role("USER", new HashSet<>(Arrays.asList(user)));
                user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
                user.setRoles(new HashSet<>(Arrays.asList(role1)));
                userRepository.save(user);
                LOGGER.info("The username " + user.getUsername() + " has been added to the database !");
            }
        }
        catch (Exception ex){
            LOGGER.error("Exception lors de l'enregistrement de l'utlisateur");
            throw new Exception("Exception lors de l'enregistrement de l'utlisateur");
        }
    }

}
