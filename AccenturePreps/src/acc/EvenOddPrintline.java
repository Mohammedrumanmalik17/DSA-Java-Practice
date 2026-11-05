package acc;

public class EvenOddPrintline {
	
	public static void EvenOddsequence(int A[],int n) {
		
		for(int i=0;i<n;i++) {
			
			if(A[i]%2==0) {
				System.out.print("Even");
			}
			else {
				System.out.print("Odd");
			}
		}
		
	}
	
	
	
	
	
public static void main(String[] args) {
	int n=6;
	int A[]= {3,3,4,5,6,10};
	
	EvenOddsequence(A,n);
	
	
}
}
;
