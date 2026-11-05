package interview;

import java.util.Scanner;

public class MatrixMultiplication {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows and columns of matrixA");
		int rowsA=sc.nextInt();
		int colsA=sc.nextInt();
		int matrixA[][]=new int[rowsA][colsA];
		System.out.println("Enter the elements");
		
		for(int i=0;i<rowsA;i++) {
			for(int j=0;j<colsA;j++) {
				matrixA[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter rows and columns of matrixB");
		int rowsB=sc.nextInt();
		int colsB=sc.nextInt();
		int matrixB[][]=new int[rowsB][colsB];
		System.out.println("Enter elements");
		for(int i=0;i<rowsB;i++) {
			for(int j=0;j<colsB;j++) {
				matrixB[i][j]=sc.nextInt();
			}
		}
		
		if(colsA!=rowsB) {
			System.out.println("Matrix multiplication is not possible");
			return;
			
		}
		
		int resultantMatrix[][]=new int[rowsA][colsB];
		
		for(int i=0;i<rowsA;i++) {
			for(int j=0;j<colsB;j++) {
				for(int k=0;k<colsA;k++) {
					resultantMatrix[i][j]+=matrixA[i][k]*matrixB[k][j];
				}
			}
		}
		System.out.println("Resultant Matrix :");
		for(int i=0;i<rowsA;i++) {
			for(int j=0;j<colsB;j++) {
			System.out.print(resultantMatrix[i][j]+" ");
			
			}
			System.out.println();
		}
	
		
		
	}

}
