package acc;
import java.util.*;
public class ReboundHeight {
	public static void main(String[] args) {
		

		Scanner sc= new Scanner(System.in);
		
		int H = sc.nextInt();
		int v = sc.nextInt();
		int Vn = sc.nextInt();
				
		int e =(int) Math.pow(v/Vn, 2);
		
		int Height = H*e;
		System.out.println(Height);
	}

}

//10 
//20 
//5
//160

//16
//5
//5
//16

