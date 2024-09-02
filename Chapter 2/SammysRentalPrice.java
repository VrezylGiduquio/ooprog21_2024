import java.util.Scanner;

public class SammysRentalPrice {
    public static void main(String[] args) {
        
        String motto = "Sammy's Seashore Supplies: Your Fun in the Sun Starts Here!";
        System.out.println(motto);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of minutes rented: ");
        int totalMinutes = scanner.nextInt();
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;
        int totalPrice = (hours * 40) + (minutes * 1);
        
        System.out.println("Hours rented: " + hours);
        System.out.println("Additional minutes rented: " + minutes);
        System.out.println("Total rental cost: $" + totalPrice);

        scanner.close();
    }
}