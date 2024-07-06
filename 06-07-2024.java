class Solution {
    Node prev;
    public void populateNext(Node root) {
        prev=null;
        inOrder(root);
    }
    void inOrder(Node root){
        if(root==null)  return;
        inOrder(root.left);
        if(prev!=null)  prev.next=root;
        prev=root;
        inOrder(root.right);
    }
}
