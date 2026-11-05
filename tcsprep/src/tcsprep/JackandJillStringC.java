//package tcsprep;
//
//public class JackandJillStringC {
//	String Jill(String A,String B) {
//		String C;
//		boolean found;
//		for(char c1:A) {
//			found=false;
//			for(char c2:B) {
//				if(c1==c2) {
//					found =true;
//					break;
//				}
//			}
//			if(!found) {
//				C+=c1;
//			}
//			
//		}
//		return C;
//	}
//	public static void main(String[] args) {
//		String A="tiger";
//		String B="ti";
//		String C =Jill(A,B);
//		System.out.println(C);
//		
//	}
//
//}


















package tcsprep;
import java.util.*;
public class JackandJillStringC {

    // Method that removes characters from A that are in B
    static String Jill(String A, String B) {
        StringBuilder C = new StringBuilder(); // Use StringBuilder to build the result string
        boolean found;

        // Loop through characters of A
        for (char c1 : A.toCharArray()) {
            found = false;
            // Check if the character is present in B
            for (char c2 : B.toCharArray()) {
                if (c1 == c2) {
                    found = true;
                    break;
                }
            }
            // If the character is not found in B, add it to C
            if (!found) {
                C.append(c1);
            }
        }

        return C.toString(); // Convert StringBuilder back to String
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String A ;
        A=sc.next();
        
        
        String B;
        B=sc.next();
        String C = Jill(A, B); // Call the Jill method
        System.out.println(C); // Output the result
    }
}
