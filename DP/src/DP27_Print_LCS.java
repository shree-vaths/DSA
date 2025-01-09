
public class DP27_Print_LCS {

	public static void main(String[] args) {
		String s1 = "adc";
		String s2 = "acde";
		
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
