
public class Dp25_Longest_Common_SubSeq {

	public static void main(String[] args) {
		String s1 = "adc";
		String s2 = "acde";
		
		int[][] dp = new int [s1.length()][s2.length()];
		for(int i = 0; i < s1.length(); i++) {
			for(int j = 0; j < s2.length(); j++) {
				dp[i][j] = -1;
			}
		}
		
		System.out.println(LCS(s1, s2, 0, 0, dp));
	}
	
	public static int LCS(String s1, String s2, int i, int j, int[][] dp) {
		if(i >= s1.length() || j >= s2.length()) {
			return 0;
		}
		
		if(dp[i][j] != -1) {
			return dp[i][j];
		}
		if(s1.charAt(i) == s2.charAt(j)) {
			dp[i][j] = 1 + LCS(s1, s2, i+1, j+1, dp);
			return dp[i][j];
		}
		
		
		int first = LCS(s1, s2, i+1, j, dp);
		
		int second = LCS(s1, s2, i, j+1, dp);
		
		dp[i][j] = 0 + Math.max(first, second);
		return dp[i][j];
	}

}
