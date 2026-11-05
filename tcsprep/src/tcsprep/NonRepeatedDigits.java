package tcsprep;
import java.util.*;

public class NonRepeatedDigits {

    public static void NoRepeatedDigits(int n1, int n2) {
        int count = 0;

        for (int i = n1; i <= n2; i++) {
            boolean visited[] = new boolean[10]; // Reset visited array for each number
            int num = i;
            boolean hasRepeatedDigits = false;

            // Check for repeated digits in the number
            while (num > 0) {
                int digit = num % 10;

                // If the digit is already marked as visited, break
                if (visited[digit]) {
                    hasRepeatedDigits = true;
                    break;
                }

                // Mark digit as visited
                visited[digit] = true;
                num = num / 10;
            }

            // If no repeated digits were found, increase the count
            if (!hasRepeatedDigits) {
                count++;
            }
        }

        // Print the result
        System.out.println("Count of numbers without repeated digits: " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        // Call the function to get the count of numbers without repeated digits
        NoRepeatedDigits(n1, n2);
    }
}
