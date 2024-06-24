class Solution {
    static long sumMatrix(long n, long q) {
        
        if(q<2 || q>n+n)    return 0;

        if(q<=n)    return q-1;
        if(q==n+1)  return q-1;
        
        long d = q-(n+1);
        return n-d;
        
    }
}
