
public class R07_Reverse {

	public static void main(String[] args) {
		int[] arr = {4,5,6,7,8};
		rev(arr, 0);
		for(int val: arr) {
			System.out.print(val + " ");
		}
	}
	
	public static void rev(int[] arr, int i) {
		if(i >= arr.length/2) {
			return;
		}
		
		arr[i] = arr[i] ^ arr[arr.length -i -1];
		arr[arr.length - i -1] = arr[i] ^ arr[arr.length -i -1];
		arr[i] = arr[i] ^ arr[arr.length -i -1];
		
		rev(arr, i+1);

	}

}
