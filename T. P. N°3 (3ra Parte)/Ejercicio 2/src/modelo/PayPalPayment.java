package modelo;

/**
 * Implementación del método de pago con PayPal.
 */
public class PayPalPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}