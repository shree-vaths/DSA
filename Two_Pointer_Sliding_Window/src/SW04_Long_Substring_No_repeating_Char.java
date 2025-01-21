import java.util.*;

// O(N)
// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class SW04_Long_Substring_No_repeating_Char {

	public static void main(String[] args) {
		String str = "cabeac";
		count(str);
	}
	
	public static void count(String str) {
		HashMap<Character, Integer> map = new HashMap();
		
		int l = 0;
		int r = 0;
		int len = 0;
		int maxLen = 0;
		
		while(r < str.length()) {
			char ch = Character.toLowerCase(str.charAt(r));
			if(map.containsKey(ch)) {
				l = Math.max(l, map.get(ch)+1);
			}
			len = r - l + 1;
			maxLen = Math.max(len, maxLen);
			map.put(ch, r);
			r++;
		}
		System.out.println(maxLen);
	}

}
