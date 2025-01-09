// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/description/
public class DP37_Stocks_4 {

	public static void main(String[] args) {
		int[]arr = {7,1,3};
		int k = 2;
		int[][][]dp = new int[arr.length][2][k];
	}
	
	public static int stock(int[] arr, int i, boolean canBuy, int transaction) {
		if(transaction == 0) {
			return 0;
		}
		if(i >= arr.length) {
			return 0;
		}
		
		if(canBuy) {
			int buy = (- arr[i] + stock(arr, i+1, false, transaction));
			int notBuy = 0 + stock(arr, i+1, true, transaction);
			return Math.max(buy, notBuy);
		} else {
			int sell = arr[i] + stock(arr, i+1, true, transaction-1);
			int notSell = 0 + stock(arr, i+1, false, transaction);
			return Math.max(sell, notSell);
		}
	}

}
