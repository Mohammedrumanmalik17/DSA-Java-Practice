package tcsprep;
import java.util.*;

public class SmartlyAffixingZeroes {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m=sc.nextInt();
		int n=sc.nextInt();
		if(m<n) {
		
		for(int i=m;i<=n;i++) {
			if(n>=100) {
				System.out.printf("%03d ",i);
			}
			else if(n>=10) {
				System.out.printf("%02d ",i);
			}
			else {
				System.out.print(i);
			}
		}
	}
		else{
			System.out.println("Invalid: M value should be less than N");
			
		}

}
}