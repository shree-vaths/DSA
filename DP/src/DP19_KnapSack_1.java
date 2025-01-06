
public class DP19_KnapSack_1 {

	public static void main(String[] args) {
		int[] value = {30, 40, 50};
		int[] weight = {3,2,4};
		
		System.out.println(knapSack(value, weight, 0, 5));
	}
	
	
	public static int knapSack(int[] value, int[] weight, int i, int targetWeight) {
		if(i == value.length-1) {
			if(weight[i] <= targetWeight) {
				return value[i];
			} else {
				return 0;
			}
		}
		
		
		int notTake = 0 + knapSack(value, weight, i+1, targetWeight);
		int take = 0;
		
		if(weight[i] <= targetWeight) {
			take = value[i] + knapSack(value, weight, i+1, targetWeight - weight[i]);
		}
		
		return Math.max(notTake, take);
	}

}
