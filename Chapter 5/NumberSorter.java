import java.util.Scanner;

public class NumberSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

                if (num1 <= num2 && num2 <= num3) {
                        System.out.println("Numbers in ascending order: " + num1 + " " + num2 + " " + num3);
        } else {
          
            int max = Math.max(num1, Math.max(num2, num3));
            int min = Math.min(num1, Math.min(num2, num3));
            int mid = num1 + num2 + num3 - max - min; 
            System.out.println("Numbers in descending order: " + max + " " + mid + " " + min);
        }

     
        scanner.close();
    }
}