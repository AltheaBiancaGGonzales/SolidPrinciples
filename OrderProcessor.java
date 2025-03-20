public class OrderProcessor {
    private final Order order;
    private final InvoiceGenerator invoiceGenerator;
    private final NotificationSender notificationSender;

    public OrderProcessor(Order order, InvoiceGenerator invoiceGenerator, NotificationSender notificationSender) {
        this.order = order;
        this.invoiceGenerator = invoiceGenerator;
        this.notificationSender = notificationSender;
    }

    public void processOrder(double price, int quantity, String customerName, String address, String email, String invoiceFile) {
        double total = order.calculateTotal(price, quantity);
        System.out.println("Order Total: $" + total);
        order.placeOrder(customerName, address);
        
        invoiceGenerator.generateInvoice(invoiceFile);
        notificationSender.sendNotification(email);
    }
}
