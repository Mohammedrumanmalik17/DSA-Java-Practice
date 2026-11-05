package acc;


import java.util.HashMap;

public class AnagramCheck {
    public static boolean checkStringFormationIsPossible(String s, String r) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Count characters in string s
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Check if we can form string r using characters in s
        for (char c : r.toCharArray()) {
            if (!charCountMap.containsKey(c) || charCountMap.get(c) <= 0) {
                return false;
            }
            charCountMap.put(c, charCountMap.get(c) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        String O = "listen";
        String F = "silent";
        
        System.out.println(checkStringFormationIsPossible(O, F));  // Output: true
    }
}
