package tcsprep;
import java.util.*;
public class ISARMSTRONG {
	public static void main(String[] args) {
		
	
	
	
	
	int n=10;
	
	int sum=0;
	int originalNumber=n;
	
	while(n>0) {
		
		int rem = n%10;
		sum+= (Math.pow(rem,3));
		n=n/10;
	
	}
	if(originalNumber==sum) {
		System.out.println("The given number is Armstrong");
	
	}
	else{
		System.out.println("Not an Armstrong number");
	}
}
}
	