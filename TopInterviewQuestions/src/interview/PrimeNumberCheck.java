package interview;

public class PrimeNumberCheck {
	public static boolean isPrime(int number) {
		if(number<2) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(number);i++) {
			if((number%i)==0) {
				return false;
			}
		}
		return true;
	}
	

	
	
	public static void checkPrime(int n) {
		
		if(isPrime(n)) {
			System.out.println(n +" is a prime Number");
		}
		else {
			System.out.println(n +" is not a prime Number");
			
		}
		
	}
	public static void main(String[] args) {
//		int n=7;
//		int n=1;
//		int n=2;
//		int n=0;
//		int n=4;
		int n=13;
//		
		checkPrime(n);
	}
}
