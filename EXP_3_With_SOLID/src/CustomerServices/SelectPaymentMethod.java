package CustomerServices;

import PaymentServices.OnSiteOrderService;
import PaymentServices.OnlineOrderService;
import PaymentServices.OrderService;

import java.util.Scanner;

public class SelectPaymentMethod {

    private final Scanner scanner;
    private OrderService paymentMethod;

    public SelectPaymentMethod(Scanner scanner) {
        this.scanner = scanner;
    }

    public void selectPaymentMethod(){
        System.out.println("Enter Your Payment Method (1 for online and 2 for on-site):");
        int customerAnswerForPaymentMethod = this.scanner.nextInt();

        OrderService orderService = null;
        if (customerAnswerForPaymentMethod == 1) orderService = new OnlineOrderService();
        else if (customerAnswerForPaymentMethod == 2) orderService = new OnSiteOrderService();

        this.paymentMethod = orderService;
    }

    public OrderService getPaymentMethod() {
        return paymentMethod;
    }
}
