
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
public class DP36_Stock_2 {

	public static void main(String[] args) {
		int[] arr = {7,1,5,3,6,4};
		
		System.out.println(stock(arr, 0, true));
	}
	
	public static int stock(int[] arr, int i, boolean canBuy) {
		if(i >= arr.length) {
			return 0;
		}
		
		if(canBuy) {
			int buy = (- arr[i] + stock(arr, i+1, false));
			int notBuy = 0 + stock(arr, i+1, true);
			return Math.max(buy, notBuy);
		} else {
			int sell = arr[i] + stock(arr, i+1, true);
			int notSell = 0 + stock(arr, i+1, false);
			return Math.max(sell, notSell);
		}
	}

}
