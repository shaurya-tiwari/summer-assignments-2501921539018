package week1.day4;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        int top = 0;
        int bottom = matrix.length-1;

        int left = 0;
        int right = matrix[0].length-1;

        List<Integer> newarray = new ArrayList<>();

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                newarray.add(matrix[top][i]);
                
            }
            top++; // shofting position

            for (int j = top; j <= bottom; j++) {
                newarray.add(matrix[j][right]);
            }
            right--;
            if (top <= bottom) {
                for (int k = right; k >= left; k--) {
                    newarray.add(matrix[bottom][k]);
                }
                bottom--;
            }
            if (left <= right) {

                for (int l = bottom; l >= top; l--) {
                    newarray.add(matrix[l][left]);
                }
                left++;
            }

        }
        return newarray;

    }

    public static void main(String[] args) {
        SpiralMatrix SpiralMatrix = new SpiralMatrix();
        int[][] matrix = {
                { 1, 2, 3 }, // Row 0
                { 4, 5, 6 }, // Row 1
                { 7, 8, 9 } // Row 2
        };
        System.out.println(SpiralMatrix.spiralOrder(matrix));
    }
}
