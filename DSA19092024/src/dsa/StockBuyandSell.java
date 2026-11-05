package dsa;

public class StockBuyandSell {
	
	//best time to buy and sell stocks to gain maximum profit
	//note you can buy and sell stock only once
	//note in order to sell you need to buy it first(no selling first and the buying).
	
	public static int beststockstobuy(int []prices) {
		
		int minimum=prices[0];
		int profit=0;
		
		for(int i=1;i<prices.length;i++) {
			int cost =prices[i]-minimum;
			profit =Math.max(profit, cost);
			minimum=Math.min(minimum, prices[i]);
		}
		return profit;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		int []prices= {7,1,3,4,5,6};
		
		System.out.println(beststockstobuy(prices));
	}

}
