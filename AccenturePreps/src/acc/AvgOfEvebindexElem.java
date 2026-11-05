package acc;

public class AvgOfEvebindexElem {
	public static int avgofevenindexelem(int arr[],int n) {
		int sum=0;

        int idx=0;
	    int avg=0;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				sum+=arr[i];
				idx++;
			
			
				
				
			}
			 avg=sum/idx;
		
			 
		}
		return   avg;
	}
	
	
	
	public static void main(String[] args) {
		
//		int n =5;
//		int arr[]= {3,6,8,5,4};
		int n =7;
		int arr[]= {4,5,6,7,8,3,2};
		System.out.println(avgofevenindexelem(arr,n));
	}

}
