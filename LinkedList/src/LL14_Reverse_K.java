// O(N)
public class LL14_Reverse_K {

	public static void main(String[] args) {
		LList l1 = new LList();
		l1.insert(1);
		l1.insert(2);
		l1.insert(3);
		l1.insert(4);
		l1.insert(5);
		l1.insert(6);
		
		l1.head = reverseK(l1.head, 2);
		
		l1.print();
		
	}
	
	public static LLNode reverse(LLNode head) {
		LLNode prev = null;
		LLNode cur = head;
		LLNode next = head.next;
		
		while(cur != null) {
			cur.next = prev;
			prev = cur;
			cur = next;
			next = next != null ? next.next : null;
		}
		return prev;
	}
	
	public static LLNode reverseK(LLNode head, int k) {
		LLNode tmp =head;
		LLNode nextChain = null;
		LLNode prevChain = null;
		LLNode kthNode = null;
		LLNode newHead = null;
		while(tmp != null) {
			LLNode node = tmp;
			kthNode = findKNode(node, k);
			if(kthNode == null) {
				if(prevChain != null) {
					prevChain.next = tmp;
				}
				break;
			} else {
				nextChain = kthNode.next;
				kthNode.next = null;
				LLNode Head = reverse(tmp);
				if(prevChain != null) {
					prevChain.next = kthNode;
				}
				if(tmp == head) {
					newHead = Head;
				}
				prevChain = tmp;
				tmp = nextChain;
			}
		}
		return newHead;
	}

	private static LLNode findKNode(LLNode tmp, int k) {
		for(int i = 0; i < k-1; i++) {
			tmp = tmp != null ? tmp.next : null;
		}
		return tmp;
	}

}
