class Solution {
    // Method to find all duplicate subtrees
    public List<Node> printAllDups(Node root) {
        List<Node> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        serialize(root, map, result);
        return result;
    }

    // Helper method to serialize each subtree
    private String serialize(Node node, Map<String, Integer> map, List<Node> result) {
        if (node == null) {
            return "#";
        }
        
        String serial = node.data + "," + serialize(node.left, map, result) + "," + serialize(node.right, map, result);
        
        map.put(serial, map.getOrDefault(serial, 0) + 1);
        
        if (map.get(serial) == 2) { // Only add the first duplicate instance
            result.add(node);
        }
        
        return serial;
    }
}
