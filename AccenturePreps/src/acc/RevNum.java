package acc;

import java.util.*;

public class RevNum {
    public static void main(String[] args) {
        int n = 231;
        

        while (n > 0) {
            int digit = n % 10;

            
            if (digit != 0 ) {
                System.out.print(digit);
                
            }

            n = n / 10;
        }
    }
}
