class Solution {
    public boolean compute(Node root) {
        StringBuilder sb = new StringBuilder();
        while(root!=null){
            sb.append(root.data);
            root=root.next;
        }
        
        int l=0, r=sb.length()-1;
        while(l<r){
            if(sb.charAt(l)==sb.charAt(r)){
                l++;
                r--;
            }else{
                return false;
            }
        }
        
        return true;
    }
};
