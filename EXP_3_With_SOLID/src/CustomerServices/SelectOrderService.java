package CustomerServices;

import OrderHandlers.Food;
import OrderHandlers.Order;

import java.util.Scanner;

public class SelectOrderService {

    private final Scanner scanner;
    private final Order order;

    public SelectOrderService(Scanner scanner, Order order) {
        this.scanner = scanner;
        this.order = order;
    }

    public void selectOrders() {
        int customerAnswerForOrder=0;
        while (customerAnswerForOrder != 3){
            System.out.println("For Ordering Sandwich enter 1.");
            System.out.println("For Ordering Pizza enter 2.");
            System.out.println("For submit your order enter 3");
            customerAnswerForOrder = this.scanner.nextInt();

            if(customerAnswerForOrder==1){
                this.order.addItem(new Food("sandwich",1000));
            } else if(customerAnswerForOrder==2){
                this.order.addItem(new Food("pizza",2000));
            }
        }
    }
}
