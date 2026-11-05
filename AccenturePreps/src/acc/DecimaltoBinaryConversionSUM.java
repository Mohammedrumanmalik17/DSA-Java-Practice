package acc;

import java.util.*;
public class DecimaltoBinaryConversionSUM
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int decimalNumber = sc.nextInt();
	int sum=0;
	while(decimalNumber>0){
	    sum+=decimalNumber%2;
	    decimalNumber/=2;
	    
	}
		System.out.println(sum);
	}
}
//int n=10;
//10 to binary -> 1 0 1 0
//sum =1+0+1+0=2;