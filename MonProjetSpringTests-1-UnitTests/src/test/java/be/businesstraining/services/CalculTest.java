package be.businesstraining.services;

import be.businesstraining.services.Calcul;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
//@ContextConfiguration(classes = Calcul.class)
public class CalculTest {

//    @Test
//    public void contextLoads() {
//        throw new RuntimeException();
//    }

    @Autowired
    private Calcul underTest;

    @Test
    public void testAddition() {

        // ARRANGE (Given = Vocabulaire BDD)
        int i = 5;
        int j = 5;
        int expected = 10;

        // ACT (When)
        int actual = underTest.additionner(i,j);

        // ASSERT (Then)
        assertThat(actual).isEqualTo(expected);

    }

}
