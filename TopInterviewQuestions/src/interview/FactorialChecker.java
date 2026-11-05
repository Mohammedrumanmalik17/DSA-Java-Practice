package interview;

public class FactorialChecker {
	public static void usingIteration(int n){
		int fact=1;
	   if(n<0) {
		   System.out.print("1");
	   }
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+ " using Iteration is : "+fact);
	}
	public static int usingRecursion(int num){
		
		if(num==0) {
			return 1;
			
		}
		else {
			return num*usingRecursion(num-1);
		}
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		int n=7;
		int num=7;
		usingIteration(n);
		System.out.println(usingRecursion(num));
	}

}
