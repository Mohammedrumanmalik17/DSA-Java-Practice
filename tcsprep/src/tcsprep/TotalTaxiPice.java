package tcsprep;
import java.util.*;

public class TotalTaxiPice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cost,hours;
		int r1=sc.nextInt();
		int n=sc.nextInt();
		int r2=sc.nextInt();
		int x=sc.nextInt();
		
		hours=(x+59)/60;
		if(hours>n) {
			cost=n*r1+(hours-n)*r2;
			
		}
		else {
			cost=hours*r1;
		}
		System.out.println(cost);
	}

}
