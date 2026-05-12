import java.util.*;

public class noOfIslland {
    public static void main(String args[]) {

        char[][] grid = {
                { '1', '1', '1', '1', '0' },
                { '1', '1', '0', '1', '0' },
                { '1', '1', '0', '0', '0' },
                { '0', '0', '0', '0', '0' }
        };

        int m = grid.length;
        int n = grid[0].length;
        boolean vis[][] = new boolean[m][n];

        int ans = 0;

        for(int i = 0; i<m;i++){
            for (int j=0; j<n;j++){
                if(!vis[i][j] && grid[i][j]=='1'){
                    solver(grid,vis,i,j);
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }

    public static void solver(char[][] grid,boolean[][] vis, int m, int n) {

        if (m < 0 || n < 0 || m >= grid.length || n >= grid[0].length || vis[m][n] || grid[m][n] !='1')
            return ;

        // left - > i,j-1
        // right - > i,j+1
        // up - > i-1,j
        // down - > i+1,j

        vis[m][n] = true;
        solver(grid, vis, m-1, n);
        solver(grid, vis, m+1, n);
        solver(grid, vis, m, n-1);
        solver(grid, vis, m, n+1);

    }
}
