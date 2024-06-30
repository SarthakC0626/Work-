class Solution {
    public Node deleteNode(Node head, int x) {
        if (head == null || x <= 0) {
            return head; // no action needed for invalid position
        }
        
        Node current = head;
        
        // If head node itself holds the key to be deleted
        if (x == 1) {
            head = head.next; // Change head
            if (head != null) {
                head.prev = null; // Change prev of new head node to null
            }
            return head;
        }
        
        // Traverse to the node to be deleted
        for (int i = 1; current != null && i < x; i++) {
            current = current.next;
        }
        
        // If position is more than the number of nodes
        if (current == null) {
            return head;
        }
        
        // Node current is the node to be deleted
        if (current.next != null) {
            current.next.prev = current.prev;
        }
        
        if (current.prev != null) {
            current.prev.next = current.next;
        }
        
        return head;
    }
}
