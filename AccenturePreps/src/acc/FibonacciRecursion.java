package acc;

public class FibonacciRecursion {
    public static void main(String[] args) {
        int n = 5; // Number of terms in the Fibonacci sequence to display
        System.out.println("Fibonacci sequence up to " + n + " terms:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Recursive method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) { // Base cases: F(0) = 0, F(1) = 1
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Recursive step
        }
    }
}



// using for loop:


//public class FibonacciForLoop {
//    public static void main(String[] args) {
//        int n = 10; // Number of terms in the Fibonacci sequence to display
//
//        System.out.println("Fibonacci sequence up to " + n + " terms:");
//
//        // Declare the first two Fibonacci numbers
//        int a = 0; // F(0)
//        int b = 1; // F(1)
//
//        // Print the Fibonacci sequence using a for loop
//        for (int i = 0; i < n; i++) {
//            System.out.print(a + " "); // Print the current Fibonacci number
//
//            // Calculate the next Fibonacci number
//            int next = a + b;
//            a = b; // Move to the next number in the sequence
//            b = next; // Update b to the next Fibonacci number
//        }
//    }
//}
