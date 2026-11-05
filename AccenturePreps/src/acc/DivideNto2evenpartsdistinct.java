package acc;

public class DivideNto2evenpartsdistinct {
	
	public static boolean divNum(int n) {
		
		return n<=2?false:(n%2==0?true:false);
	}

	
	
	
	
	public static void main(String[] args) {
//		int n=6;
		//because 2+4=6;
//		int n=8;
		int n=5;
		System.out.println(divNum(n)?"Yes":"No");
	}
}
