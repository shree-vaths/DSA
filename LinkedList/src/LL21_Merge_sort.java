
public class LL21_Merge_sort {

	public static void main(String[] args) {
		LList l1 = new LList();
		l1.insert(4);
		l1.insert(9);
		l1.insert(2);
		
		LLNode tmp = l1.head;
		while(tmp.next != null) {
			tmp = tmp.next;
		}
		
		l1.head = mergeSort(l1.head, tmp);
		l1.print();
	}
	
	public static LLNode mergeSort(LLNode start, LLNode end) {
		if(start == end) {
			return start;
		}
		
		LLNode middle = findMiddle(start, end);
		LLNode nextStart = middle.next;
		middle.next = null;
		
		LLNode node1 = mergeSort(start, middle);
		LLNode node2 = mergeSort(nextStart, end);
		
		LLNode newHead = merge(node1, node2);
		return newHead;
	}

	public static LLNode merge(LLNode h1, LLNode h2) {
		LLNode dummy = new LLNode(-1);
		LLNode tmp = dummy;
		LLNode t1 = h1;
		LLNode t2 = h2;
		
		while(t1 != null && t2 != null) {
			if(t1.data <= t2.data) {
				tmp.next = t1;
				t1 = t1.next;
				tmp = tmp.next;
			} else {
				tmp.next = t2;
				t2 = t2.next;
				tmp = tmp.next;
			}
		}
		
		if(t1 != null) {
			tmp.next = t1;
		}
		
		if(t2 != null) {
			tmp.next = t2;
		}
		
		return dummy.next;
	}
	private static LLNode findMiddle(LLNode start, LLNode end) {
		LLNode fast = start;
		LLNode slow = start;
		
		while(fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

}
