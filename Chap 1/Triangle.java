public class Triangle{
    public static void main(String[] args) {
        int rows = 5;  // Number of rows in the triangle

        for (int i = 1; i <= rows; i++) {
            // Print spaces to align the 'T's to the right
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Print 'T' characters to form the triangle
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("T");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
