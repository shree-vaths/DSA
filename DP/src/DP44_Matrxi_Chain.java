// https://www.geeksforgeeks.org/matrix-chain-multiplication-dp-8/
public class DP44_Matrxi_Chain {

	public static void main(String[] args) {
		int[] arr = {2,1,3,4};
		
		System.out.println(MCM(arr, 1, 3));
	}
	
	public static int MCM(int[] arr, int i, int j) {
		if(i == j) {
			return 0;
		}
		
		int min = Integer.MAX_VALUE;
		
		for(int k = i; k < j; k++) {
			int res = arr[i-1] * arr[k] * arr[j] + MCM(arr, i, k) + MCM(arr, k+1, j);
			min = Math.min(min, res);
		}
		
		return min;
	}

}
