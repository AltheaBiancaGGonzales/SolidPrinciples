public class OrderTest {
    public static void main(String[] args) {
        Order orderService = new OrderService();
        InvoiceGenerator pdfInvoiceGenerator = new PDFInvoiceGenerator();
        NotificationSender emailSender = new EmailNotificationSender();

        OrderProcessor processor = new OrderProcessor(orderService, pdfInvoiceGenerator, emailSender);
        processor.processOrder(10.0, 2, "John Doe", "123 Main St", "johndoe@example.com", "order_123.pdf");
    }
}
