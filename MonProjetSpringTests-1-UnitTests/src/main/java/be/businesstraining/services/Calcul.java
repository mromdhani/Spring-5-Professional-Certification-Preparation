package be.businesstraining.services;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class Calcul {

    public int additionner (int... nombres) {
      return Arrays.stream(nombres).sum()+ 1;
    }
}
