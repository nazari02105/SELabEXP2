package PaymentServices;

public interface OrderService {
    public void registerOrder(String customerName);
    public void processPayment(int amount);

}
