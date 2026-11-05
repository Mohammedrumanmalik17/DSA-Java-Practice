package dsa;

public class SubArrayBruteForce {
	public static void printsubarrays(int arr[]) {
		
		int totalSubarrayscount=0;
		
		for(int i=0;i<arr.length;i++) {
			
			int start=i;
			
			for(int j=i;j<arr.length;j++) {
				int end=j;
				
				for(int k=start;k<=end;k++) {
					
					System.out.print(arr[k]+" ");
			
				}
				totalSubarrayscount++;
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("Total number of subarrays :" +totalSubarrayscount);
		
		//formula =n(n+1)/2;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		int numbers[]= {2,4,6,8,10};
		
		printsubarrays(numbers);
	}

}
