public class Esercizio28 {
    public static void main(String[] args) {
        int[][] matrix = goMatrix(2, 3);

        System.out.println("Originale:");
        printMatrix(matrix);

        int[][] risultato = changeMatrix(matrix);
        System.out.println("Risultato:");
        printMatrix(risultato);
    }
    public static int[][] goMatrix(int x, int y) {
        int[][] number = new int[x][y];
        int n = 1;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                number[i][j] = n;
                n++;
            }
        }

            return number;
    }

    public static int[][] changeMatrix(int[][] number) {
        int x = number.length;
        int y = number[0].length;

        int[][] martrix1 = new int[y][x];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                martrix1[j][i] = number[i][j];
            }
        }
            return martrix1;
    }

    public static void printMatrix(int[][] number) {
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.printf(number[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}