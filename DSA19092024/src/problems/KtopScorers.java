package problems;
import java.util.Arrays;
import java.util.Collections;

public class KtopScorers {
	public static int findTopKscorers(int []scores,int k) {
		
//		Arrays.sort(scores);
//		System.out.println(Arrays.toString(scores));
		
		
//		int result=0;
//		for(int i=scores.length-1;i>=scores.length-k;i-- ) {
//			result+=scores[i];
//		}
		
//		
//		Arrays.sort(scores,Collections.reverseOrder());it only works for Integer objct not int[]
		
		
		Integer[] scoresobj=Arrays.stream(scores).boxed().toArray(Integer[]::new);
		Arrays.sort(scoresobj,Collections.reverseOrder());
		int result=0;
		if(k>scoresobj.length) {
			System.out.println("k is greater than number of scores");
		}
		else {
		for(int i=0;i<k;i++) {
			result+=scoresobj[i];
		}
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		
		int scores[]= {5,3,2,1,6,9};
		int k=2;
		
		int result =findTopKscorers(scores,k);
		System.out.println(result);
	}

}
