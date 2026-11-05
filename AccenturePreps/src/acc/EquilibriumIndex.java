package acc;
import java.util.*;

public class EquilibriumIndex {
	public static void  findEqindex(int []A,int N) {
		
		int totalsum=0;
		for(int num:A) {
			totalsum+=num;
			
		}
		int leftSum=0;
		int ans=-1,i;
		
		for( i=0;i<N;i++) {
			if(leftSum==(totalsum - leftSum - A[i])) {
				ans=i;
				break;
			}
			leftSum+=A[i];
		}
		if(ans==-1) {
			System.out.println("Not found");
 
			
		}
		else {
			System.out.println("Equilibrium index:"+(i+1));
		}
	
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		
		for(int i=0;i<N;i++) {
			
			A[i]=sc.nextInt();
			
		}
		
		findEqindex(A,N);
		
	}

}


//7
//-7 2 4 9 -8 1 6
//Equilibrium index:4