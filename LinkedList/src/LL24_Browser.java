
class Node {
    String val;
    Node next;
    Node prev;

    Node(String v) {
        val = v;
        next = null;
        prev = null;
    }
}
public class LL24_Browser {
    Node head;
    Node tail;
    Node cur;

    public LL24_Browser(String homepage) {
        head = new Node(homepage);
        cur = head;
        tail = head;
    }
    
    public void visit(String url) {
        Node node = new Node(url);
        cur.next = node;
        node.prev = cur;
        tail = node;
        cur = node;
    }
    
    public String back(int steps) {
        for(int i = 0; i < steps && cur != null ; i++) {
            cur = cur.prev;
        }
        if(cur == null) {
            cur = head;
        }
        return cur.val;
    }
    
    public String forward(int steps) {
        for(int i = 0; i < steps && cur != null ; i++) {
            cur = cur.next;
        }
        if(cur == null) {
            cur = tail;
        }
        return cur.val;
    }
}

