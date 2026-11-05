package acc;

import java.util.Scanner;

public class Numbers0n5divisibleby90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read array length and elements from the user
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        
        int[] numbers = new int[n];
        int countOf5 = 0;
        int countOf0 = 0;

        System.out.println("Enter the elements of the array (only 5 and 0 allowed):");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i] == 5) {
                countOf5++;
            } else if (numbers[i] == 0) {
                countOf0++;
            }
        }

        // Check if it's possible to create a number divisible by 90
        if (countOf0 == 0) {
            // No 0 present, cannot form a number ending with 0
            System.out.println(0);
        } else if (countOf5 < 9) {
            // Need at least 9 fives for the sum to be divisible by 9
            System.out.println(0);
        } else {
            // Form the largest number divisible by 90
            StringBuilder result = new StringBuilder();
            
            // Add the maximum number of 5's that is a multiple of 9
            for (int i = 0; i < (countOf5 / 9) * 9; i++) {
                result.append(5);
            }
            
            // Add all the 0's at the end
            for (int i = 0; i < countOf0; i++) {
                result.append(0);
            }
            
            System.out.println(result.toString());
        }

        sc.close(); // Close the scanner
    }
}
//Enter the size of the array:
//11
//Enter the elements of the array (only 5 and 0 allowed):
//5 5 5 5 5 5 5 5 0 5 5
//5555555550

//Enter the size of the array:
//2
//Enter the elements of the array (only 5 and 0 allowed):
//5 
//0
//0
