package be.businesstraining.client;

import be.businesstraining.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.Arrays;

public class OrderServiceClient {

    @Resource(name = "OrderServiceB")
    private IOrderService orderService;

    public void showPendingOrderDetails() {
        for (String orderId : Arrays.asList("100", "200", "300")) {
            System.out.println(orderService.getOrderDetails(orderId));
        }
    }
}