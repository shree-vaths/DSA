
public class DP20_Coin_Change {

	public static void main(String[] args) {
		int[] arr = {1,2,5};
		System.out.println(count(arr, 0, 11));
	}
	
	
	public static int count(int[] arr, int i, int target) {
		if(i == arr.length-1) {
			if(target % arr[i] == 0) {
				return target / arr[i];
			} else {
				return -1;
			}
		}
		
		int notTake = 0 + count(arr, i+1, target);
		int take = -1;
		
		if(arr[i] <= target) {
			take = 1 + count(arr, i, target-arr[i]);
		}
		
		if(notTake == -1 && take == -1) {
			return -1;
		} else if(notTake == -1) {
			return take;
		} else if(take == -1) {
			return notTake;
		}
		return Math.min(notTake, take);
	}

}
