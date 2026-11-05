package stringPractice;

public class StringRev {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Ruman");
        
        // Swap characters from front to back
        for(int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;
            
            // Get the characters at front and back
            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);
            
            // Swap the characters
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        
        // Print the reversed string
        System.out.println(sb);
    }
}
