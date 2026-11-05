package acc;
import java.util.*;

public class COUNTPERFECTSQUARESINANARRAY {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[]= new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		int count =0;
		for(int elem :array) {
			if((Math.sqrt(elem)*Math.sqrt(elem))==elem) {
				
				count++;
			}
		}
		System.out.println(count);
	}

}


//6
//64 16 38 81 50 100
//4

//
//3
//25 625 38
//2
