import java.util.*;

public class SW09_Long_Repeating_Character_Replacement {

	public static void main(String[] args) {
		String str = "aababba";
		count(str, 2);
	}
	
	public static void count(String str, int k) {
		int l = 0;
		int r = 0;
		int change = 0;
		int maxLen = 0;
		int maxFrequency = 0;
		HashMap<Character, Integer> map = new HashMap();
		
		while(r < str.length()) {
			char ch = str.charAt(r);
			int val = 0;
			if(map.containsKey(ch) == true) {
				val = map.get(ch)+1;
				map.put(ch, val);
			} else {
				val = 1;
				map.put(ch, val);
			}
			maxFrequency = Math.max(maxFrequency, val);
			change = (r - l + 1) - maxFrequency;
			
			while(change > k) {
				map.put(str.charAt(l), map.get(str.charAt(l))-1);
				maxFrequency = 0;
				for(int value : map.values()) {
					maxFrequency = Math.max(maxFrequency, value);
				}
				l++;
				change = (r - l + 1) - maxFrequency;
			}
			
			if(change <= k) {
				maxLen = Math.max(maxLen, r-l+1);
			}
			r++;
		}
		System.out.println(maxLen);
	}

}
