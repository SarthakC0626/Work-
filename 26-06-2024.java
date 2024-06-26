class Solution {
    public int findCoverage(int[][] matrix) {
        int totalCoverage = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Directions array to navigate in four directions: left, right, up, down
        int[] dRow = {0, 0, -1, 1};
        int[] dCol = {-1, 1, 0, 0};

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    // Check all four directions
                    for (int d = 0; d < 4; d++) {
                        int newRow = i + dRow[d];
                        int newCol = j + dCol[d];

                        // Check if the adjacent cell is within bounds and is a 1
                        if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && matrix[newRow][newCol] == 1) {
                            totalCoverage++;
                        }
                    }
                }
            }
        }
        return totalCoverage;
    }
};
