package be.businesstraining;

import be.businesstraining.client.OrderServiceClient;
import be.businesstraining.service.IOrderService;
import be.businesstraining.service.OrderServiceImpl1;
import be.businesstraining.service.OrderServiceImpl2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationRunner {

    @Bean(name = "OrderServiceA")

    public IOrderService orderServiceByProvider1() {
        return new OrderServiceImpl1();
    }

    @Bean(name = "OrderServiceB")

    public IOrderService orderServiceByProvider2() {
        return new OrderServiceImpl2();
    }

    @Bean
    public OrderServiceClient createClient() {
        return new OrderServiceClient();
    }

    public static void main(String... strings) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationRunner.class);
        OrderServiceClient bean = context.getBean(OrderServiceClient.class);
        bean.showPendingOrderDetails();
    }
}
