package matrixDiagonalSum;

public class MatrixDiagonalSum {
	public int diagonalSum(int[][] mat) {
	    int sum = 0;
	    for(int row = 0; row < mat[0].length; row++){
	        sum += mat[row][row]+ mat[row][mat[row].length - row-1];
	        if(mat[row].length % 2 == 1 && row == (mat[row].length)/2){
	                sum -= mat[mat.length /2][mat.length /2];
	        }
	    }
	    return sum;
	}
}
