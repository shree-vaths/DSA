// cooldown period
public class DP38_Stocks_5 {
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
			int sell = arr[i] + stock(arr, i+2, true, transaction-1);
			int notSell = 0 + stock(arr, i+1, false, transaction);
			return Math.max(sell, notSell);
		}
	}
}
