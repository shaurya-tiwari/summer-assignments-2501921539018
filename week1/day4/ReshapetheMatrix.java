package week1.day4;

public class ReshapetheMatrix {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if(n*m != r*c){
            return mat;
        }

        int[][] newmat= new int[r][c];
        int newrow =0;
        int newcol=0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) { 
                newmat[newrow][newcol]=mat[i][j];

                newcol = newcol+1;

                if (newcol==c) {
                    newrow = newrow+1;
                    newcol=0;
                }
            }
        }
        return newmat;
    }
    public static void main(String[] args) {
        
    }
}
