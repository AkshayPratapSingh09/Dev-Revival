public class MinimumPath {
    public static void main(String[] args) {
        int grid[][] = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int rows = grid.length;
        int columns = grid[0].length;
        System.out.println(helper(grid, 0, 0, columns, rows));
    }

    static int helper(int grid[][], int row, int column, int columns, int rows) {
        System.out.println("Traversing: " + row + " " + column);

        // Base case: if we are out of bounds, return a large value (effectively infinity)
        if (row >= rows || column >= columns) {
            return Integer.MAX_VALUE;
        }

        // Base case: if we have reached the bottom-right cell, return its value
        if (row == rows - 1 && column == columns - 1) {
            return grid[row][column];
        }

        // Recursively calculate the minimum path sum by moving either right or down
        int rightPath = helper(grid, row, column + 1, columns, rows);
        int downPath = helper(grid, row + 1, column, columns, rows);

        // Return the minimum of the two paths plus the current cell's value
        return grid[row][column] + Math.min(rightPath, downPath);
    }
}
