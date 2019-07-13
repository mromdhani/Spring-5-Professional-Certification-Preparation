package be.businesstraining.services;

import be.businesstraining.services.ProductsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest   // Tells  Spring to create an ApplicationContext (Heavy !)
public class Test_1_SpringBootTest_Tests {

//    @Test
//    public void contextLoads() {
//
//    }

    @Autowired
    ProductsService underTest;

    @Test
    public  void testCalculMontantFacture () {
        // Arrange
        BigDecimal expected = BigDecimal.valueOf(180);

        // Act
        BigDecimal actual = underTest.calculerMontantFacture();

        // Assert
        assertThat(actual).isEqualByComparingTo(expected);
    }

}
