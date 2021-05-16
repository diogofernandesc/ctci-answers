import java.util.HashSet;

public class Solution {
    public void removeDuplicate(Node node) {
        HashSet<Integer> seenSet = new HashSet<>();
        Node previousNode = null;
        while (node != null) {
            if (seenSet.contains(node.data)) {
                previousNode.next = node.next;
            
            } else {
                seenSet.add(node.data);
                previousNode = node;
            }
            node = node.next;
        }
    }
    
}

// No buffer solution
public class Solution {
    public void removeDuplicate(Node head) {
        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (current.data == runner.next.data) {
                    current.next = runner.next.next;
                
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }
    
}
