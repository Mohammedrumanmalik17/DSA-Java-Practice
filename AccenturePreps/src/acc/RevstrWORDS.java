package acc;

public class RevstrWORDS {
	public static void revWords(String s) {
		String []str=s.split(" ");
//		System.out.println(str[0]);
//		System.out.println(str[1]);
		System.out.println(str.length);
		for(int i=str.length-1;i>=0;i--) {
			if(i==0) {
				System.out.print(str[i]);
			}
			else {
				System.out.print(str[i]+" ");
			}
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		String input ="Hello World ruman malik";
//		String input ="Hello World";
		revWords(input);
	}

}
