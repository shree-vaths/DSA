
public class B06_Clear_ITH_Bit {

	public static void main(String[] args) {
		int a = 9;
		int bitPosition = 3;
		
		int res = a & (~(1 << (bitPosition - 1)));
		
		System.out.println(res);
	}

}
