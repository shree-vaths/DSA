// O(N)

// Use hashmap to keep tract of visited nodes. Store entire node instead of data as data can be duplicate
public class LL12_Count_Loop {
	
	public static void main(String[] args) {
		LList l1 = new LList();
		l1.insert(1);
		l1.insert(2);
		l1.insert(3);
		l1.insert(4);
		l1.insert(5);
		l1.insert(6);
		
		LLNode six = l1.getNode(6);
		
		six.next = l1.getNode(1);

		
		System.out.println(countLoop(l1.head));
	}
	
	public static int countLoop(LLNode head) {
		LLNode slow = head;
		LLNode fast = head;
		
		
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			
			if(slow == fast) {
				int count= 1;
				LLNode tmp = fast;
				tmp = tmp.next;
				while(tmp != slow) {
					tmp = tmp.next;
					count++;
				}
				return count;
			}
		}
		
		return 0;
	}

}
