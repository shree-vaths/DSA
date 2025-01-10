
public class DP45_Palindrome_partition {

	public static void main(String[] args) {
		String str = "ababba";
		// This takes a partition at the end of string so we need to remove that.
		// If it was adding 1 extra partition in k iteration we need to substract k from ans
		System.out.println(count(str, 0) - 1);
	}
	
	public static int count(String str, int i) {
		if(i == str.length()) {
			return 0;
		}
		int min = Integer.MAX_VALUE;
		String tmp = "";

		for(int j = i; j < str.length(); j++) {
			tmp += str.charAt(j);
			
			if(isPalindrome(tmp)) {
				int res = 1 + count(str, j+1);
				min = Math.min(min, res);
			}
		}
		return min;
	}
	
	public static boolean isPalindrome(String str) {
		if(str.length() == 0) {
			return false;
		}
		if(str.length() == 1) {
			return true;
		}
		int i = 0;
		int j = str.length()-1;
		int n = str.length() / 2;
		boolean palindrome = true;
		
		while(i < j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
		
	}

}
