package recursion;

import java.util.Scanner;

public class PrintNto1 {
	
	//program to print N to 1 i.e 4 3 2 1;
	public static void printN(int N,int i) {
		if(N<i) {
			return;
		}
		System.out.println(N);
		printN(N-1, i);
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N");
		
		int N=sc.nextInt();
		
		printN(N,1);
		sc.close();
	}

}
