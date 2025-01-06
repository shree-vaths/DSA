// https://leetcode.com/problems/cherry-pickup-ii/description/
public class DP13_CherryPick {

	public static void main(String[] args) {
		int[][] arr = {
			    {3, 1, 1},
			    {2, 5, 1},
			    {1, 5, 5},
			    {2, 1, 1}
			};
		System.out.println(path(arr, 0, 0, 2));
	}
	
	
	public static int path(int[][] arr, int i, int j1, int j2) {
		if(i >= arr.length || j1 < 0 || j2 < 0 || j1 >= arr[i].length || j2 >= arr[i].length) {
			return Integer.MIN_VALUE;
		}
		
		if(i == arr.length -1) {
			if(j1 == j2) {
				return arr[i][j1];
			} else {
				return arr[i][j1] + arr[i][j2];
			}
		}
		
		int max = Integer.MIN_VALUE;
		
		for(int index = -1; index < 2; index++) {
			for (int j = -1; j < 2; j++) {
				if(j1 == j2) {
					// Keep arr[i][j1] and arr[i][j2] inside max() else it will be added twice once in if and sometime in else
					max =  Math.max(max, arr[i][j1] + path(arr, i+1, j1 + index, j2+j));
				} else {
					max =  Math.max(max, arr[i][j1] + arr[i][j2] +path(arr, i+1, j1 + index, j2+j));				}
			}
		}
		
		System.out.println(max);
		return max;
	}

}
