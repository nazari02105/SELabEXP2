package CustomerServices;

import OrderHandlers.Order;
import OrderHandlers.OrderFormatter;
import OrderHandlers.OrderTotalPriceCalculator;
import PaymentServices.OnSiteOrderService;
import PaymentServices.OnlineOrderService;
import PaymentServices.OrderService;

public class ProcessPaymentService {

    private final Order order;
    private final OrderService orderService;
    private final OrderTotalPriceCalculator orderTotalPriceCalculator;


    public ProcessPaymentService(Order order, OrderService orderService, OrderTotalPriceCalculator orderTotalPriceCalculator) {
        this.order = order;
        this.orderService = orderService;
        this.orderTotalPriceCalculator = orderTotalPriceCalculator;
    }

    public void processPayment() {
        System.out.println("Pay Price:");
        if(this.orderService instanceof OnlineOrderService){
            this.orderService.processPayment(this.orderTotalPriceCalculator.calculateTotalPrice(this.order));
        } else if(this.orderService instanceof OnSiteOrderService){
            this.orderService.processPayment(this.orderTotalPriceCalculator.calculateTotalPrice(this.order));
        }
    }
}
