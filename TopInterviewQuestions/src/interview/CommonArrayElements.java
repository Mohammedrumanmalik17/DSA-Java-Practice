package interview;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CommonArrayElements {
	public static void swapArrays(int []a1,int a2[]) {
		
		if(a1.length!=a2.length) {
			return;
		}
		else {
			
			for(int i=0;i<a1.length;i++) {
				int temp=a1[i];
				a1[i]=a2[i];
				a2[i]=temp;
			}
		}
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int []arr1= {4,2,3,1,6};
		int []arr2= {6,7,8,4};
		
		List<Integer>commonElements=new ArrayList<>();
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]){
					commonElements.add(arr1[i]);
					
				}
			}
		}
		System.out.println(commonElements);
		
		
		
		int A1[]= {1,2,3};
		int A2[]= {4,5,6};
//		int A2[]= {4,5};
		swapArrays(A1,A2);
	}

}
