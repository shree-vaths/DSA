
public class R02_Sum_Of_Digits {

	public static void main(String[] args) {
		System.out.println(sum(1824));
	}
	
	/*
	 * Return result while coming back as aggregation
	 */
	public static int sum(int no) {
		if(no == 0) {
			return 0;
		}
		
		return (no % 10) + sum(no/10);
	}


}
