
class cloneNode {
	int val;
	cloneNode next;
	cloneNode random;
	
	cloneNode(int v) {
		val = v;
		next = null;
		random = null;
	}
}
public class LL23_Clone {
	public cloneNode copyRandomList(cloneNode head) {
        cloneNode tmp = head;
        cloneNode root = new cloneNode(-1);
        cloneNode dummy = root;

        while(tmp != null) {
            cloneNode cloneNode = new cloneNode(tmp.val);
            cloneNode.next = tmp.next;
            tmp.next = cloneNode;
            tmp = tmp.next != null ? tmp.next.next : null;
        }

        tmp = head;
        while(tmp != null) {
            cloneNode copycloneNode = tmp.next;
            if(copycloneNode != null) {
                copycloneNode.random = tmp.random != null ? tmp.random.next : null;
            }
            tmp = tmp.next != null ? tmp.next.next : null;
        }
        
        tmp = head;
        while(tmp != null) {
            dummy.next = tmp.next;
            dummy = dummy.next;
            tmp.next = dummy.next;
            tmp = tmp.next;
        }
        return root.next;
    }
}


