public interface Order {
    double calculateTotal(double price, int quantity);
    void placeOrder(String customerName, String address);
}

public interface InvoiceGenerator {
    void generateInvoice(String fileName);
}

public interface NotificationSender {
    void sendNotification(String recipient);
}
