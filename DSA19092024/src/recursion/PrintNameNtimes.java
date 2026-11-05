package recursion;

import java.util.Scanner;

//print your name N times using recursion by taking N as an input from user

public class PrintNameNtimes {
	public static void printName(int i,int N) {
		
		if(i>N) {
			return;
		}
	
			System.out.println("RUMAN");
			printName(i+1, N);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N");
		
		int N=sc.nextInt();
		
		printName(1,N);
		sc.close();
	}

}
