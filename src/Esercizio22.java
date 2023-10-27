public class Esercizio22 {
    public static void main(String[] args) {
        int x = 5;
        scala(x);
    }

    public static int scala(int y) {
        for (int x = 1; x <= y; x++) {
            System.out.println("Valore: " + x);
            if (x == 5) {
                break;
            }
        }
        return y;
    }
}
