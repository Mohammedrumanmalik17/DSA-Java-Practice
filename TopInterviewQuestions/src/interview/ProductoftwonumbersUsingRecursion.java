package interview;

public class ProductoftwonumbersUsingRecursion {
	public static int product(int a,int b) {
		if(b==0) {
			return 0;
		}
		if(b<0) {
			return -product(a,-b);
		}
		return a+product(a,b-1);
	}
	
	
	public static void main(String[] args) {
//		int a =4;
//		int b=-3;
		
//		int a =48;
//		int b=15;
		
		
		int a =-5;
		int b=-4;
		System.out.println(product(a,b));
	}

}
