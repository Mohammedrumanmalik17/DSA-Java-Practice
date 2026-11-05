package acc;

public class Swap2numbers {
	public static void SwapNumbers(int a ,int b) {
		
		
		System.out.println("Values of a and b before swapping " +a +" "+b);
		
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("Values of a and b after swapping " +a +" "+b);
	}
//	a=a+b;
//	b=a-b;
//	a=a-b;
//	System.out.println("Values of a and b after swapping " +a +" "+b);
//}
	
	
	
	public static void main(String[] args) {
		int a=5;
		int b=10;
		SwapNumbers(a,b);
	}

}
