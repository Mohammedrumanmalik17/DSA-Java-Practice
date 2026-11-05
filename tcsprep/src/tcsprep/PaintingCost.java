package tcsprep;
import java.util.*;
public class PaintingCost {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int interior,exterior,i=0;
		float int_cost=18,ext_cost=12,cost=0,temp;
		interior=sc.nextInt();
		exterior=sc.nextInt();
		if(interior<0&&exterior<0) {
			System.out.println("Invalid Input");
		
		}
		
		else if(interior==0 || exterior==0) {
			System.out.println("Cost is 0.0INR");
			
		}
		
		else {
			for( i=0;i<interior;i++) {
				 temp=sc.nextFloat();
				 cost+=int_cost*temp;
			}
			for( i=0;i<exterior;i++) {
				 temp=sc.nextFloat();
				 cost+=ext_cost*temp;
		}
			
			
	}
	
		System.out.printf("Total estimated Cost is %.1fINR ",cost);
		
	}

}
