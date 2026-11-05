package recursion;

public class FibonacciusingRecursion {
	
	
	
	public static void main(String[] args) {
		
//		int n=5;
		int n=7;
		
		System.out.println("Fibonacci of " +n+ " is : " +fibonacci(n));
		System.out.println();
		
		System.out.println("Fibonacci terms are as follows :");
		for(int i=0;i<n;i++) {
			
			if(i==n-1) {
			System.out.print(fibonacci(i));
			}
			else {
				System.out.print(fibonacci(i)+ ",");
			}
		}
		
	}
	public static int fibonacci(int n) {
		
		if(n<=1) {
			return n; //base condition
		}
		
		return fibonacci(n-1)+fibonacci(n-2);
	}

}
