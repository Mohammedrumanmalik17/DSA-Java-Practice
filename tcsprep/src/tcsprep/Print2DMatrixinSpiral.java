package tcsprep;
import java.util.*;
public class Print2DMatrixinSpiral {
	public static void main(String[] args) {
		
	
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  int m=sc.nextInt();
	  
	  int matrix[][]=new int[n][m];
	  
	  for(int i=0;i<n;i++) {
		  for(int j=0;j<m;j++) {
			  matrix[i][j]=sc.nextInt();
		  }
	  }
	  
	  int startRow=0;
	  int endRow=n-1;
	  int startCol=0;
	  int endCol=m-1;
	  int i=0;
	  while(i<n*m) {
	  for(int j=startCol;j<=endCol;j++) {
		  System.out.print(matrix[startRow][j]+" ");
		  i++;
	  }
	  startRow++;
	  if(i==n*m) {
		  break;
	  }
	  for(int j=startRow;j<=endRow;j++) {
		  System.out.print(matrix[j][endCol]+" ");
		  i++;
	  }
	endCol--;
	  if(i==n*m) {
		  break;
	  }
	  for(int j=endCol;j>=startCol;j--) {
		  System.out.print(matrix[endRow][j]+" ");
		  i++;
	  }
	  endRow--;
	  if(i==n*m) {
		  break;
	  }
	  for(int j=endRow;j>=startRow;j--) {
		  System.out.print(matrix[j][startCol]+" ");
		  i++;
	  }
	  startCol++;
	  if(i==n*m) {
		  break;
	  }
	  
	  
		
	
	  }  

}
}