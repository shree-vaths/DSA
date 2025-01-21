import java.util.*;

public class SW08_No_Substring_3_Char {

	public static void main(String[] args) {
		String str = "bbacba";
		count(str);
	}
	
	public static void count(String str) {
		int l = 0;
		int r = 0;
		int count = 0;
		HashMap<Character, Integer> map = new HashMap();
		map.put('a', -1);
		map.put('b', -1);
		map.put('c', -1);
		
		while(r < str.length()) {
			char ch = Character.toLowerCase(str.charAt(r));
			map.put(ch, r);
			if(map.get('a') != -1 && map.get('b') != -1 && map.get('c') != -1) {
				count = count + 1 + Math.min(map.get('a'), Math.min(map.get('b'), map.get('c')));
			}

			r++;
		}
		System.out.println(count);
		
	}

}
