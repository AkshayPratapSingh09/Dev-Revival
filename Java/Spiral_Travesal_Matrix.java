import java.util.*;

public class Spiral_Travesal_Matrix {
    public static void main(String[] args) {
        int matrix[][] = { 
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 } 
            };

        List<Integer> res = new ArrayList<>();

        int rowMax = matrix.length;
        int colMax = matrix[0].length;

        int startRow = 0;
        int endRow = rowMax - 1;
        int startCol = 0;
        int endCol = colMax - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // First Row
            for (int j = startCol; j <= endCol; j++) {
                res.add(matrix[startRow][j]);
            }
            startRow += 1;
            // End Col
            for (int i = startRow; i <= endRow; i++) {
                res.add(matrix[i][endCol]);
            }

            endCol -= 1;
            if (startRow <= endRow) {

                // last Row
                for (int j = endCol; j >= startCol; j--) {
                    res.add(matrix[endRow][j]);
                }

                endRow -= 1;
            }

            if (startCol <= endCol) {

                // First Col
                for (int i = endRow; i >= startRow; i--) {
                    res.add(matrix[i][startCol]);
                }
                startCol += 1;
            }
        }
        System.out.println(res);

    }
}
