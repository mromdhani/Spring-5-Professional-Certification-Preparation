package be.businesstraining;

import be.businesstraining.domain.MyBean;
import be.businesstraining.domain.OtherBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycle_2_initMethod_destroyMethod {

    @Bean(initMethod = "myPostConstruct", destroyMethod = "cleanUp")
    public MyBean myBean() {
        return new MyBean();
    }

    @Bean
    public OtherBean otherBean() {
        return new OtherBean();
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new AnnotationConfigApplicationContext(LifeCycle_2_initMethod_destroyMethod.class);

        context.registerShutdownHook();

        System.out.println("-- accessing bean --");
        MyBean bean = context.getBean(MyBean.class);
        bean.doSomething();

        System.out.println("-- finished --");
    }
}