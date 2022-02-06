package Arrays.Questions;

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6}};
        int[][] newMatrix = rotateMatrix(matrix);
        
        System.out.println(Arrays.deepToString(newMatrix));
        
   } 
   
   public static int[][] rotateMatrix(int[][] matrix) {
       int[][] newMatrix = new int[matrix[0].length][matrix.length];

       for (int i = 0; i < matrix[0].length; i++){
           for (int j = 0; j < matrix.length; j++){
               newMatrix[i][j] = matrix[j][i];
           }
       }

       for (int k = 0; k < newMatrix.length; k++){
           for (int l = 0; l < newMatrix[k].length/2; l++) {
               int temp = newMatrix[k][l];
               newMatrix[k][l] = newMatrix[k][newMatrix[k].length - l - 1];
               newMatrix[k][newMatrix[k].length - l - 1] = temp;
           }
       }

       return newMatrix;

   }

}