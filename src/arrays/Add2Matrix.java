package arrays;

import java.util.Arrays;

public class Add2Matrix {
    public static void main(String[] args) {
        int[][] matrix1={{1,2,3},{4,5,6},{5,7,9}};
        int[][] matrix2={{4,5,6},{1,8,4},{6,4,2}};
        int rows=matrix1.length;
        int cols= matrix1[0].length;
        int [][] result=new int[rows][cols];
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                result[i][j]=matrix1[i][j] +matrix2[i][j];
            }
        }
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();
    }

}
}
