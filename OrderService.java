
public class OrderService implements Order {
    @Override
    public double calculateTotal(double price, int quantity) {
        return price * quantity;
    }

    @Override
    public void placeOrder(String customerName, String address) {
        System.out.println("Order placed for " + customerName + " at " + address);
    }
}

public class PDFInvoiceGenerator implements InvoiceGenerator {
    @Override
    public void generateInvoice(String fileName) {
        System.out.println("Invoice generated: " + fileName);
    }
}

public class EmailNotificationSender implements NotificationSender {
    @Override
    public void sendNotification(String email) {
        System.out.println("Email notification sent to: " + email);
    }
}
