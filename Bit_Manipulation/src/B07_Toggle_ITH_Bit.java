
public class B07_Toggle_ITH_Bit {

	public static void main(String[] args) {
		int a = 13;
		int bitPosition = 2;
		
		int res = a ^ (1 << (bitPosition - 1));
		
		System.out.println(res);
	}

}
