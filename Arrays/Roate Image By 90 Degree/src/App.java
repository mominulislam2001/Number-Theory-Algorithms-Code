public class App {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
             
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }
    }
    public static void main(String[] args) throws Exception {

         //  Step 1 - Transpose the matrix
         //  Step 2 - Rotate Each Row

       
    }
}
