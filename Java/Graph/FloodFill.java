public class FloodFill {
    public static void main(String args[]){
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1;
        int sc = 1;
        int color = 2;
        int originalColor = image[sr][sc];
        int m = image.length;
        int n = image[0].length;

        // left  -> i-1,j
        // right  -> i+1,j
        // top  -> i,j-1
        // bottom  -> i+1,j+1

        dfs(image,sr,sc,originalColor,color,m,n);
        
        System.out.println(image);

    }

    public static void dfs(int[][] image, int i, int j, int originalColor, int newColor, int m, int n){
        if(i<0 || j<0 || i>=m || j>=n || image[i][j] == newColor || image[i][j] != originalColor) return;

        image[i][j] = newColor;

        dfs(image,i-1,j, originalColor, newColor,m,n);
        dfs(image,i+1,j, originalColor, newColor,m,n);
        dfs(image,i,j-1, originalColor, newColor,m,n);
        dfs(image,i,j+1, originalColor, newColor,m,n);
    }
}
