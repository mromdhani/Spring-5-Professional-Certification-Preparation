package be.businesstraining.services;

import be.businesstraining.domain.Product;
import be.businesstraining.repository.ProductsRepository;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

//@RunWith(SpringRunner.class)
//@SpringBootTest   // Tells  Spring to create an ApplicationContext (Heavy !)

//@ContextConfiguration(classes = {ProductsServiceImpl.class})

@RunWith(MockitoJUnitRunner.class)
public class Test_3_NoSpring_Tests {

     //@Autowired
     @InjectMocks
     ProductsServiceImpl underTest;

    @Mock
    ProductsRepository mockedRepo;

    @Test
    public  void testCalculMontantFactureWithMock () {

        // Arrange
        BigDecimal expected = BigDecimal.valueOf(30*0.9);
        Mockito.when(mockedRepo.findAll()).thenReturn(
                Lists.newArrayList(new Product("Mock1", "Product1", BigDecimal.TEN),
                       new Product("Mock2", "Product2", BigDecimal.TEN),
                        new Product("Mock3", "Product3", BigDecimal.TEN)));

         // Act
        BigDecimal actual = underTest.calculerMontantFacture();

        // Assert
        assertThat(actual).isEqualByComparingTo(expected);
    }

}
