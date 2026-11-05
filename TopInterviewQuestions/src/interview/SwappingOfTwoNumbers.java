package interview;

public class SwappingOfTwoNumbers {
	
	public static void usingTemp(int a,int b) {
		
		System.out.println("Before Swapping");
		System.out.print("a = " +a+ " b = " +b);
		System.out.println();
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping");
		System.out.print("a = " + a+ " b = " +b);
		
	}
	public static void usingAddition(int a,int b) {
		System.out.println();
		System.out.println("Before Swapping");
		System.out.print("a = " + a + " b = " +b);
		System.out.println();
		 a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping");
		System.out.print("a = " +a + " b = " +b);
		
		
		
	}
	public static void usingXor(int a,int b) {
		System.out.println();
		System.out.println("Before Swapping");
		System.out.print("a = " +a + " b = " +b);
		System.out.println();
		 a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping");
		System.out.print("a = " +a + " b = " +b);
		System.out.println();
		
	}
	
	
	
	
	public static void main(String[] args) {
		int a=5;
		int b=10;
		usingTemp(a,b);
		usingAddition(a,b);
		usingXor(a,b);
	}

}
