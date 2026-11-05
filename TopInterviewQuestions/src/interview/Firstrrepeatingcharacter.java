
package interview;

import java.util.HashMap;

public class Firstrrepeatingcharacter {
    public static void main(String[] args) {
        String str = "aaabcccddd";

        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> freq = new HashMap<>();

        // Count the frequency of each character
        for (char ele : str.toCharArray()) {
            freq.put(ele, freq.getOrDefault(ele, 0) + 1);
        }

        // Find the second repeating character
//        int repeatingCount = 0; // Counter to track the repeating characters
        for (char ele : str.toCharArray()) {
            if (freq.get(ele) > 1) { // Check if the character is repeating
//                repeatingCount++;
//                if (repeatingCount == 2) { // Second repeating character found
                    System.out.println("first repeating character: " + ele);
                    return;
                }
            }
        

        // If less than two repeating characters are found
        System.out.println("Less than two repeating characters found.");
    }
}
