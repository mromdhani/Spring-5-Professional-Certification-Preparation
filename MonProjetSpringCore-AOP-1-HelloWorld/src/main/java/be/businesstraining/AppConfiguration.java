package be.businesstraining;

import be.businesstraining.services.Calcul;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

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
