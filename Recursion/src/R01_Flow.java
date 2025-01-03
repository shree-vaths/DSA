
public class R01_Flow {

	public static void main(String[] args) {
		workDown(5);
		System.out.println();
		workUp(5);
	}
	
	/*
	 * Work is getting before we goto next iteration
	 */
	public static void workDown(int n) {
		if(n <= 0) {
			return;
		}
		System.out.print(n + " -> ");
		workDown(n-1);
	}
	
	/*
	 * Work is getting while coming come 
	 */
	public static void workUp(int n) {
		if(n <= 0) {
			return;
		}
		workUp(n-1);
		System.out.print(n + " -> ");
	}

}
