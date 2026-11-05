package acc;
import java.util.*;
public class Deci2Binary {
	
//	static int decimal2bin(int n) {
//		int bin=0;
//		while(n>0) {
//			
//			int rem =n%2;
//		 bin =rem;
//			n/=2;
//		}
//		return bin;
//	}
//	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int decimal=sc.nextInt();
		
//		System.out.println(decimal2bin(decimal));
		
	  StringBuilder result= new StringBuilder();
		while(decimal>0) {
			int rem=decimal%2;
			result.append(rem);
	
			decimal/=2;
		}
		System.out.print(result.reverse().toString());
	}

}
