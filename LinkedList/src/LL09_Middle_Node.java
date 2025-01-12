// O(N/2)
public class LL09_Middle_Node {

	public static void main(String[] args) {
		LList l1 = new LList();
		l1.insert(1);
		l1.insert(2);
		l1.insert(3);
		l1.insert(4);
		l1.insert(5);
		l1.insert(6);

		
		System.out.println(middle(l1.head).data);
	}
	
	public static LLNode middle(LLNode head) {
		LLNode slow = head;
		LLNode fast = head;
		
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		
		return slow;
	}

}
