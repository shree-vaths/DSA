
public class B11_No_Of_Bit_Flips {

	/*
	 * First do xor of a and b
	 * Count the no of ones in that result;
	 */
	public static void main(String[] args) {
		int a = 3;
		int b = 1;
		
		int res = a ^ b;
		
		int count = 0;
		while(res > 0) {
			res = (res & (res-1));
			count++;
		}
		
		System.out.println(count);
	}

}
