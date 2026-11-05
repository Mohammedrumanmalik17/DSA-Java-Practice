package interview;


public class StringTest {
	
	public static void main(String[] args) {
		
		String s="A man, a plan, a canal: Panama rum123".toLowerCase();
		
		System.out.println(s);
		
//		String []str=s.split(" ");
//		for(int i=0;i<str.length;i++) {
//			System.out.print(str[i]);
//		}
//		System.out.println();
		

		String cleaned =s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(cleaned);
	
		
	}

}
