//package acc;
//
//public class EvenOddArray {
//	public static void main(String[] args) {
//		
//		int arr[]= {1,2,6,3,5,3};
//		
//		for(int a:arr) {
//			if(a%2!=0) {
//				System.out.print(a+",");
//			}
//			
//		}
//		for(int a:arr) {
//			if(a%2==0) {
//				System.out.print(a+",");
//			}
//			
//		}
//	}
//
//}
//optimal solution-->


package acc;

import java.util.ArrayList;
import java.util.List;
public class EvenOddArray {
	public static void main(String[] args) {
		
		int arr[]= {1,2,6,3,5,3};
		List<Integer>oddNumbers=new ArrayList<>();
		List<Integer>EvenNumbers = new ArrayList<>();
		
		for(int a:arr) {
			if(a%2!=0) {
				oddNumbers.add(a);
				
				
			}
			else {
				EvenNumbers.add(a);
			}
			
		}
//		for(int odd:oddNumbers) {
//			
//				System.out.print(odd+",");
//			
//			
//		}
//		for(int even:EvenNumbers) {
//			
//			System.out.print(even+",");
//		
//		
//	}
		for(int i=0;i<oddNumbers.size();i++) {
			System.out.print(oddNumbers.get(i));
			if(i<oddNumbers.size()-1) {
				System.out.print(",");
			}
			
		}
		System.out.print(",");
		for(int i=0;i<EvenNumbers.size();i++) {
			System.out.print(EvenNumbers.get(i));
			if(i<EvenNumbers.size()-1) {
				System.out.print(",");
			}
		}
	}

}
