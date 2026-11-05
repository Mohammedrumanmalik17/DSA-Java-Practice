package interview;

public class FibonacciPrint {
	public static void printFibusingIteration(int n){
		int n1=0;
		int n2=1;
		int n3=0;
		
		System.out.print("Fibonacci of "+n+" numbers is "+n1+" "+n2+" ");
		
		
		for(int i=2;i<=n;i++) {
			n3=n1+n2;
			System.out.print(n3+ " ");
			n1=n2;
			n2=n3;
		}
		System.out.println();
		
	}
public static int printFibusingRecursion(int num) {
	
	
	if(num==0) {
		return 0;
	}
	if(num==1) {
		return 1;
		
	}
	return printFibusingRecursion(num-1)+printFibusingRecursion(num-2);
}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int n=10;
		int num=5;
		printFibusingIteration(n);
		System.out.println("Fibonacci till 5 using Recursion : ");
		for(int i=0;i<=num;i++) {
			System.out.print(printFibusingRecursion(i)+ " ");
		}
		
	}
}
