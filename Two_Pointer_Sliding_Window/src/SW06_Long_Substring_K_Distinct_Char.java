import java.util.*;

// https://www.geeksforgeeks.org/find-the-longest-substring-with-k-unique-characters-in-a-given-string/
public class SW06_Long_Substring_K_Distinct_Char {

	public static void main(String[] args) {
		String str = "aaabbccd";
		count(str, 2);
	}
	
	public static void count(String str, int k) {
		int l = 0;
		int r = 0;
		int len = 0;
		int maxLen = 0;
		HashMap<Character, Integer> map = new HashMap();
		
		while(r < str.length()) {
			char ch = str.charAt(r);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			} else {
				map.put(ch, 1);
			}
			
			while(map.size() > k) {
				char oldCh = str.charAt(l);
				map.put(ch, map.get(oldCh)-1);
				l++;
				if(map.get(oldCh) == 0) {
					map.remove(oldCh);
				}
			}
			
			
			if(map.size() <= k && l <= r) {
				len = r - l + 1;
				maxLen = Math.max(maxLen, len);
			}
			r++;
		}
		System.out.println(maxLen);
	}

}
