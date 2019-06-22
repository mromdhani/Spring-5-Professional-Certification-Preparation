package be.businesstraining;

import be.businesstraining.services.Calcul;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class AppConfiguration{

    public static void main(String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfiguration.class);
        context.registerShutdownHook();

        Calcul calcul = context.getBean(Calcul.class);
     calcul.additionner(11,22);
     calcul.multiplier(11,22);


    }
}
