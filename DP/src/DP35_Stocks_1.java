
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class DP35_Stocks_1 {

	public static void main(String[] args) {
		int[] arr = {7,1,5,3,6,4};
		
		stock(arr);
	}

	public static int stock(int[] arr) {
		int lowestVal = arr[0];
		int profit = 0;
		
		for(int i = 1; i < arr.length; i++) {
			int cost = arr[i] - lowestVal;
			profit = Math.max(profit, cost);
			lowestVal = Math.min(lowestVal, arr[i]);
		}
		
		return profit;
	}
}
