import java.util.Arrays;

public class Esercizio27 {
    public static void main(String[] args) {
        int[][] matrix = goMatrix();
        printMatrix(matrix);

        int sumMatrix = sumMatrix(matrix);
        System.out.println("La somma della prima riga è: " + sumMatrix);
    }

    public static int[][] goMatrix() {
        int[][] matrix= {{1, 2, 4,12},{8, 9, 5 ,55}};
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i=0; i< matrix.length; i++){
            //for (int j=0; j< matrix[i].length; j++){
                //System.out.println(matrix[i][j] );
           // }
            System.out.println(Arrays.toString(matrix [i]));
        }
    }

    public static int sumMatrix(int[][] matrix) {
        int sum=0;
        for (int j=0; j<matrix[0].length; j++){
            sum+= matrix[0][j];
        }
        return sum;
    }
}
