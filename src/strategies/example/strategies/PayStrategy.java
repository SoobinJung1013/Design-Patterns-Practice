package strategies.example.strategies;

public interface PayStrategy {

    void collectPaymentDetails();

    boolean pay(int paymentAmount);
}
