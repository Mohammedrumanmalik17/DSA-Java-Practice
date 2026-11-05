package interview;

public class PrintPrimeinRange {
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
	
	
	
	
	
	
	
	public static void printPrime(int l,int r) {
		System.out.println("prime numbers between " +l+" and "+r+ " are : ");
		
		for(int i=l;i<=r;i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		int l=2;
		int r=15;
		printPrime(l,r);
	}

}
