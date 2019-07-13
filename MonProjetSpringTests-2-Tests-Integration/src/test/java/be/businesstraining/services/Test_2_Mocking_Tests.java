package be.businesstraining.services;

import be.businesstraining.domain.Product;
import be.businesstraining.repository.ProductsRepository;
import be.businesstraining.services.ProductsService;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
//@SpringBootTest   // Tells  Spring to create an ApplicationContext (Heavy !)

@ContextConfiguration(classes = {ProductsServiceImpl.class})
public class Test_2_Mocking_Tests {


    @Autowired
    ProductsService underTest;

    @MockBean
    ProductsRepository repository;

    @Test
    public  void testCalculMontantFactureWithMock () {
        // Arrange
        BigDecimal expected = BigDecimal.valueOf(30*0.9);
        Mockito.when(repository.findAll()).thenReturn(
                Lists.newArrayList(new Product("Mock1", "Product1", BigDecimal.TEN),
                       new Product("Mock2", "Product2", BigDecimal.TEN),
                        new Product("Mock3", "Product3", BigDecimal.TEN)));

         // Act
        BigDecimal actual = underTest.calculerMontantFacture();

        // Assert
        assertThat(actual).isEqualByComparingTo(expected);
    }

}
