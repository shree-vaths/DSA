
public class DP26_Long_Common_SubString {

	public static void main(String[] args) {
		String s1 = "eac";
		String s2 = "acd";
		
		int res = Integer.MIN_VALUE;
		String result = "";
		
		for(int i = 0; i < s1.length(); i++) {
			for(int j = 0; j < s2.length(); j++) {
				res = Math.max(res, substring(s1, s2, i,j));
			}
		}
		
		System.out.println(res);
		
		for(int i = 0; i < s1.length(); i++) {
			for(int j = 0; j < s2.length(); j++) {
				String s = substring2(s1, s2, i,j);
				if(s.length() >= result.length()) {
					result = s;
				}
			}
		}
		
		System.out.print(result);

	}
	
	public static int substring(String s1, String s2, int i, int j) {
		if(i >= s1.length() || j >= s2.length() || s1.charAt(i) != s2.charAt(j)) {
			return 0;
		}
		return 1 + substring(s1, s2, i+1, j+1);
	}
	
	public static String substring2(String s1, String s2, int i, int j) {
		if(i >= s1.length() || j >= s2.length() || s1.charAt(i) != s2.charAt(j)) {
			return "";
		}
		return "" + s1.charAt(i) + substring2(s1, s2, i+1, j+1);
	}

}
