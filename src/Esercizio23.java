public class Esercizio23 {
    public static void main(String[] args) {
        int x = 11;
        scala(x);
    }

    public static int scala(int y) {
        for (int x = 1; x <= y; x++) {
            if (x == 5) {
                continue;
            }
            System.out.println("Valore: " + x);
        }
        return y;
    }
}
