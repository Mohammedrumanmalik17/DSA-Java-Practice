package tcsprep;
import java.util.*;
public class SumOfFactorial {
	 static int factorial(int digit) {
		int fact=1;
		for(int i=1;i<=digit;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int temp=n;
		int sum=0;
		while(temp>0) {
			int r=temp%10;
			sum+=factorial(r);
			temp=temp/10;
			
		}
		if(n==sum) {
			System.out.println("yes");
		}
		else{
			System.out.println("NO");
		
		}
	}

}
