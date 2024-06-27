class Solution {
    public boolean isToeplitz(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        
        // Loop through each element except the last row and last column
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                // Compare current element with the next diagonal element
                if (mat[i][j] != mat[i + 1][j + 1]) {
                    return false;
                }
            }
        }
        
        // If no mismatches are found, return true
        return true;
    }
}
