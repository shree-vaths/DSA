
public class B02_ConvertToDecimal {
	public static void main(String[] args) {
		String binValue = "0111";
		int length = binValue.length();
		int res = 0;
		int power = 1;
		
		for(int i = length - 1; i >= 0; i--) {
			char bit = binValue.charAt(i);
			if(bit == '1') {
				res = res + Integer.parseInt(""+bit) * power;
			}
			power *= 2;
		}
		
		System.out.println(res);
	}
}
