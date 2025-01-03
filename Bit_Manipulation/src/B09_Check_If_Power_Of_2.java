
public class B09_Check_If_Power_Of_2 {

	public static void main(String[] args) {
		int a = 15;
		
		boolean res = (a & (a-1)) == 0 ? true : false;
		
		System.out.println(res);
	}

}
