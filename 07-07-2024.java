class Solution {
    public ArrayList<Integer> Ancestors(Node root, int target) {
        ArrayList<Integer> ancestors = new ArrayList<>();
        findAllAncestors(root,target,ancestors);
        return ancestors;
    }
    boolean findAllAncestors(Node root,int target,ArrayList<Integer> ancestors){
        if(root==null)  return false;
        if(root.data==target)   return true;
        ancestors.add(0,root.data);
        if(findAllAncestors(root.left,target,ancestors))    return true;
        if(findAllAncestors(root.right,target,ancestors))   return true;
        ancestors.remove(0);
        return false;
    }
}
