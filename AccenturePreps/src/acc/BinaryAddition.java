package acc;

import java.util.Scanner;

public class BinaryAddition {

    // Method to add two binary strings
    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder ans = new StringBuilder(); 
        int carry = 0;

        // Loop through both strings from end to start
        while (i >= 0 || j >= 0 || carry > 0) {
            if (i >= 0) {
                carry += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                carry += b.charAt(j) - '0';
                j--;
            }
            // Append the current bit (carry % 2) to the result
            ans.append(carry % 2);
            // Update carry for the next higher position
            carry = carry / 2;
        }

        // Reverse the result to get the correct binary sum
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first binary string: ");
        String a = scanner.nextLine();
        
        System.out.print("Enter second binary string: ");
        String b = scanner.nextLine();

        // Compute the binary addition result
        String result = addBinary(a, b);

        System.out.println("Sum of binary strings: " + result);
        
        scanner.close();
    }
}
//Enter first binary string: 1010
//Enter second binary string: 1010
//Sum of binary strings: 10100



//
//Enter first binary string: 1010
//Enter second binary string: 1011
//Sum of binary strings: 10101