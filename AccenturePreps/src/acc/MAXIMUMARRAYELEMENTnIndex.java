package acc;
import java.util.*;
public class MAXIMUMARRAYELEMENTnIndex {
	 static void findMaxArrElem(int []arr,int n) {
		 int max=Integer.MIN_VALUE;
		 int maxIndex=0;
		 int i;
		 
		 for(i =0;i<n;i++) {
			 if(arr[i]>max) {
				 max=arr[i];
				  maxIndex=i;
			 }
			 
		 }
		 System.out.println(max+"\n"+maxIndex);
        
	 }
	
	public static void main(String[] args) {
		
//	
//				int n=7;
//		int arr[]= {1,2,3,4,5,6,7};
		int n =4;
		int arr[]= {23,45,82,71};
		
		findMaxArrElem(arr,n);
	}

}
