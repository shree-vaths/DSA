
public class LL10_Remove_Middle {

	public static void main(String[] args) {
		LList l1 = new LList();
		l1.insert(1);
		l1.insert(2);
		l1.insert(3);
		l1.insert(4);
		l1.insert(5);
		l1.insert(6);

		middle(l1.head);
		
		l1.print();
	}
	
	public static void middle(LLNode head) {
		LLNode slow = head;
		LLNode fast = head;
		fast = fast.next.next;
		
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
	}

}
