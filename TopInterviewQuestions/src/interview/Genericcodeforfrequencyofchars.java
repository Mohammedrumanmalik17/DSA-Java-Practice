
package interview;

import java.util.HashMap;
import java.util.Map;

public class Genericcodeforfrequencyofchars {
    public static <T> void printFreqofElements(T[] arr) {
        HashMap<T, Integer> freqMap = new HashMap<>();
        
        // Count the frequency of each element
        for (T ele : arr) {
            freqMap.put(ele, freqMap.getOrDefault(ele, 0) + 1);
        }
        
        // Print the frequency of each element
        for (Map.Entry<T, Integer> entry : freqMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
    
    public static void main(String[] args) {
        // Example 1: Integer Array
        Integer[] intArray = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        System.out.println("Frequency of elements in Integer array:");
        printFreqofElements(intArray);

        // Example 2: String Array
        String[] strArray = {"apple", "banana", "apple", "orange", "banana", "banana"};
        System.out.println("\nFrequency of elements in String array:");
        printFreqofElements(strArray);

        // Example 3: Character Array
        Character[] charArray = {'a', 'b', 'a', 'c', 'b', 'a', 'c', 'c'};
        System.out.println("\nFrequency of elements in Character array:");
        printFreqofElements(charArray);
    }
}
