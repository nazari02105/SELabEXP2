import CustomerServices.ProcessPaymentService;
import CustomerServices.SelectOrderService;
import CustomerServices.SelectPaymentMethod;
import OrderHandlers.Food;
import OrderHandlers.Order;
import OrderHandlers.OrderFormatter;
import OrderHandlers.OrderTotalPriceCalculator;
import PaymentServices.OnSiteOrderService;
import PaymentServices.OnlineOrderService;
import PaymentServices.OrderService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String customerName;

        Order order;
        OrderTotalPriceCalculator orderTotalPriceCalculator = OrderTotalPriceCalculator.getInstance();
        OrderFormatter orderFormatter = OrderFormatter.getInstance();

        SelectOrderService selectOrderService;
        SelectPaymentMethod selectPaymentMethod;
        ProcessPaymentService processPaymentService;
        OrderService paymentMethod;

        System.out.println("Enter Customer Name : ");
        customerName = scanner.nextLine();
        order = new Order(customerName);

        //Step 1 : Select Order Items
        selectOrderService = new SelectOrderService(scanner, order);
        selectOrderService.selectOrders();

        //Step2 : Select Payment Method
        selectPaymentMethod = new SelectPaymentMethod(scanner);
        selectPaymentMethod.selectPaymentMethod();
        paymentMethod = selectPaymentMethod.getPaymentMethod();

        //Step3 : pay price
        processPaymentService = new ProcessPaymentService(order, paymentMethod, orderTotalPriceCalculator);
        processPaymentService.processPayment();

        //Finally Print Bill
        System.out.println(orderFormatter.format(order, orderTotalPriceCalculator));

    }

}
