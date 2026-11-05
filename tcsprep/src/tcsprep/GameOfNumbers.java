package tcsprep;
import java.util.*;

public class GameOfNumbers {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n<0||n>1000000) {
			System.out.println("Wrong Input");
			return;
		
		}
		
		int arr[]=new int[10];
				
		for(int i =0;i<arr.length;i++) {
			arr[i]=9-i;
			
		}
		 if(n==0) {
			System.out.println(9);
			return;
		}
		else {int result=0;
		int power=1;
		while(n>0) {
			int rem=n%10;
			int replaced=arr[rem];
			result=result+replaced*power;
			power=power*10;
			n=n/10;
		}
		System.out.println(result);

}
	}
}