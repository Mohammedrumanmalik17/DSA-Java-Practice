package interview;

public class EvenOddcheck {
	public static void checkEvenOrOdd(int n) {
		
		if(n%2==0) {
			System.out.println(n +" is even ");
		}
		else {
			System.out.println(n +" is odd ");
		}
		
	}
	
	
	public static void usingBitwiseAnd(int number) {
		if((number & 1)==0) {
			System.out.println(number +" is even ");
			
		}
		else {
			System.out.println(number +" is odd ");
		}
	}
	
	public static void main(String[] args) {
		int n=2;
		int number=3;
		checkEvenOrOdd(n);
		usingBitwiseAnd(number);
		
	}

}
