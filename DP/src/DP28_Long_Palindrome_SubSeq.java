
// https://leetcode.com/problems/longest-palindromic-substring/description/
public class DP28_Long_Palindrome_SubSeq {

	public static void main(String[] args) {
		String s1 = "bbbab";
		
		StringBuilder res = new StringBuilder();

		char[] arr = s1.toCharArray();
		String s2 = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            s2 += arr[i];
        }
        
		System.out.println(LCS(s1, s2, 0, 0));
	}
	
	public static String LCS(String s1, String s2, int i, int j) {
		if(i >= s1.length() || j >= s2.length()) {
			return "";
		}
		
		if(s1.charAt(i) == s2.charAt(j)) {
			return s1.charAt(i) + LCS(s1, s2, i+1, j+1);
		}
		
		
		String str1 = LCS(s1, s2, i+1, j);
		
		String str2 = LCS(s1, s2, i, j+1);
		
		return (str1.length() >= str2.length() ? str1 : str2);
	}

}
