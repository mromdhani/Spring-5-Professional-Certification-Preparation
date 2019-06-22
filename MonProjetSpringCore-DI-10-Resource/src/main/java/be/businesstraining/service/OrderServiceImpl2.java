package be.businesstraining.service;

public class OrderServiceImpl2 implements IOrderService {

    public String getOrderDetails (String orderId) {
        return "Order details from impl 2, for order id=" + orderId;
    }
}