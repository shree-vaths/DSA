
public class R04_Count_Zero {

	public static void main(String[] args) {
		System.out.println(count(30204, 0));
	}
	
	/*
	 * Keep o calculating the answer till end, return answer at the end
	 */
	public static int count(int no, int count) {
		if(no == 0) {
			return count;
		}
		
		int c = no % 10 == 0 ? count + 1 : count;
		
		return count(no/10, c);
	}

}
