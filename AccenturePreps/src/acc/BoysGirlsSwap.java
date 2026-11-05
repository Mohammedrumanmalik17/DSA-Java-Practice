package acc;

public class BoysGirlsSwap {
	
	
	public static void main(String[] args) {
		int n =5;
		int t=3;
		String s="BGGBG";
		char line[]=s.toCharArray();
		
		while(t>0) {
			for(int i=0;i<line.length-1;i++) {
				if(line[i]=='B'&&line[i+1]=='G') {
					char temp=line[i];
					line[i]=line[i+1];
					line[i+1]=temp;
					i++;
					t--;
				}
			}
		}
		System.out.println(new String(line));
	}

}
