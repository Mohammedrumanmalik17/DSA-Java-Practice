package tcsprep;
import java.util.*;
public class DiagonalDifferenceMatrix {
	
	public static int diagonalDiff(int [][]matrix,int n) {
		
		int leftTorightSum=0;
		int rightToLeftSum=0;
		
		for(int i=0;i<n;i++) {
			leftTorightSum+=matrix[i][i];
		}
		for(int i=0;i<n;i++) {
			rightToLeftSum+=matrix[i][n-1-i];
		}
		int difference=Math.abs(leftTorightSum -rightToLeftSum);
		return difference;
	}

	
	
	public static void main(String args[]) {
		int n=3;
		int [] []matrix=new int[n][n];
//		int[][]values= {{1,2,3},{4,5,6},{9,8,9}};
		int[][]values= {{11,2,4},{4,5,6},{10,8,-12}};
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j]=values[i][j];
			}
		}
		int result=diagonalDiff(matrix, n);
		System.out.println(result);
	}
}
