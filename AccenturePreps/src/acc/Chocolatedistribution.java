package acc;
import java.util.*;

public class Chocolatedistribution {
	
	static int chocolatedist(int A[],int N,int M) {
		
		
		if(N==0||M==00) {
			return 0;
		}
		if(N<M) {
			return -1;
		}
		
		Arrays.sort(A);
		int mini_diff= Integer.MAX_VALUE;
		
		for(int i=0;i+M-1<N;i++) {
			int diff=A[i+M-1]-A[i];
			if(diff<mini_diff) {
				mini_diff=diff;
			}
		}
		return mini_diff;
	}
	
	public static void main(String[] args) {
		
//		int N=8;
//		int A[]= {3,4,1,9,56,7,9,12};
//		
//		int M=5;
//		o/p->6;
		
		
		
		int N=7;
		int A[]= {1,2,3,4,5,6,7};
		
		int M=5;
		
//		o/p->4;
		
		System.out.println(chocolatedist(A,N,M));
		
	}

}
