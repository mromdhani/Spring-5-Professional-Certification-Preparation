package be.businesstraining.service;

public class OrderServiceImpl1 implements IOrderService {

    public String getOrderDetails (String orderId) {
        return "Order details from impl 1, for order id=" + orderId;
    }
}