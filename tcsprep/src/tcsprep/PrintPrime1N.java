package tcsprep;

import java.util.*;
public class PrintPrime1N {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int start=sc.nextInt();
		int end = sc.nextInt();
		for(int i=start;i<=end;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		
	}
	public static boolean isPrime(int num) {
		if(num<2) {
			return false;
			
		}
		for(int i= 2;i<=Math.sqrt(num) ;i++) {
			if(num%i==0) {
				return false;
			}
		
		}
		return true;
	}

}




//public class PrintPrime1N {
//    public static void main(String[] args) {
//        // Define the range from 2 to 9
//        int start = 2;
//        int end = 15;
//
//        // Iterate through each number in the range
//        for (int i = start; i <= end; i++) {
//            // Check if the current number is prime
//            if (isPrime(i)) {
//                System.out.println(i);
//            }
//        }
//    }
//
//    // Function to check if a number is prime
//    public static boolean isPrime(int num) {
//        if (num < 2) {
//            return false; // 0 and 1 are not prime numbers
//        }
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) {
//                return false; // Not a prime number
//            }
//        }
//        return true; // Prime number
//    }
//}
//
