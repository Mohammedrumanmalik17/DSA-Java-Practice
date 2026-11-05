package acc;
import java.util.*;

public class CountUniqueTriplets {
	
	public static int countUniqueTriplets(int []arr,int n,int m) {
		
		HashMap<Integer,Integer>occ = new HashMap<Integer,Integer>(n);
		
		for(int i=0;i<n;i++) {
			occ.put(arr[i], i);
		}
		
		int count =0;
		
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if((arr[i]*arr[j]<=m) &&(arr[i]*arr[j]!=0)&&(m%(arr[i]*arr[j])==0)) {
					int check =m/(arr[i]*arr[j]);
				
					if(check!=arr[i]&&check!=arr[j]&&occ.containsKey(check) &&occ.get(check)>j) {
						count++;
					}
				}
			}
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {
//		int arr[]= {5,3,20,10,1,4,2};
//		int m=60;-->3
		int arr[]= {9,18,2,1,4};
		int m=36;
		System.err.println(countUniqueTriplets(arr,arr.length,m));
		
	}

}
