package tcsprep;
import java.util.*;

//print difference of sum of numbers in even and odd positions

public class OddlyEven {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String  number =sc.nextLine();
		int evenSum=0;
		int oddSum = 0;
		
		for(int i = 0;i<number.length();i++) {
			int n = number.charAt(i)-'0';
			
			if(i%2==0) {
				evenSum+=n;
			}
			else {
				oddSum+=n;
			}
		
	
		}
//		int sum = evenSum-oddSum;
//
//		System.out.println(Math.abs(sum));
//		sc.close();
		System.out.println(Math.abs(evenSum-oddSum));
	}

}
