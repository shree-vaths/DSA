// https://leetcode.com/problems/distinct-subsequences/description/
public class DP32_Unique_SubSeq {

	public static void main(String[] args) {
		String s1 = "bag";
		String s2 = "babgbag";
		
		System.out.println(unique(s1, s2, 0,0));
	}
	
	public static int unique(String s1, String s2, int i, int j) {
		if(i == s1.length()) {
			return 1;
		}
		if(j == s2.length()) {
			return 0;
		}
		if(s1.charAt(i) == s2.charAt(j)) {
			int first = unique(s1, s2, i+1, j+1);
			int second = unique(s1, s2, i, j+1);
			return first + second;
		} 
		
		return unique(s1, s2, i, j+1);
	}

}
