import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[] args) {
        String motto = "Carly's makes the food that brings people together!";
        System.out.println(motto);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of guests attending the event: ");
        int numberOfGuests = scanner.nextInt();

        
        final int pricePerGuest = 35;

        int totalPrice = numberOfGuests * pricePerGuest;

        System.out.println("Number of guests: " + numberOfGuests);
        System.out.println("Price per guest: $" + pricePerGuest);
        System.out.println("Total price: $" + totalPrice);

        boolean isLargeEvent = numberOfGuests >= 50;
        System.out.println("Is this a large event? " + isLargeEvent);

        scanner.close();
    }
}