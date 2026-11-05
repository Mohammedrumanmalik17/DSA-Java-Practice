package hashing;


import java.util.HashMap;
import java.util.Scanner;

public class NumberFrequencyUsingHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // HashMap to store frequency of numbers
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Enter the number of queries:");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("Enter the number whose frequency is to be known:");
            int num = sc.nextInt();

            System.out.println("Frequency of " + num + " is: " + freqMap.getOrDefault(num, 0));
        }

        sc.close();
    }
}
