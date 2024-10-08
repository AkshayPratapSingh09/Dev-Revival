import java.util.*;

public class KnightTour {
public static void main(String[] args) {
    
    int n = 8;
    int[][] grid = new int[n][n];

    // Makes the grid
    for(int i=0; i<n; i++){
    for(int j=0; j<n; j++){
        grid[i][j] = -1;
    }
    }
    grid[0][0] = 1;

    boolean ans = solve(grid, 0, 0, 1, n);
    System.out.println(ans);
   if(ans){
    for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.print(grid[i][j]+" ");
    }
    System.out.println();
    }
   }
    

}

public static boolean isSafe(int x, int y,int n, int grid[][])
{
    return (x >= 0 && x < n && y >= 0 && y < n
            && grid[x][y] == -1);
}


static boolean solve(int[][] grid, int i, int j, int ithMove, int n){
    int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
    int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

    if (ithMove == n*n){
        return true;
    }

    for (int k = 0; k < 8; k++) {
        int nextI = i + xMove[k];
        int nextJ = j + yMove[k];

        if (isSafe(nextI, nextJ, n, grid)){
            grid[nextI][nextJ] = ithMove + 1;
            
            if(solve(grid, nextI, nextJ, ithMove+1, n)){
                return true;
            } else {
                grid[nextI][nextJ] = -1;
            }
        }
    }
    return false;
}

}

