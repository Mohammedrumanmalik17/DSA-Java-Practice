package tcsprep;
import java.util.*;
public class percntgNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE SENTENCES");
		String str = sc.nextLine();
		int count2=1,count1=0;
		int j=0;
		char [] s= {' ','n','o','t',' '};
		int i=0, len = str.length();
		for(i=0;i<len;i++) {
			if(str.charAt(i)==',') {
				count2++;
			}
		}
		for (i = 0; i < len; i++) {
            if (str.charAt(i) == s[j]) {
                j++;
                if (j == s.length) {
                    count1++;  // Found "not"
                    j = 0;    
                }
            } else {
                j = 0;  
            }
        }
			float res =((float)count1/count2)*100;
		System.out.println(res);
	}

}
