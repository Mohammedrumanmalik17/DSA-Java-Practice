package acc;

public class ISbNextPrime {
	
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static int nextPrime (int n) {
		int candidate=n+1;
		while(true) {
			if(isPrime(candidate)) {
				return candidate;
			}
			candidate++;
		}
	}
	
	
	
	public static boolean isNextPrime(int prime1,int prime2) {
		
		if(!isPrime(prime1)||!isPrime(prime2)) {
			return false;
		}
		return nextPrime(prime1)==prime2;
	}
	
	
	public static void main(String[] args) {
//		int a = 7;
//		int b=11;
		int a = 7;
		int b=13;
		
		if(isNextPrime(a,b)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
