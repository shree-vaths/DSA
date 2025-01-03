
public class B10_Count_Set_Bits {

	public static void main(String[] args) {
		int a = 13;
		int count = 0;
		
		while(a > 0) {
			a = (a & (a-1));
			count++;
		}
		
		System.out.println(count);
	}

}
