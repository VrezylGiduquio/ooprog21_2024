import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci numbers: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next(); 
            System.out.print("Enter the number of Fibonacci: ");
        }

        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            for (int i = 0; i < num; i++) {
                System.out.printf("fibonacci(%d) = %d%n", i, fibonacci(i));
            }
        }

        scanner.close();
    }

    private static int fibonacci(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }
}
