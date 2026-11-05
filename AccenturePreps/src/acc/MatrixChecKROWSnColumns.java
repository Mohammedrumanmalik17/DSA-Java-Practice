package acc;
import java.util.Scanner;


//java program on 2D matrix to check if kth row is having all elements as 0 and kth column as 1(except k,k)
public class MatrixChecKROWSnColumns {
	public static int  matrixCheckRowsCols(int [][]matrix,int k) {
		
		
		int n=matrix.length;
		
		//check kth row elements are 0
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			if(matrix[k][j]!=0) {
				return -1;
			}
		}
		}
		
		//check for kth column are 1;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i!=k&&matrix[i][k]!=1) {
					return -1;
				}
			}
		}
		
		
		//check for matrix[k][k] to be 0
		
		if(matrix[k][k]==1) {
			return -1;
		}
		return 1;
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int row=sc.nextInt();
		int col=sc.nextInt();
		int [][]matrix=new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				
				matrix[i][j]=sc.nextInt();
				
			}
		}
		
		System.out.println("Enter the kth index(0 indices)");
		int k=sc.nextInt();
		
		int result = matrixCheckRowsCols(matrix,k);
		System.out.println(result);
	}

}

//o/p:
//	
//    3
//	3
//	1 1 1
//	1 0 1
//	0 0 0
//	Enter the kth index(0 indices)
//	2
//	--
//	1
//	
//	o/p
//	
//	

//
//3
//3
//1 1 1
//		1 0 0
//		0 0 0
//Enter the kth index(0 indices)
//
//2
//---
//-1

    

