
public class LL15_Rotate {

	public static void main(String[] args) {
		LList l1 = new LList();
		l1.insert(1);
		l1.insert(2);
		l1.insert(3);
		l1.insert(4);
		l1.insert(5);
		l1.insert(6);
		
		l1.head = rotate(l1.head, 5);
		
		l1.print();
	}
	
	public static LLNode rotate(LLNode head, int k) {
		int len = 1;
		LLNode tmp = head;
		while(tmp.next != null) {
			tmp = tmp.next;
			len++;
		}
		if(k % len == 0) {
			return head;
		}
		tmp.next = head;
		int m = k % len;
		int i = len - m -1;
		LLNode node = head;
		while(i > 0) {
			i--;
			node = node.next;
		}
		head = node.next;
		node.next = null;
		return head;
	}

}
