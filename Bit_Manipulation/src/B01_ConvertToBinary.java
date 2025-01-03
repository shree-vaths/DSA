import java.util.Collections;

public class B01_ConvertToBinary {

	public static void main(String[] args) {
		int no = 6;
		String res = "";
		
		while(no != 0) {
			res = no % 2 + res;
			no = no / 2;
		}
		
		System.out.println(new StringBuilder(res).toString());
	}
}
