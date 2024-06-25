class Solution {
    int[][] rotateMatrix(int k, int mat[][]) {
        int n = mat.length, m=mat[0].length;
        k=k%m;
        for(int i[]:mat){
            rotate(i,m,k);
        }
        return mat;
    }
    void rotate(int a[],int m,int k){
        reverse(0,k-1,a);
        reverse(k,m-1,a);
        reverse(0,m-1,a);
    }
    void reverse(int i,int j,int a[]){
        while(i<j){
            int temp = a[i];
            a[i]=a[j];
            a[j]=temp;
            
            i++;
            j--;
        }
    }
}
