import java.util.*;

public class B12_Power_Set {

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		List<List> ans = new ArrayList();
		int arrLength = nums.length;
		int length = 1 << arrLength;
		
		for(int digit = 0; digit < length; digit++) {
			
			List<Integer> subList = new ArrayList();
			
			for(int index = 0; index <= arrLength - 1; index++) {
				if((digit & (1 << index)) != 0) {
					subList.add(nums[index]);
				}
			}
			ans.add(new ArrayList(subList));
			subList.clear();
		}
		
		for(int m = 0; m < ans.size(); m++) {
			for(int n = 0; n < ans.get(m).size(); n++) {
				System.out.print(ans.get(m).get(n) + " ");
			}
			System.out.println();
		}

	}
	
	

}
