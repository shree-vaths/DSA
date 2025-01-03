
public class B04_If_ITH_Set {

	public static void main(String[] args) {
		int a = 13;
		int bitPosition = 2;
		
		int val = a & (1 << (bitPosition-1));
		
		boolean res = val == 0 ? false : true;
		
		System.out.println(res);
	}

}
