package acc;
import java.util.*;

public class QuadEqnRoots {
	
	public static void printroots(double a ,double b,double c) {
		
		if(a==0) {
		System.out.println("invalid");
			return;
		}

		double D=b*b-4.0*a*c;
		double x=0.0,y=0.0;
		if(D>0.0) {
			x=(-b+Math.sqrt(b*b-4*a*c))/(2.0*a);
			y=(-b-Math.sqrt(b*b-4*a*c))/(2.0*a);
			System.out.println(x);
			System.out.println(y);
		}
		else if(D==0.0) {
			x=y=-b/(2.0*a);
			System.out.println(x);
			System.out.println(y);
			
		}
		else {
			x=-b/(2.0*a);
			y=Math.sqrt(-D)/(2.0*a);
			System.out.println(x+"+"+y+"i");
			System.out.println(x+"+"+y+"i");
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		
		
		printroots(a,b,c);
		sc.close();
		
	}

}

//5
//2
//1
//-0.2+0.4i
//-0.2+0.4i



//5
//6
//1
//-0.2
//-1.0



//1
//-4
//4
//2.0
//2.0
