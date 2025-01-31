public class sudokuSolver {
    public static void main(String[] args) {
        int[][] sudokuMatrix = {
            {3, 0, 6, 5, 7, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 8, 6, 3, 0, 0}
        };
    }

    public static int[][] solvedSudoku(int[][]matrix){

        for (int i = 0; i < matrix.length; i++) {
            
        }
return new int[][];
    }

    public static boolean isPossible(int[][] matrix, int i,int j){
        // int flag = 0;
        // 1,3
        // check for row for same;

        for (int k = 0; k < matrix.length; k++) {
                if(matrix[i][j] == matrix[i][k]){
                    return false;
                }
            }
        
        
        // check for column for same;
        
        for (int k = 0; k < matrix.length; k++) {
                if(matrix[i][j] == matrix[k][j]){
                    return false;
                }
        }
        return true;
    }
}
