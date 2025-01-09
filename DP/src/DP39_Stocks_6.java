
public class DP39_Stocks_6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int stock(int[] arr, int i, boolean canBuy, int fees) {
		if(i >= arr.length) {
			return 0;
		}
		
		if(canBuy) {
			int buy = (- arr[i] + stock(arr, i+1, false, fees));
			int notBuy = 0 + stock(arr, i+1, true, fees);
			return Math.max(buy, notBuy);
		} else {
			int sell = arr[i] - fees + stock(arr, i+1, true, fees);
			int notSell = 0 + stock(arr, i+1, false, fees);
			return Math.max(sell, notSell);
		}
	}

}
