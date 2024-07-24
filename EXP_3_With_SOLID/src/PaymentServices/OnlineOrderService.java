package PaymentServices;

public class OnlineOrderService implements OrderService {

    @Override
    public void registerOrder(String customerName) {
        System.out.println("online order registered for " + customerName);
    }

    @Override
    public void processPayment(int foodPrice) {
        System.out.println("online Payment with Price : " + foodPrice + " Tomans!");
    }

}
