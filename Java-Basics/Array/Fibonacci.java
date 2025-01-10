
public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to print
        int[] fibonacci = new int[n];

        // First two Fibonacci numbers
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        // Generate the rest of the Fibonacci numbers
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Print the Fibonacci numbers
        System.out.println("First " + n + " Fibonacci numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}