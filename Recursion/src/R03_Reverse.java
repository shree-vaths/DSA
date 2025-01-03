
public class R03_Reverse {

	public static void main(String[] args) {
		System.out.println(reverse(1824));
	}
	
	/*
	 * Return result while coming back as aggregation
	 */
	public static int reverse(int no) {
		if(no == 0) {
			return 0;
		}
		
		return (int) (((no % 10) * Math.pow(10, String.valueOf(no).length() - 1)) + reverse(no/10));
	}

}
