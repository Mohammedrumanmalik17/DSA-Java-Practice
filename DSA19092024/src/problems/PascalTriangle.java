package problems;

import java.util.Scanner;

public class PascalTriangle {
	public static void printPascalTriangle(int rows) {
		
		int triangle[][]=new int[rows][rows];
		
		
		for(int i=0;i<rows;i++) {
			
			//print spaces alignment
			for(int j=0;j<rows-i-1;j++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++) {
				//print edge elements i.e 1 and 1
				if(j==0||j==i) {
					triangle[i][j]=1;
				}
				else {
					triangle[i][j]=triangle[i-1][j-1]+triangle[i-1][j];
				}
				System.out.print(triangle[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int rows = scanner.nextInt();
        printPascalTriangle(rows);
		
	}

}
