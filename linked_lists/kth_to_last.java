import java.util.Hashtable;

public class Solution {
    public void kth_to_last(Node head, int k) {
        Node currentNode = head;
        int counter = 0;
        HashTable<Integer, Integer> table = new Hashtable<>();
        while (currentNode != null) {
            table.put(counter, currentNode.data);
            counter++;
            currentNode = currentNode.next;
        }
        return table.get(table.size() - k);
    }
    
}

// Iterative solution with two pointers
// p1 moves k nodes into the list
// p2 starts at beginning
// then we iterate until p1 is at end of list
// p2 will be at (length - k)th node = kth from last

public class Solution {
    public void kth_to_last(Node head, int k) {
        Node p1 = head;
        Node p2 = head;
        for (int i = 0; i < k; i++) {
            if (p1 == null) return null;
            p1 = p1.next;
        }
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
    
}

