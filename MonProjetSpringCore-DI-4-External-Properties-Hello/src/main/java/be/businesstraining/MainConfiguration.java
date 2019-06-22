package be.businesstraining;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan(basePackages = {"be.businesstraining.domain"})
@PropertySource("classpath:product.properties")
public class MainConfiguration {
}
