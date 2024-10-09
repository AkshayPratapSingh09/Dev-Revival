public class MinimumPath {
    public static void main(String[] args) {
        int grid[][] = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
        int rows = grid.length;
        int columns = grid[0].length;
        System.out.println(helper(grid, 0, 0, columns, rows));
    }

    static int helper(int grid[][], int row, int column, int columns, int rows) {
        
        
        if (row >= rows || column >= columns) {
            return Integer.MAX_VALUE;
        }

        
        if (row == rows - 1 && column == columns - 1) {
            return grid[row][column];
        }

        
        int rightPath = helper(grid, row, column + 1, columns, rows);
        int downPath = helper(grid, row + 1, column, columns, rows);


        return grid[row][column] + Math.min(rightPath, downPath);
    }
}
