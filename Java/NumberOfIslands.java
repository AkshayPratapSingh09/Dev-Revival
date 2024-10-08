public class NumberOfIslands {
    public static void main(String[] args) {
        
        int[][] land = {
            {1,1,1,0,0},
            {1,1,0,1,0},
            {1,1,0,0,0},
            {0,0,0,1,1},
    };

    System.out.println(numIslands(land));


    }

    public static int numIslands(int[][] grid) {
        int count = 0;
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 1){
                    solve(grid,i,j);
                    count++;
                }
            }
        }
        
        return count;
    }

    public static void solve(int grid[][], int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>= grid[i].length || grid[i][j] == 0 || grid[i][j] == 2){
                return;
        }

        grid[i][j] = 2;

        solve(grid,i-1,j);
        solve(grid,i+1,j);
        solve(grid,i,j-1);
        solve(grid,i,j+1);
    }
}
