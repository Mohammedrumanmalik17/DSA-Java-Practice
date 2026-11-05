package tcsprep;
import java.util.*;
public class SumofNmult {
	public static void main(String[] args) {
		int num =10;
		int result=0;
		for(int i=1;i<=num;i++) {
			result+=num*i;
		}
		System.out.println("Sum of " + num +  " multiples of " +num+ " is = "  +result);
	}
	

}
