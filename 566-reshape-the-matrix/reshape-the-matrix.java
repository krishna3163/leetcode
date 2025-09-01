class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;

        // If reshape is not possible, return original
        if ((row * col) != (r * c)) return mat;

        int[][] outputarray = new int[r][c];
        int rownum = 0;
        int colnum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                outputarray[rownum][colnum] = mat[i][j];
                colnum++;

                // if column is full, move to next row
                if (colnum == c) {
                    colnum = 0;
                    rownum++;
                }
            }
        }
        return outputarray;
    }
}
