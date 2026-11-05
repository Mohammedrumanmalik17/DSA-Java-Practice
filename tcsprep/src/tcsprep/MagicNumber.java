package tcsprep;
import java.util.*;

public class MagicNumber {
	public static int intMagic(int x,int n) {
		
		
		int magicnumber=0,power=0;
		while(x>0) {
			int digit=x%10;
			int new_digit=(digit+n)%10;
			magicnumber=(int) (magicnumber+new_digit*Math.pow(10, power));
			 x=x/10;
			 power++;
		}
		return magicnumber;
		
	}

	
	
	public static void main(String []args) {
		System.out.println(intMagic(328, 3));
		System.out.println(intMagic(2075, 5));
		System.out.println(intMagic(888, 2));
		
	}
}
