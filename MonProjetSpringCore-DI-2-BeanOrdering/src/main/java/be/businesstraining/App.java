package be.businesstraining;

import be.businesstraining.domain.IRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ComponentScan(basePackages = {"be.businesstraining.domain"})
public class App {

    @Autowired
    private List<IRating> ratings;

    public List<IRating> getRatings() {
        return ratings;
    }
    public void setRatings(List<IRating> ratings) {
        this.ratings = ratings;
    }



    public static void main(String[] args) {
        ConfigurableApplicationContext ctxt = new AnnotationConfigApplicationContext(App.class);
//        System.out.println(ctxt.getBean(App.class).getRatings().get(0).getRating());
//        System.out.println(ctxt.getBean(App.class).getRatings().get(1).getRating());
//        System.out.println(ctxt.getBean(App.class).getRatings().get(2).getRating());
        ctxt.getBean(App.class).getRatings().forEach(System.out::println);

    }

}
