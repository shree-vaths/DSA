
public class R06_Concept {

	public static void main(String[] args) {
		
	}
	
	/*
	 * Result is calculated while going down and its returned when base condition is hit
	 */
	public static int sumOfNo(int n, int sum) {
		if(n == 0) {
			return sum;
		}
		
		return sumOfNo(n-1, sum+n);
	}
	
	/*
	 * Result is calculated while coming back
	 */
	public static int factorial(int n) {
		if(n < 1) {
			return 1;
		}
		
		return n * factorial(n-1);
	}

}
