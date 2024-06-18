class Solution {
    int rectanglesInCircle(int r) {
        
        int ans=0;
        for(int i=1;i<=2*r;i++){
            for(int j=1;j<=2*r;j++){
                double val = (double)Math.sqrt((i*i) + (j*j));
                if(val<=2*r)  ans++;
            }
        }
        
        return ans;
        
    }
};
