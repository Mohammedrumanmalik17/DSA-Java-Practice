package acc;
import java.util.*;
public class MaxCandiesCountfromMoney {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int candies=sc.nextInt();
	int []price=new int[candies];
	for(int i=0;i<price.length;i++) {
		price[i]=sc.nextInt();
	}
	
	int Money =sc.nextInt();
	int CandiesCount=0;
	int []sortedPrices =Arrays.copyOf(price, price.length);
			Arrays.sort(sortedPrices);
	for(int i=1;i<=sortedPrices.length;i++) {
		
		
		if(sortedPrices[i-1]%5==0) {
			CandiesCount++;
		}
		else if(Money>sortedPrices[i-1]){
			CandiesCount++;
			Money-=sortedPrices[i-1];
			
		}
	}
	System.out.println(CandiesCount);
}
}
//6
//4 5 7 2 15 20
//7
//5
