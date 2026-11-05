package acc;
import java.util.*;

public class FindNoOFONbulbs {
	static int countNOOFBulb(int bulbs) {
		return (int) Math.sqrt(bulbs);
	}

	
	public static void main(String[] args) {
		
		int n=5;
		int ans =countNOOFBulb(n);
		System.out.println(ans);
		
	}
}
//o/p->2;

//the solution is the number of perect square till n;
//for example if n =3;->nymber of perfect squares =1={1};
//if n=16 psquares ={1,4,9,16} so answer is 4;
//if n=5 psquares= {1,4} ans =2;