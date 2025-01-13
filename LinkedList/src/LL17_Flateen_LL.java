// O(N^3)
public class LL17_Flateen_LL {

	public static void main(String[] args) {
		
	}
	
	public static LLNode merge(LLNode head) {
		LLNode tmp = head;
		LLNode newHead = null;
		while(tmp != null && tmp.next != null) {
			if(tmp == head) {
				newHead = LL16_Merge.merge(tmp.next, tmp.next.next);
			} else {
				newHead = LL16_Merge.merge(newHead, tmp.next);
			}
		}
		return newHead;
	}
	

}
