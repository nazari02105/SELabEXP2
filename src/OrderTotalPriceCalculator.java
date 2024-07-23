public class OrderTotalPriceCalculator {

    private static OrderTotalPriceCalculator instance;

    private OrderTotalPriceCalculator() {}

    public static OrderTotalPriceCalculator getInstance() {
        if (instance == null) instance = new OrderTotalPriceCalculator();
        return instance;
    }

    public int calculateTotalPrice(Order order) {
        int price= order.foods.stream().mapToInt(food -> food.price).sum();
        return price;
    }
}
