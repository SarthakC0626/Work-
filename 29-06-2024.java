public boolean areIdentical(Node head1, Node head2) {
        // Initialize pointers for both lists
        Node current1 = head1;
        Node current2 = head2;
        
        // Traverse both lists
        while (current1 != null && current2 != null) {
            // Compare data of both nodes
            if (current1.data != current2.data) {
                return false; // Data does not match
            }
            // Move to the next node in both lists
            current1 = current1.next;
            current2 = current2.next;
        }
        
        // Check if both lists have reached their end
        if (current1 == null && current2 == null) {
            return true; // Both lists are identical
        }
        
        return false; // Lists have different lengths
    }
}
