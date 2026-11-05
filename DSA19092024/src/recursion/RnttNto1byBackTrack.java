package recursion;

import java.util.Scanner;

public class RnttNto1byBackTrack {

	
	
	
public static void printNto1(int i,int N) {
		
		if(i<1) {
			return;
		}
		System.out.println(i);
		printNto1(i-1, N);
		
		
	}
	
	
	
	




	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N");
		
		int N=sc.nextInt();
		
		printNto1(N,N);
		sc.close();
	}

}
