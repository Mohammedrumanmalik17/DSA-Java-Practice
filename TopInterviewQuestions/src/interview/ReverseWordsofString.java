package interview;

public class ReverseWordsofString {
	public static void main(String[] args) {
		String str="HI MOHAMMED RUMAN MALIK Attikatti";
		StringBuilder rev=new StringBuilder();
		
		String S[]=str.trim().split("\\s+");
		
		for(int i=S.length-1;i>=0;i--) {
			if(i==S.length-1) {
				rev.append(S[i]+" ");
			}
			else {
				rev.append(S[i]+" ");
			}
		}
		System.out.println(rev.toString());
	}

}
