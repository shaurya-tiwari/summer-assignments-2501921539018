package week1.day4;
// formula = antidiagonal =matrix[i][n - 1 - i]
public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];

            if (i != mat.length - 1 - i) {
                sum += mat[i][mat.length - 1 - i];
            }

        }
        return sum;
    }

    public static void main(String[] args) {

        MatrixDiagonalSum MD = new MatrixDiagonalSum();
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println(MD.diagonalSum(arr));
    }

}
