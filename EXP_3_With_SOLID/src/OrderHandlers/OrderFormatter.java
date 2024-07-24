package OrderHandlers;

import java.util.stream.Collectors;

public class OrderFormatter {

    private static OrderFormatter instance;

    private OrderFormatter() {}

    public static OrderFormatter getInstance() {
        if (instance == null) instance = new OrderFormatter();
        return instance;
    }

    public String format(Order order, OrderTotalPriceCalculator orderTotalPriceCalculator) {
        String orders = order.getFoods().stream()
                .map(food -> food.getFoodName() + " -> " + food.getPrice())
                .collect(Collectors.joining("\n"));

        return "Customer: " + order.getCustomerName() + "\nOrders are:\n" + orders +
                "\nTotal Price: " + orderTotalPriceCalculator.calculateTotalPrice(order);
    }
}
