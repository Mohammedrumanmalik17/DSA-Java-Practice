package recursion;

import java.util.Scanner;

public class Print1toNbyBackTracking {
	public static void print1toN(int i,int N) {
		
		if(i<1) {
			return;
		}
		print1toN(i-1, N);
		System.out.println(i);
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N");
		
		int N=sc.nextInt();
		
		print1toN(N,N);
		sc.close();
	}

}
