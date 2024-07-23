package OrderHandlers;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {
    String customerName;
    ArrayList<Food> foods = new ArrayList<>();
    LocalDateTime orderDate= LocalDateTime.now();

    public Order(String customerName){
        this.customerName= customerName;
    }

    public void addItem(Food food){
        this.foods.add(food);
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }

    public String getCustomerName() {
        return customerName;
    }
}
