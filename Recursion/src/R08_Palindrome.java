
public class R08_Palindrome {

	public static void main(String[] args) {
		
	}
	
	public static boolean palindrome(String str, int i) {
		if(i >= str.length() / 2) {
			return true;
		}
		
		return str.charAt(i) == str.charAt(str.length() - i - 1) && palindrome(str, i+1);
	}

}
