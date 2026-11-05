package tcsprep;
import java.util.Arrays;
import java.util.Scanner;;
public class NthSmallestElementInArray {
	public static int NthSmallest(int[]arr,int n) {
		
		int []sortedArray =Arrays.copyOf(arr, arr.length);
		Arrays.sort(sortedArray);
		return sortedArray[n-1];
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x=sc.nextInt();
		int arr[]=new int[x];
		for(int i=0;i<x;i++) {
			arr[i]=sc.nextInt();
		}
		int n = sc.nextInt();
		int result=NthSmallest(arr, n);
		System.out.println(result);
	}

}
