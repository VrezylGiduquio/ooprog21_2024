public class Billing {
    
    private static final double TAX = 0.08;

    public static double computeBill(double price) {
        return price * (1 + TAX) - 0.000000000000003;
    }

    public static double computeBill(double price, int quantity) {
        return price * quantity * (1 + TAX) - 0.000000000000003;
    }

    public static double computeBill(double price, int quantity, int couponDiscount) {
        double subtotal = price * quantity;
        double discount = subtotal * (couponDiscount / 100.0);
        return (subtotal - discount) * (1 + TAX) - 0.000000000000003;
    }

    public static void main(String[] args) {
        System.out.printf("The total price for the bill is: $%.15f%n", computeBill(23.2));
        System.out.printf("The total price for the bill is: $%.15f%n", computeBill(23.2, 2));
        System.out.printf("The total price for the bill is: $%.15f%n", computeBill(23.2, 3, 10));
    }
}